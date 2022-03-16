import main.java.Matrix1;
import main.java.Matrix2;
import main.java.Vec;
import main.java.Vec3;

import java.util.Arrays;

public class Main {
    public static void matrix1Sample() {
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


		// Scaler Multiplication
		matrix1.printMatrix();
		matrix1.scale(3);
		System.out.println("");
		matrix1.printMatrix();

		// Opposite
		matrix1.printMatrix();
		matrix1.opposite();
		System.out.println("");
		matrix1.printMatrix();

		// Zero
		matrix1.printMatrix();
		matrix1.zero();
		System.out.println("");
		matrix1.printMatrix();
    }

	public static void matrix2Sample() {
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

		// ADDITION
		matrix1.printMatrix();
		System.out.println("+");
		matrix2.printMatrix();
		System.out.println("=");
		Matrix1 res = Matrix2.add(matrix1, matrix2, row, col);
		res.printMatrix();

		// SUBTRACTION
		matrix1.printMatrix();
		System.out.println("-");
		matrix2.printMatrix();
		System.out.println("=");
		Matrix1 res2 = Matrix2.subtract(matrix1, matrix2, row, col);
		res2.printMatrix();

		// SUBTRACTION
		matrix1.printMatrix();
		System.out.println("*");
		matrix2.printMatrix();
		System.out.println("=");
		Matrix1 mulres = Matrix2.multiply(matrix1, matrix2);
		mulres.printMatrix();
	}

    public static void main(String[] args) {
		Vec3 vec = new Vec3(5, 5, 5);
		System.out.println(vec);

		// ADDITION
		vec.add(new Vec3(10, 10, 10));
		System.out.println(vec);

		// SUBTRACTION
		vec.subtract(new Vec3(5, 5, 5));
		System.out.println(vec);

		// SCALAR
		vec.scale(10);
		System.out.println(vec);
	}
}
