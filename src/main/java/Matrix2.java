package main.java;

public class Matrix2 {
	public static Matrix1 add(Matrix1 mat1, Matrix1 mat2, int row, int col) {
		int[][] result = new int[row][col];
		for(int r = 0; r < row; r++) {
			for(int c = 0; c < col; c++) {
				result[r][c] = mat1.getRow(r+1)[c] + mat2.getRow(r+1)[c];
			}
		}
		return new Matrix1(result, row, col);
	}

	public static Matrix1 subtract(Matrix1 mat1, Matrix1 mat2, int row, int col) {
		int[][] result = new int[row][col];
		for(int r = 0; r < row; r++) {
			for(int c = 0; c < col; c++) {
				result[r][c] = mat1.getRow(r+1)[c] - mat2.getRow(r+1)[c];
			}
		}
		return new Matrix1(result, row, col);
	}
}
