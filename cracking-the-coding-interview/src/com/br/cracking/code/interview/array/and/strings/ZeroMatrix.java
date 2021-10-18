package com.br.cracking.code.interview.array.and.strings;

/**
 *
 * brunolima on Oct 15, 2021
 * 
 * 
 * Write an algorithm such that if an element in an MxN matrix is 0, its entire
 * row and column are set to 0.
 * 
 */

public class ZeroMatrix {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];

		processMatrix(matrix);
	}

	private static void processMatrix(int[][] matrix) {
		// Check if it a square
		if (matrix.length == 0 || matrix.length != matrix[0].length) {
			return;
		}

		fillMatrix(matrix);

		printMatrix(matrix);

		setZerosOnMatrix(matrix);

		printMatrix(matrix);
	}

	private static void setZerosOnMatrix(int[][] matrix) {
		boolean[] row = new boolean[matrix.length];
		boolean[] column = new boolean[matrix[0].length];

		// Store the row and column index with value 0;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix[0].length; j++) {
				if (matrix[i][j] == 0) {
					row[i] = true;
					column[i] = true;
				}
			}
		}

		// Nullify rows
		for (int i = 0; i < row.length; i++) {
			if (row[i]) {
				nullifyRow(matrix, i);
			}
		}

		// Nullify columns
		for (int j = 0; j < column.length; j++) {
			if (column[j]) {
				nullifyColumn(matrix, j);
			}
		}
	}

	private static void nullifyColumn(int[][] matrix, int col) {
		for (int i = 0; i < matrix.length; i++) {
			matrix[i][col] = 0;
		}
	}

	private static void nullifyRow(int[][] matrix, int row) {
		for (int i = 0; i < matrix[0].length; i++) {
			matrix[row][i] = 0;
		}

	}

	private static void fillMatrix(int[][] matrix) {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				matrix[i][j] = (int) (Math.random() * 9);
			}
		}
	}

	private static void printMatrix(int[][] matrix) {
		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				sb.append(matrix[i][j]);

				if (j + 1 != matrix.length) {
					sb.append(" - ");
				}
			}
			sb.append("\n");
		}

		System.out.println(sb.toString());
	}

}
