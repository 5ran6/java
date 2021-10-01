package com.cs.dojo.coding.interview.questions.arrays.d2;

import java.util.Arrays;

/**
 *
 * brunolima on Sep 29, 2021
 * 
 */

public class MineSweeper {

	public static void main(String[] args) {
		int[][] bombs1 = { { 0, 2 }, { 2, 0 } };
		mineSweeper(bombs1, 3, 3);
		System.out.println();
		// mineSweeper(bombs1, 3, 3) should return:
		// [[0, 1, -1],
		// [1, 2, 1],
		// [-1, 1, 0]]

		int[][] bombs2 = { { 0, 0 }, { 0, 1 }, { 1, 2 } };
		mineSweeper(bombs2, 3, 4);
		System.out.println();
		// mineSweeper(bombs2, 3, 4) should return:
		// [[-1, -1, 2, 1],
		// [2, 3, -1, 1],
		// [0, 1, 1, 1]]

		int[][] bombs3 = { { 1, 1 }, { 1, 2 }, { 2, 2 }, { 4, 3 } };
		mineSweeper(bombs3, 5, 5);
		System.out.println();
		// mineSweeper(bombs3, 5, 5) should return:
		// [[1, 2, 2, 1, 0],
		// [1, -1, -1, 2, 0],
		// [1, 3, -1, 2, 0],
		// [0, 1, 2, 2, 1],
		// [0, 0, 1, -1, 1]]
	}

	public static int[][] mineSweeper(int[][] bombs, int numRows, int numCols) {
		int[][] field = new int[numRows][numCols];
		
		System.out.println(Arrays.deepToString(field));
		
		for (int[] bomb: bombs) {
			System.out.println(Arrays.toString(bomb));
			int rowIndex = bomb[0];
			int colIndex = bomb[1];
			
			field[rowIndex][colIndex] = -1;
			
			for (int i = rowIndex - 1; i < rowIndex + 2; i++) {
				for (int j = colIndex - 1; j < colIndex + 2; j++) {
					if (0 <= i && i < numRows && 0 <= j && j < numCols && field[i][j] != -1) {
						field[i][j] += 1;
					}
				}
			}
			
		}
		
		System.out.println(Arrays.deepToString(field));
		
		
		return field;
	}

}
