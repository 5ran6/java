package com.ztm.algorithms.radixsort;

/**
 * Radix Sort
 * - Makes assumptions about the data
 * 
 * - Data must have same radix and width
 * 
 * - Because of this, data must be integers or strings
 * 
 * - Sort based on each individual digit or letter position
 * 
 * - Start at the rightmost position
 * 
 * - Must use a stable sort algorithm at each stage
 *
 * brunolima on Feb 1, 2021
 * 
 */

public class RadixSort {

	public static void main(String[] args) {

		int[] radixArray = { 4725, 4586, 1330, 8792, 1594, 5729 };
		
		radixSort(radixArray, 10, 4);
	
		printArray(radixArray);
	}
	
	public static void radixSort(int[] input, int radix, int width) {
		for (int i = 0; i < width; i++) {
			radixSingleSort(input, i, radix);
		}
	}

	public static void radixSingleSort(int[] input, int position, int radix) {
		int numItems = input.length;
		
		int[] countArray = new int[radix];
		
		for(int value: input) {
			countArray[getDigit(position, value, radix)]++;
		}
		
		// Adjust the count array
		for (int j = 1; j < radix; j++) {
			countArray[j] += countArray[j -1];
		}
		
		int[] temp = new int[numItems];
		
		for(int tempIndex = numItems - 1; tempIndex >= 0; tempIndex--) {
			temp[--countArray[getDigit(position, input[tempIndex], radix)]] = input[tempIndex];
		}
		
		for(int tempIndex = 0; tempIndex < numItems; tempIndex++) {
			input[tempIndex] = temp[tempIndex];
		}
		
	}
	
	public static int getDigit(int position, int value, int radix) {
		return value / (int) Math.pow(radix, position) % radix;
	}

	private static void printArray(int[] radixArray) {
		for (int i = 0; i < radixArray.length; i++) {
			if (i != radixArray.length - 1) {
				System.out.print(radixArray[i] + ", ");
			} else {
				System.out.print(radixArray[i]);
			}
		}
	}
	
	

}