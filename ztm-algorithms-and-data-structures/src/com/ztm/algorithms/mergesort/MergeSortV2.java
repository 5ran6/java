package com.ztm.algorithms.mergesort;

/**
 *
 * brunolima on May 12, 2021
 * 
 */

public class MergeSortV2 {

	// Merges two subarrays of arr[].
	// First subarray is arr[l..m]
	// Second subarray is arr[m+1..r]
	void merge(int input[], int left, int middle, int right) {
		// Find sizes of two subarrays to be merged
		int n1 = middle - left + 1;
		int n2 = right - middle;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = input[left + i];
		
		for (int j = 0; j < n2; ++j)
			R[j] = input[middle + 1 + j];

		/* Merge the temp arrays */

		// Initial indexes of first and second subarrays
		int l = 0, r = 0;

		// Initial index of merged subarry array
		int k = left;
		while (l < n1 && r < n2) {
			if (L[l] <= R[r]) {
				input[k] = L[l];
				l++;
			} else {
				input[k] = R[r];
				r++;
			}
			k++;
		}

		/* Copy remaining elements of L[] if any */
		while (l < n1) {
			input[k] = L[l];
			l++;
			k++;
		}

		/* Copy remaining elements of R[] if any */
		while (r < n2) {
			input[k] = R[r];
			r++;
			k++;
		}
	}

	// Main function that sorts arr[l..r] using
	// merge()
	void sort(int input[], int left, int right) {
		if (left < right) {
			// Find the middle point
			int middle = left + (right - left) / 2;

			// Sort first and second halves
			sort(input, left, middle);
			sort(input, middle + 1, right);

			// Merge the sorted halves
			merge(input, left, middle, right);
		}
	}

	/* A utility function to print array of size n */
	static void printArray(int input[]) {
		int n = input.length;
		for (int i = 0; i < n; ++i)
			System.out.print(input[i] + " ");
		System.out.println();
	}

	// Driver code
	public static void main(String args[]) {
//		int[] input = { 12, 11, 13, 5, 6, 7 };
		int[] input = { 99, 44, 6, 2, 1, 5, 63, 87, 289, 4, 0 };

		System.out.println("Given Array");
		printArray(input);

		MergeSortV2 ob = new MergeSortV2();
		ob.sort(input, 0, input.length - 1);

		System.out.println("\nSorted array");
		printArray(input);
	}

}
