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
    }

    @org.junit.jupiter.api.BeforeEach
    void setupMatrix() {
		int j = 0;
		for(int r = 0; r < row; r++) {
			for(int c = 0; c < col; c++) {
				matrices[r][c] = j++;
			}
		}

        matrix = new Matrix1(matrices, row, col);
    }

    @org.junit.jupiter.api.Test
    void switchRow() {
        matrix.switchRow(1, 2);
        assertArrayEquals(matrix.getARow(1), matrices[1]);
        assertArrayEquals(matrix.getARow(2), matrices[0]);
    }

    @org.junit.jupiter.api.Test
    void scaleRow() {
        int[] old = matrix.getARow(2).clone();
        int scalar = 2;
        matrix.scaleRow(2, scalar);
        assertEquals(matrix.getARow(2)[0], old[0] * scalar);
        assertEquals(matrix.getARow(2)[1], old[1] * scalar);
    }

    @org.junit.jupiter.api.Test
    void addRow() {
        int[] tmp = matrix.getARow(1).clone();
        int[] r2 = matrix.getARow(2);
        matrix.addRow(1, 2);
        assertEquals(matrix.getARow(1)[0], tmp[0] + r2[0]);
        assertEquals(matrix.getARow(1)[1], tmp[1] + r2[1]);
    }

	@org.junit.jupiter.api.Test
	void scale() {
		matrix.scale(3);
		assertEquals(matrix.getARow(1)[0], 0);
		assertEquals(matrix.getARow(1)[1], 3);
		assertEquals(matrix.getARow(2)[1], 12);
		assertEquals(matrix.getARow(3)[2], 24);
	}

	@org.junit.jupiter.api.Test
	void opposite() {
		matrix.opposite();
		assertEquals(matrix.getARow(1)[0], 0);
		assertEquals(matrix.getARow(1)[1], -1);
		assertEquals(matrix.getARow(2)[1], -4);
		assertEquals(matrix.getARow(3)[2], -8);
	}

	@org.junit.jupiter.api.Test
	void zero() {
		matrix.zero();
		assertEquals(matrix.getARow(1)[0], 0);
		assertEquals(matrix.getARow(1)[1], 0);
		assertEquals(matrix.getARow(2)[1], 0);
		assertEquals(matrix.getARow(3)[2], 0);
	}
}
