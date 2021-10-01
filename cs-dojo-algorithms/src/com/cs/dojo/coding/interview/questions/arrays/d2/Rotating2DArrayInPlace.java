package com.cs.dojo.coding.interview.questions.arrays.d2;

import java.util.Arrays;

/**
 *
 * brunolima on Sep 30, 2021
 * 
 */

public class Rotating2DArrayInPlace {

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

	private static int[][] rotate(int[][] a, int n) {
		// n/2 gives us floor(n/2)
		// and n/2 + n%2 give us ceiling (n/2)
		
		for (int i = 0; i < n / 2 + n % 2; i++) {
			for (int j = 0; j < n / 2; j++) {
				int [] tmp = new int[4];
				int currentI = i;
				int currentJ = j;
				
				for (int k = 0; k < tmp.length; k++) {
					tmp[k] = a[currentI][currentJ];
					int [] newCoordinates = rotateSub(currentI, currentJ, n);
					currentI = newCoordinates[0];
					currentJ = newCoordinates[1];
				}
				
				for (int k = 0; k < tmp.length; k++) {
					a[currentI][currentJ] = tmp[(k + 3) % 4];
					int [] newCoordinates = rotateSub(currentI, currentJ, n);
					currentI = newCoordinates[0];
					currentJ = newCoordinates[1];
				}
			}
		}
		
		System.out.println(Arrays.deepToString(a));
		
		return a;
	}

	private static int[] rotateSub(int currentI, int currentJ, int n) {
		int [] newCoordinates = new int[2];
		newCoordinates[0] = currentJ;
		newCoordinates[1] = n - 1 - currentI;
		return newCoordinates;
	}

}
