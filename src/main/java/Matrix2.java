package main.java;

public class Matrix2 {
	public static Matrix1 add(Matrix1 mat1, Matrix1 mat2, int row, int col) {
		int[][] result = new int[row][col];
		for(int r = 0; r < row; r++) {
			for(int c = 0; c < col; c++) {
				result[r][c] = mat1.getARow(r+1)[c] + mat2.getARow(r+1)[c];
			}
		}
		return new Matrix1(result, row, col);
	}

	public static Matrix1 subtract(Matrix1 mat1, Matrix1 mat2, int row, int col) {
		int[][] result = new int[row][col];
		for(int r = 0; r < row; r++) {
			for(int c = 0; c < col; c++) {
				result[r][c] = mat1.getARow(r+1)[c] - mat2.getARow(r+1)[c];
			}
		}
		return new Matrix1(result, row, col);
	}

	public static Matrix1 multiply(Matrix1 mat1, Matrix1 mat2) {
		if(mat1.getCol() != mat2.getRow()) {
			System.out.println("Invalid Matrix Product");
			return null;
		}

		int rows1 = mat1.getRow();
		int cols1 = mat1.getCol();
		int cols2 = mat2.getCol();
		int product[][] = new int[rows1][cols2];

		for(int r = 0; r < rows1; r++) {
			for(int c = 0; c < cols2; c++) {
				for (int k = 0; k < cols1; k++) {
					product[r][c] += mat1.getARow(r + 1)[k] * mat2.getARow(k + 1)[c];
				}
			}
		}

		return new Matrix1(product, rows1, cols2);
	}
}
