package com.ztm.algorithms.countingsort;

/**
*
* brunolima on Apr 27, 2021
* 
*/

public class CountingSort {

	public static void main(String[] args) {

		int[] input1 = { 2, 5, 9, 8, 2, 8, 7, 10, 4, 3 };
//		countingSort(input1, 1, 10);
		countingSortV2(input1);
		printArray(input1);

//		
		int[] input2 = { 2, 7, 8, 7, 7, 9, 1 };
//		countingSort(input2, 1, 9);
		countingSortV2(input2);
		printArray(input2);
		
		int[] input3 = { 4, 3, 1, 2, 4 };
//		countingSort(input3, 1, 4);
		countingSortV2(input3);
		printArray(input3);
//		
	}

	private static void printArray(int[] intArray) {
		for (int i = 0; i < intArray.length; i++) {
			if (i != intArray.length - 1) {
				System.out.print(intArray[i] + ", ");
			} else {
				System.out.print(intArray[i]);
			}
		}
		
		System.out.println("\n==================");
	}
	
	public static void countingSortV2(int[] input) {
		// Find the max value;
		int max = 0;
		int min = input[0];
		
		for (int i = 0; i < input.length; i++) {
			if (input[i] > max) {
				max = input[i];
			} else if (input[i] < min) {
				min = input[i];
			}
		}

//		System.out.println("Max value founded: " + max);
//		System.out.println("Min value founded: " + min);
		
		// Create an inputAux array  to counts the number of occurrences of each value, with size max value founded
//		int[] inputAux = new int[max];
		int[] inputAux = new int[(max - min) + 1];
		
//		System.out.println("Before: " + Arrays.toString(inputAux));
		
		// Add frequency values founded in inputAux
		for (int i = 0; i < input.length; i++) {
			inputAux[input[i] - min]++;
		}
		
//		System.out.println("After: " + Arrays.toString(inputAux));
		
		// Sort the input
		int k = 0;
		
		for (int i = min; i <= max; i++) {
			int l = i - min;
			
			while(inputAux[l] > 0) {
				input[k] = i;
				k++;
				inputAux[l]--;
			}
		}
	}

	public static void countingSort(int[] input, int min, int max) {
		// Create an aux array  to counts the number of occurrences of each value
//		int[] countArray = new int[(max - min) + 1];
		int[] countArray = new int[max + 1];
  		
		for (int i = 0; i < input.length; i++) {
			countArray[input[i] - min]++;
		}

		int j = 0;

		for (int i = min; i <= max; i++) {
			
			while(countArray[i - min] > 0) {
				input[j++] = i;
				countArray[i - min]--;
			}
			
		}
	}

}


