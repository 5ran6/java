package com.leetcode.arrays;

/**
 *
 * brunolima on Mar 29, 2021
 * 
 * Given an array A of non-negative integers, return an array consisting of all
 * the even elements of A, followed by all the odd elements of A.
 * 
 * You may return any answer array that satisfies this condition.
 * 
 * Example 1:
 * Input: [3,1,2,4]
 * Output: [2,4,3,1]
 * 
 * The outputs [4,2,3,1], [2,4,1,3], and [4,2,1,3] would also be accepted.
 * 
 */

public class _25_SortArrayByParity {

	public static void main(String[] args) {
		int[] arr = { 3, 1, 2, 4 };

		int[] result = sortArrayByParity(arr);
		
		for (int i : result) {
			System.out.print(i + ", ");
		}
	}

	public static int[] sortArrayByParity(int[] A) {
		int k = 0;
		
		for (int i = 0; i < A.length; i++) {
			if (A[i] % 2 == 0) {
				int temp = A[k];
				A[k] = A[i];
				A[i] = temp;
				k++;
			}
		}

		return A;
	}

}
