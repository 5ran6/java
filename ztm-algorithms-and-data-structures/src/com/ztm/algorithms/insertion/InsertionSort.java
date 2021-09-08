package com.ztm.algorithms.insertion;

import java.util.Arrays;

/**
 *
 * brunolima on Apr 27, 2021
 * 
 */

public class InsertionSort {

	public static void main(String[] args) {
		int[] input = { 99, 44, 6, 2, 1, 5, 63, 87, 289, 4, 0 };
		
		System.out.println("Ënd " + Arrays.toString(insertionSort(input)));
	}

	// O(nˆ2)
	private static int[] insertionSort(int[] input) {
		for (int i = 1 ; i < input.length; i++) {
			int element = input[i];
			
			int j;
			
			for ( j = i; j > 0  && input[j - 1] > element; j--) {
				input[j] = input[j - 1];
				System.out.println("j: " + j + " = " + Arrays.toString(input));
			}
			
			input[j] = element;
			System.out.println("i: " + i + " = " + Arrays.toString(input));
			System.out.println("----------------------------------------");
		}
		
		return input;
	}

}
