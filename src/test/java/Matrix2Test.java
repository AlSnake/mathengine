package test.java;

import main.java.Matrix1;
import main.java.Matrix2;

import static org.junit.jupiter.api.Assertions.*;

class Matrix2Test {
	private static Matrix1 matrix1;
	private static Matrix1 matrix2;
	private static int row;
	private static int col;
	private static int[][] matrices1;
	private static int[][] matrices2;

	@org.junit.jupiter.api.BeforeAll
	static void setup() {
		row = 3;
		col = 3;
		matrices1 = new int[row][col];
		matrices2 = new int[row][col];

		int j = 0;
		for(int r = 0; r < row; r++) {
			for(int c = 0; c < col; c++) {
				matrices1[r][c] = j;
				matrices2[r][c] = j++;
			}
		}
	}

	@org.junit.jupiter.api.BeforeEach
	void setupMatrix() {
		matrix1 = new Matrix1(matrices1, row, col);
		matrix2 = new Matrix1(matrices2, row, col);
	}

	@org.junit.jupiter.api.Test
	void add() {
		Matrix1 res = Matrix2.add(matrix1, matrix2, row, col);
		assertEquals(res.getARow(1)[0], 0);
		assertEquals(res.getARow(2)[0], 6);
		assertEquals(res.getARow(3)[2], 16);
	}

	@org.junit.jupiter.api.Test
	void subtract() {
		Matrix1 res = Matrix2.subtract(matrix1, matrix2, row, col);
		assertEquals(res.getARow(1)[0], 0);
		assertEquals(res.getARow(2)[0], 0);
		assertEquals(res.getARow(3)[2], 0);
	}

	@org.junit.jupiter.api.Test
	void multiply() {
		Matrix1 res = Matrix2.multiply(matrix1, matrix2);
		assertEquals(res.getARow(1)[0], 15);
		assertEquals(res.getARow(1)[1], 18);
	}
}
