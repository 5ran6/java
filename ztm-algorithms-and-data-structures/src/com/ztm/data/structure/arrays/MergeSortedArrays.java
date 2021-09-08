package com.ztm.data.structure.arrays;

/**
 *
 * brunolima on Apr 23, 2021
 * 
 */

public class MergeSortedArrays {

	public static void main(String[] args) {
		int[] input1 = { 0, 3, 4, 31 };
		int[] input2 = { 4, 6, 30 };

		int[] result = mergeSortedArrays(input1, input2);
		
		for (int item : result) {
			System.out.printf(item + " ");
		}
	}

	private static int[] mergeSortedArrays(int[] input1, int[] input2) {
		if (input1.length == 0) {
			return input2;
		} else if (input2.length == 0) {
			return input1;
		}

		int[] inputMerged = new int[input1.length + input2.length];

		int item1 = input1[0];
		int item2 = input2[0];
		int i = 1;
		int j = 1;
		int k = 0;

		while (item1 > Integer.MIN_VALUE && item2 > Integer.MIN_VALUE) {
			if (item1 < item2) {
				inputMerged[k] = item1;
				
				if (i < input1.length) {
					item1 = input1[i];
					i++;
				} else {
					item1 = Integer.MIN_VALUE;
				}
			} else {
				inputMerged[k] = item2;
				
				if (j < input2.length) {
					item2 = input2[j];
					j++;
				} else {
					item2 = Integer.MIN_VALUE;
				}
			}
			
			k++;
		}
		
		if (item1 > Integer.MIN_VALUE) {
			inputMerged[k] = item1;
		} else if (item2 > Integer.MIN_VALUE) {
			inputMerged[k] = item2;
		}
		
		return inputMerged;
	}

}
