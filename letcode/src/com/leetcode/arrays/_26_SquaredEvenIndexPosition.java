package com.leetcode.arrays;

/**
 *
 * brunolima on Mar 29, 2021
 * 
 */

public class _26_SquaredEvenIndexPosition {

	
	public static void main(String[] args) {
		int[] array = { 9, -2, -9, 11, 56, -12, -3 };
		
		squareEvenPosition(array);
		
		for (int i : array) {
			System.out.println(i);
		}
		
	}
	
	public static int[] squareEvenPosition(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (i % 2 == 0) array[i] *= array[i];
		}
		
		return array;
	}
	
	

}
