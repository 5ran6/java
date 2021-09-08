package com.ztm.algorithms.selectionsort;

import java.util.Arrays;

/**
*
* brunolima on Apr 27, 2021
* 
*/

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] array1 = { 100, 200, 10, 7, 5, 6, 3 };
		int[] array2 = { 1000, 2000, 100, 70, 50, 60, 30 };

		System.out.println(Arrays.toString(selectionSortV1(array1)));
		System.out.println(Arrays.toString(selectionSortV1(array2)));
	}

	// O(nˆ2)
	private static int[] selectionSortV1(int[] array) {
		for (int i = 0; i < array.length; i++) {
			// Set current index as minimum
			int min = i;
			int temp = array[i];
			
			for (int j = i + 1; j < array.length; j++) {
				if (array[j] < array[min]) {
					// Update minimum if current is lower that what we had previously
					min = j;
				}
			}
			
			array[i] = array[min];
			array[min] = temp;
			
			System.out.println(Arrays.toString(array));
			System.out.println("--------------------------------");
		}
		
		return array;
	}

}

