package com.leetcode.arrays;

/**
 *
 * brunolima on Mar 24, 2021
 * 
 */

public class _1_ArrayDeletions {

	public static void main(String[] args) {
		// Declare an integer array of 10 elements
		int[] intArray = new int[10];

		// The array currently contains 0 elements
		int length = 0;

		System.out.println("Size array: " + length);
		
		// Add elements at the first 6 indexes of the Array
		for (int i = 0; i < 6; i++) {
			intArray[length] = i;
			length++;
		}
		
		System.out.println("Size array: " + length);

		// Deletion from the end is a simple as reducing the length of the arraty by 1.
		// length--;

		for (int i = 0; i < intArray.length; i++) {
			System.out.println("Index " + i + " contains " + intArray[i]);
		}

		System.out.println("===================");

		for (int i = 0; i < length; i++) {
			System.out.println("Index " + i + " contains " + intArray[i]);
		}

		System.out.println("===================");
		System.out.println("Deleting index 1");

		// Starting at index 1, we shift each element one position to the left.
	    // Shift each element one position to the left
//		for (int i = 1; i < length; i++) {
//			intArray[i - 1] = intArray[i];
//		}
		
		for (int i = 0; i < length ; i++) {
			intArray[i] = intArray[i + 1];
		}
		
		// Note that it's important to reduce the length of the array by 1.
		// Otherwise, we'll lose consistency of the size. This length
		// variable is the only thing controlling where new elements might
		// get added.
		--length;
		
		System.out.println("Size array: " + length);

		System.out.println("===================");

		for (int i = 0; i < length; i++) {
			System.out.println("Index " + i + " contains " + intArray[i]);
		}
	}

}
