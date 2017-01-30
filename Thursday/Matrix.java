import java.util.Scanner;
public class Matrix {
	
	public static void main(String[] args) {
		Matrix test = new Matrix();
		test.printMatrix(test.generateMatrix(5,10));
	}

	public int[][] generateMatrix(int row, int col) {
		int[][] twoDimArr = new int[row][col];
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < col; j++) {
				twoDimArr[i][j] = i * j;
			}
		}
		return twoDimArr;
	}

	public void printMatrix(int[][] twoDimArr) {
		for (int i = 0; i < twoDimArr.length; i++) {
			for (int j = 0; j < twoDimArr[i].length; j++) {
				System.out.print(twoDimArr[i][j] + " ");
			}
			System.out.println();
		}
	}
}
