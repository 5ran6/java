package com.cs.dojo.coding.interview.questions.arrays.d2;

import java.util.Arrays;

/**
 *
 * brunolima on Sep 30, 2021
 * 
 */

public class Rotating2DArray {

	public static void main(String[] args) {
		int a1[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		rotate(a1, 3);
		// rotate(a1, 3) should return:
		// [[7, 4, 1],
		// [8, 5, 2],
		// [9, 6, 3]]

		int a2[][] = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 }, { 13, 14, 15, 16 } };
		rotate(a2, 4);
		// rotate(a2, 4) should return:
		// [[13, 9, 5, 1],
		// [14, 10, 6, 2],
		// [15, 11, 7, 3],
		// [16, 12, 8, 4]]

	}

	private static int [][] rotate(int[][] a, int n) { 
		int [][] rotated = new int[n][n];
		
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				rotated[j][n - 1 - i] = a[i][j];
			}
		}
		
		System.out.println(Arrays.deepToString(rotated));
		
		return rotated;
	}

}
