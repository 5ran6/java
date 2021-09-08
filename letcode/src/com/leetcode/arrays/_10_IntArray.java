package com.leetcode.arrays;

/**
 *
 * brunolima on Mar 20, 2021
 * 
 */

public class _10_IntArray {

	public static void main(String[] args) {
		int[] array = new int[6];

		int length = 0;

		for (int i = 0; i < 3; i++) {
			array[i] = i * 1;
			length++;
		}
		
		for (int i : array) {
			System.out.println(i);
		}
		
		System.out.println("The Array has a capacity of " + array.length);
		System.out.println("The Array has a length of " + length);
		System.out.println("The hightest index on array: " + array[array.length - 1]);
	}

}
