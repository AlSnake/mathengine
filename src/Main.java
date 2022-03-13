import main.java.Matrix1;

import java.util.Arrays;

public class Main {
    public void matrixSample() {
        int row = 3;
        int col = 3;
        int[][] matrix = new int[row][col];

        int j = 0;
        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                matrix[r][c] = j++;
            }
        }

        Matrix1 matrix1 = new Matrix1(matrix, row, col);

        matrix1.printMatrix();

        // switch operation
        matrix1.switchRow(1, 2);
        System.out.println("");
        matrix1.printMatrix();

        // scaler operation
        matrix1.scaleRow(2, 2);
        System.out.println("");
        matrix1.printMatrix();

        // addition operation
        matrix1.addRow(1, 2);
        System.out.println("");
        matrix1.printMatrix();
    }

    public static void main(String[] args) {
        int row = 3;
        int col = 3;
        int[][] matrix = new int[row][col];

        int j = 0;
        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
                matrix[r][c] = j++;
            }
        }

        Matrix1 matrix1 = new Matrix1(matrix, row, col);
        matrix1.printMatrix();
    }
}
