 package com.leetcode.arrays;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * brunolima on Mar 26, 2021
 * 
 * Given an array arr of integers, check if there exists two integers N and M
 * such that N is the double of M ( i.e. N = 2 * M).
 * 
 * More formally check if there exists two indices i and j such that :
 * 
 * i != j 0 <= i, j < arr.length arr[i] == 2 * arr[j]
 * 
 * 
 * Example 1:
 * Input: arr = [10,2,5,3] 
 * Output: true 
 * Explanation: N = 10 is the double of M = 5,that is, 10 = 2 * 5. 
 * 
 * 
 * Example 2:
 * Input: arr = [7,1,14,11] 
 * Output: true 
 * Explanation: N = 14 is the double of M = 7,that is, 14 = 2 * 7. 
 * 
 * Example 3:
 * Input: arr = [3,1,7,11] 
 * Output: false 
 * Explanation: In this case does not exist N and M, such that N = 2 * M.
 * 
 */

public class _3_CheckIfNAndItsDoubleExist {

	public static void main(String[] args) {
		int[] arr1 = { 10, 2, 5, 3 };
		System.out.println(checkIfExist(arr1));

		int[] arr2 = { 7, 1, 14, 11 };
		System.out.println(checkIfExist(arr2));

		int[] arr3 = { 3, 1, 7, 11 };
		System.out.println(checkIfExist(arr3));
		
		int[] arr4 = { -2, 0, 10, -19, 4, 6, -8 };
		System.out.println(checkIfExist(arr4));
	}

//	O(n)
	public static boolean checkIfExist(int[] arr) {
		Set<Object> set = new HashSet<>();
		
		for (int i = 0; i < arr.length; i++) {
			if (set.contains(arr[i])) {
				return true;
			} else if (arr[i] % 2 == 0) {
				set.add(arr[i] / 2);
			} else {
				set.add(arr[i] * 2);
			}
			
		}
		
		return false;
	}
	
//	set.contains(10)	=> false
//	10 % 2 == 0 		=> true
//	10 / 2 				=> set.add(5)
//	10 * 2 				=> set.add(20)
//	
//	set.contains(2)		=> 	false
//	2 % 2 == 0 			=> true
//	2 / 2 				=> set.add(1)
//	2 * 2 				=> set.add(4)
//	
//	set.contains(5)		=> true		************* OK 
//	5 % 2 == 1 			=> false
//	5 / 2 				=> set.add(2)
//	5 * 2 				=> set.add(10)
//	
//	set.contains(3)		=> false
//	3 % 2 == 1 			=> false
//	3 / 2 				=> set.add(1)
//	3 * 2 				=> set.add(6)
			

	
//	O(nˆ2)
//	public static boolean checkIfExist(int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = i + 1; j < arr.length; j++) {
//				if (arr[i] == (2 * arr[j]) || (2 * arr[i]) == arr[j]) {
//					return true;
//				}
//			}
//		}
//
//		return false;
//	}
 
			
}
