package main.java;

public class Matrix1 {
    private final int[][] data;
    private final int row;
    private final int col;

    public Matrix1(int[][] data, int row, int col) {
        this.data = data.clone();
        this.row = row;
        this.col = col;
    }

    // switch row positions (Rx <--> Ry)
    //row1 = 1, row2 = 2 (idx = 0)
    public void switchRow(int row1, int row2) {
        int tmp[] = data[row1-1]; //p to r1
        data[row1-1] = data[row2-1]; //r1 to r2
        data[row2-1] = tmp; // r2 back to r1
    }

    // multiple row by scaler (S * Rx -> Rx)
    public void scaleRow(int row, int scaler) {
        int tmp[] = data[row - 1];
        for(int i = 0; i < tmp.length; i++) {
            tmp[i] = tmp[i] * scaler;
        }
        data[row - 1] = tmp;
    }

    // sum of r1 + r2 = r1;
    // r1 + r2 -> r1
    public void addRow(int row1, int row2) {
        int r1[] = data[row1 - 1];
        int r2[] = data[row2 - 1];
        for(int i = 0; i < r1.length; i++) {
            r1[i] += r2[i];
        }
        data[row1-1] = r1;
    }

	public void scale(int scaler) {
		for(int r = 0; r < row; r++) {
			for(int c = 0; c < col; c++) {
				data[r][c] *= scaler;
			}
		}
	}

    public int[] getRow(int row) {
        return data[row-1];
    }

    public void printMatrix() {
        for(int r = 0; r < row; r++) {
            System.out.print("[");
            for(int c = 0; c < col; c++) {
                System.out.print(data[r][c]);
                if(c != col - 1)
                    System.out.print(",");
            }
            System.out.println("]");
        }
    }
}
