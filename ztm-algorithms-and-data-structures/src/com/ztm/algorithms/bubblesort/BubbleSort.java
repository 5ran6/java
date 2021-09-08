package com.ztm.algorithms.bubblesort;

import java.util.Arrays;

/**
 *
 * brunolima on Apr 27, 2021
 * 
 */

public class BubbleSort {

	public static void main(String[] args) {
		int[] array1 = { 100, 200, 10, 7, 5, 6, 3 };
		int[] array2 = { 1000, 2000, 100, 70, 50, 60, 30 };

//		System.out.println(Arrays.toString(bubbleSortV1(array1)));
//		System.out.println(Arrays.toString(bubbleSortV2(array2)));
		
		bubbleSortV1(array1);
		bubbleSortV2(array2);
	}

	// O(nˆ2)
	private static int[] bubbleSortV1(int[] input) {
		System.out.println("PRINT ARRAY BEFORE: " + Arrays.toString(input));
		
		for (int i = 0; i < input.length - 1; i++) {
			System.out.println("Value i ==> " + i);
			
			for (int j = 0; j < input.length - 1; j++) {
				System.out.println("Value j ==> " + j);
				if (input[j] > input[j + 1]) {
					int temp = input[j];
					input[j] = input[j + 1];
					input[j + 1] = temp;
				}
			}
			System.out.println(Arrays.toString(input));
			System.out.println("--------------------------------");
		}

		return input;
	}

	// O(nˆ2)
	private static int[] bubbleSortV2(int[] array) {
		int i = 0;

		while (i < array.length) {
			for (int j = 0; j < array.length - 1; j++) {
				if (array[j] > array[j + 1]) {
					int temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
//			System.out.println(Arrays.toString(array));
//			System.out.println("--------------------------------");

			i++;
		}

		return array;
	}

}
