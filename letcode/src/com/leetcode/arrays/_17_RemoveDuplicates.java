package com.leetcode.arrays;

/**
*
* brunolima on Mar 29, 2021
* 
*/

public class _17_RemoveDuplicates {
	
	public static void main(String[] args) {
		int[] array = { 0, 0, 1, 1, 1, 2, 2, 3, 3, 4 };
		
		System.out.print("Printing after: \n");
		for (int i : array) {
			System.out.print(i + ", ");
		}
		
		int[] result = copyWithRemovedDuplicates(array);

		System.out.print("\n\nPrinting before: \n");
		for (int i : result) {
			System.out.print(i + ", ");
		}
		
//		System.out.println(removeDuplicates(array));

	}
	
	public static int[] copyWithRemovedDuplicates(int[] array) {
		// Check for edge cases.
		if (array == null || array.length == 0) {
			return array;
		}

		// Count how many unique elements are in the array;
		int uniqueMembers = 0;

		for (int i = 0; i < array.length; i++) {

			// An element should be counted as unique if it's the first
			// element in the array, or is different to the one before it.
			if (i == 0 || array[i] != array[i - 1]) {
				uniqueMembers++;
			}
		}

		// Create a result array
		int[] result = new int[uniqueMembers];

		// Write the unique elements into the result array
		int positionInResult = 0;

		for (int i = 0; i < array.length; i++) {
			// Same condition as in the previous loop. Except this time, we can write
			// each unique number into the result Array instead of just counting them.
			if (i == 0 || array[i] != array[i - 1]) {
				result[positionInResult] = array[i];
				positionInResult++;
			}

		}

		return result;
	}
	
	
	public static int removeDuplicates(int[] array) {
		
		// The initial length is simply the capacity
		int length = array.length;
		
		// Assume the last element is always unique.
        // Then for each element, delete it iff it is
        // the same as the one after it. Use our deletion
        // algorithm for deleting from any index.
		
		for (int i = length - 2; i >=0; i--) {
			
			if (array[i] == array[i + 1]) {
				// Delete the element at index i, using our standard deletion algorithm we learned.
				
				for(int j = i + 1; j < length; j++) {
					array[j - 1] = array[j];
				}
				
				// Reduce the length by 1.
				length--;
			}
		}
		
		// Return the new length
		return length;
	}
	
}

