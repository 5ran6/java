package com.leetcode.arrays;

/**
 *
 * brunolima on Mar 20, 2021
 * 
 */

public class _27_Squares {

	public static void main(String[] args) {
		int[] squareNumbers = new int[10];

		for (int i = 0; i < squareNumbers.length; i++) {
			squareNumbers[i] = (i + 1) * (i + 1);
		}

		for (int i = 0; i < squareNumbers.length; i++) {
			System.out.println("Num: " + (i + 1) + ", Square: " + squareNumbers[i]);
		}
	}

}
