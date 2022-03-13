package test.java;

import main.java.Matrix1;

import static org.junit.jupiter.api.Assertions.*;

class Matrix1Test {
    private static Matrix1 matrix;
    private static int row;
    private static int col;
    private static int[][] matrices;

    @org.junit.jupiter.api.BeforeAll
    static void setup() {
        row = 3;
        col = 3;
        matrices = new int[row][col];

        int j = 0;
        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                matrices[r][c] = j++;
            }
        }
    }

    @org.junit.jupiter.api.BeforeEach
    void setupMatrix() {
        matrix = new Matrix1(matrices, row, col);
    }

    @org.junit.jupiter.api.Test
    void switchRow() {
        matrix.switchRow(1, 2);
        assertArrayEquals(matrix.getRow(1), matrices[1]);
        assertArrayEquals(matrix.getRow(2), matrices[0]);
    }

    @org.junit.jupiter.api.Test
    void scaleRow() {
        int[] old = matrix.getRow(2).clone();
        int scaler = 2;
        matrix.scaleRow(2, scaler);
        assertEquals(matrix.getRow(2)[0], old[0] * scaler);
        assertEquals(matrix.getRow(2)[1], old[1] * scaler);
    }

    @org.junit.jupiter.api.Test
    void addRow() {
        int[] tmp = matrix.getRow(1).clone();
        int[] r2 = matrix.getRow(2);
        matrix.addRow(1, 2);
        assertEquals(matrix.getRow(1)[0], tmp[0] + r2[0]);
        assertEquals(matrix.getRow(1)[1], tmp[1] + r2[1]);
    }
}