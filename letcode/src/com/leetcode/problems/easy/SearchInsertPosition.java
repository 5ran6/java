package com.leetcode.problems.easy;

import java.util.Arrays;

/**
 *
 * brunolima on May 23, 2021
 * 
 * Given a sorted array of distinct integers and a target value, return the
 * index if the target is found. If not, return the index where it would be if
 * it were inserted in order.
 * 
 * You must write an algorithm with O(log n) runtime complexity.
 * 
 * Example 1:
 * Input: nums = [1,3,5,6], target = 5 
 * Output: 2 
 * 
 * Example 2:
 * Input: nums = [1,3,5,6], target = 2 
 * Output: 1 
 * 
 * Example 3:
 * Input: nums = [1,3,5,6], target = 7 
 * Output: 4 
 * 
 * Example 4:
 * Input: nums = [1,3,5,6], target = 0 
 * Output: 0 
 * 
 * Example 5:
 * Input: nums = [1], target = 0 
 * Output: 0
 * 
 * Constraints:
 * 
 * 1 <= nums.length <= 104 -104 <= nums[i] <= 104 nums contains distinct values
 * sorted in ascending order. -104 <= target <= 104
 * 
 */

public class SearchInsertPosition {

	public static void main(String[] args) {
		SearchInsertPosition sip = new SearchInsertPosition();
		
		int[] array1 = {1, 3, 5, 6};
		int target1 = 5;
//		System.out.println(sip.searchInsert(array1, target1));
		System.out.println(sip.searchInsertV2(array1, target1));
		
		int[] array2 = {1, 3, 5, 6};
		int target2 = 2;
//		System.out.println(sip.searchInsert(array2, target2));
		System.out.println(sip.searchInsertV2(array2, target2));
		
		int[] array3 = {1, 3, 5, 6};
		int target3 = 7;
//		System.out.println(sip.searchInsert(array2, target2));
		System.out.println(sip.searchInsertV2(array3, target3));
		
		int[] array4 = {1, 3, 5, 6};
		int target4 = 0;
//		System.out.println(sip.searchInsert(array4, target4));
		System.out.println(sip.searchInsertV2(array4, target4));
		
		int[] array5 = {1};
		int target5 = 0;
//		System.out.println(sip.searchInsert(array5, target5));
		System.out.println(sip.searchInsertV2(array5, target5));
	}
	
	public int searchInsert(int[] nums, int target) {
//		System.out.println("Arrays: " + Arrays.toString(nums));
//		System.out.println("Target: " + target + "\n");
		
		int low = 0, high = nums.length -1;
//		System.out.println("low: " + low);
//		System.out.println("value low: " + nums[low] + "\n");
//		
//		System.out.println("high: " + high);
//		System.out.println("value high: " + nums[high]+ "\n");
//		
		while (low <= high) {
			int mid = (low + high) / 2;
//			System.out.println("mid: " + mid);
//			System.out.println("nums[mid]: " + nums[mid] + "\n");
//			
			if (nums[mid] == target) {
				return mid;
			} else if (nums[mid] > target) {
				high = mid - 1;
			} else {
				low = mid + 1;
			}
		}
		
		return low;
	}
	
	public int searchInsertV2(int[] nums, int target) {
		int i = Arrays.binarySearch(nums, target);
//		System.out.println("result: " + i);
	
		return i >= 0 ? i : -i - 1;
		
	}
}
