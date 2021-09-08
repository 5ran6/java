package com.leetcode.arrays;

import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * brunolima on Mar 20, 2021
 * 
 * Given a fixed length array arr of integers, duplicate each occurrence of
 * zero, shifting the remaining elements to the right.
 * 
 * Note that elements beyond the length of the original array are not written.
 * 
 * Do the above modifications to the input array in place, do not return
 * anything from your function.
 * 
 * Example 1:
 * 
 * Input: [1,0,2,3,0,4,5,0] 
 * Output: null 
 * Explanation: After calling your function, the input array is modified to: [1,0,0,2,3,0,0,4] 
 * 
 * Example 2:
 * 
 * Input: [1,2,3] 
 * Output: null
 * Explanation: After calling your function, the input array is modified to: [1,2,3]
 * 
 */

public class _13_DuplicateZeros {

	public static void main(String[] args) {
		int[] array1 = { 1, 0, 2, 3, 0, 4, 5, 0 };
		int[] array2 = { 1, 2, 3 };
		
		duplicateZeros(array1);
		duplicateZeros(array2);
		
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.toString(array2));
	}

//	public static void duplicateZeros(int[] arr) {
//		int sizeArray = arr.length;
//		
//		for (int i = 0; i < arr.length; i++) {
//			if (arr[i] != 0 ) continue;
//			
//			if (arr[i] == 0) {
//				int[] arrayLeft = Arrays.copyOfRange(arr, 0, i + 1);
//				int[] arrayRight = Arrays.copyOfRange(arr, i, sizeArray - 1);
//				
//				int sizeLeft = arrayLeft.length;
//				int sizeRight = arrayRight.length;
//				
//				System.arraycopy(arrayLeft, 0, arr, 0, sizeLeft);
//				System.arraycopy(arrayRight, 0, arr, sizeLeft, sizeRight);
//				i++;
//			}
//		}
//	}
	
	public static void duplicateZeros(int[] arr) {
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				list.add(arr[i]);
			} else {
				list.add(arr[i]);
				list.add(arr[i]);
			}
		}
		
		for (int i = 0; i < arr.length; i++) {
			arr[i] = list.get(i);
		}
	}
	
}
