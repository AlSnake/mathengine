import main.java.Matrix1;
import main.java.Matrix2;

import java.util.Arrays;

public class Main {
    public static void matrixSample() {
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
		int[][] matrices1 = new int[row][col];
		int[][] matrices2 = new int[row][col];

        int j = 0;
        for(int r = 0; r < row; r++) {
            for(int c = 0; c < col; c++) {
				matrices1[r][c] = j;
				matrices2[r][c] = j++;
            }
        }

		Matrix1 matrix1 = new Matrix1(matrices1, row, col);
		Matrix1 matrix2 = new Matrix1(matrices2, row, col);


//		// ADDITION
//		matrix1.printMatrix();
//		System.out.println("+");
//		matrix2.printMatrix();
//		System.out.println("=");
//		Matrix1 res = Matrix2.add(matrix1, matrix2, row, col);
//		res.printMatrix();

//		// SUBTRACTION
//		matrix1.printMatrix();
//		System.out.println("-");
//		matrix2.printMatrix();
//		System.out.println("=");
//		Matrix1 res2 = Matrix2.subtract(matrix1, matrix2, row, col);
//		res2.printMatrix();

//		// Scaler Multiplication
//		matrix1.printMatrix();
//		matrix1.scale(3);
//		System.out.println("");
//		matrix1.printMatrix();
	}
}
