package com.leetcode.arrays;

/**
 *
 * brunolima on Mar 29, 2021
 * 
 * Given an array arr, replace every element in that array with the greatest
 * element among the elements to its right, and replace the last element with -1.
 * 
 * After doing so, return the array.
 * 
 * Example 1:
 * Input: arr = [17,18,5,4,6,1] 
 * Output: [18,6,6,6,1,-1] 
 * Explanation: 
 * - index 0 --> the greatest element to the right of index 0 is index 1 (18). 
 * - index 1 --> the greatest element to the right of index 1 is index 4 (6). 
 * - index 2 --> the greatest element to the right of index 2 is index 4 (6). 
 * - index 3 --> the greatest element to the right of index 3 is index 4 (6). 
 * - index 4 --> the greatest element to the right of index 4 is index 5 (1). 
 * - index 5 --> there are no elements to the right of index 5, so we put -1. 
 * 
 * Example 2:
 * Input: arr = [400] 
 * Output: [-1] 
 * Explanation: There are no elements to the right of index 0
 * 
 */

public class _21_ReplaceElementsWithGreatestElementOnRightSide {
	
	public static void main(String[] args) {
		int[] arr = { 17, 18, 5, 4, 6, 1 };
//		arr[0] = 17 => 	{18, 5, 4, 6, 1} 	=> MAIOR EH 18
//		arr[1] = 18 => 	{5, 4, 6, 1} 		=> MAIOR EH 6
//		arr[2] = 5 	=> 	{4, 6, 1} 			=> MAIOR EH 6
//		arr[3] = 4	=> 	{6, 1} 				=> MAIOR EH 6
//		arr[4] = 6	=> 	{1} 				=> MAIOR EH 1
//		arr[5] = 1	=> 	{ } 				=> MAIOR EH -1
		
		replaceElements(arr);
		
		for (int i : arr) {
			System.out.println(i);
		}
	}

//	public static int[] replaceElements(int[] arr) {
//		if (arr.length == 1) {
//            arr[0] = -1;
//            return arr;
//        }
//
//		int lastIndexArray = arr.length - 1;
//			
//		for (int i = 1; i < arr.length ; i++) {
//			
//			int maxValue = arr[i];
//			
//			for (int j = lastIndexArray; j > i; j--) {
//				maxValue = Math.max(maxValue, arr[j]);
//				
//			}
//			
//			arr[i - 1] = maxValue;
//		}
//		
//		arr[lastIndexArray] = -1;
//
//		return arr;
//	}
	
//	public static int[] replaceElements(int[] arr) {
//		int i = arr.length - 1;
//		int m = arr[i];
//		arr[i--] = -1;
//		
//		while (i >= 0) {
//			int t = arr[i];
//			arr[i--] = m;
//			m = Math.max(t, m);
//		}
//		
//		return arr;
//	}
	
	public static int[] replaceElements(int[] arr) {
		int max = -1, n = arr.length;
		
		for (int i = n - 1; i >= 0; i--) {
			int tmp = arr[i];
			arr[i] = max;
			max = Math.max(max, tmp);
		}
		
		return arr;
	}

}
