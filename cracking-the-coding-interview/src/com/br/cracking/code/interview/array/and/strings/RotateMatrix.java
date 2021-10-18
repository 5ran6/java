package com.br.cracking.code.interview.array.and.strings;

/**
 *
 * brunolima on Oct 15, 2021
 * 
 * Given an image represented by an NxN matrix, where each pixel in the image is
 * 4 bytes, write a method to rotate the image by 90 degrees. Can you do this in
 * place?
 */

public class RotateMatrix {

	public static void main(String[] args) {
		int [][] matrix = new int[4][4];
		
		processMatrix(matrix);
	}

	private static void processMatrix(int[][] matrix) {
		// Check if it a square
		if (matrix.length == 0 || matrix.length != matrix[0].length) {
			return;
		}
		
		fillMatrix(matrix);
	
		printMatrix(matrix);

		rotateMatrix(matrix);
		
		printMatrix(matrix);
	}

	private static void rotateMatrix(int[][] matrix) {
		int m = matrix.length;
		
		for (int layer = 0; layer < m / 2; layer++) {
			int first = layer;
			int last = m - 1 - layer;
			
			for (int i = first; i < last; i++) {
				int offset = i - first;
				int top = matrix[first][i]; // save top
				
				// left -> top
				matrix[first][i] = matrix[last - offset][first];
				
				// bottom -> left 
				matrix[last - offset][first] = matrix[last][last - offset];
				
				// right -> bottom
				matrix[last][last - offset] = matrix[i][last];
				
				// top -> right
				matrix[i][last] = top;
			}
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
