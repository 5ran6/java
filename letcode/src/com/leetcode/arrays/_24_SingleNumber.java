package com.leetcode.arrays;

/**
 *
 * brunolima on Apr 5, 2021
 * 
 * Given a non-empty array of integers nums, every element appears twice except
 * for one. Find that single one.
 * 
 * Follow up: Could you implement a solution with a linear runtime complexity
 * and without using extra memory?
 * 
 * 
 * Example 1:
 * Input: nums = [2,2,1]
 * Output: 1 
 * 
 * Example 2:
 * Input: nums = [4,1,2,1,2] 
 * Output: 4 
 * 
 * Example 3:
 * Input: nums = [1] 
 * Output: 1
 */

public class _24_SingleNumber {

	public static void main(String[] args) {
		int[] nums1 = { 2, 2, 1 };
		System.out.println(singleNumber(nums1));

		int[] nums2 = { 4, 1, 2, 1, 2 };
		System.out.println(singleNumber(nums2));
 
		int[] nums3 = { 1 };
		System.out.println(singleNumber(nums3));
	}
	
//	public static int singleNumber(int[] nums) {
//	    if (nums.length == 1) return nums[0];
//	    
//	    HashSet<Integer> hashCopy = new HashSet<>();
//	    
//	    for (int i = 0; i < nums.length; i++) {
//			hashCopy.add(nums[i]);
//		}
//	    
//	    HashSet<Integer> hashValuesDuplicated = new HashSet<>();
//	    
//	    for (int i = 0; i < nums.length; i++) {
//	    	for (int j = i + 1; j < nums.length; j++) {
//				if (nums[i] == nums[j]) {
//					hashValuesDuplicated.add(nums[i]);
//				}
//			}
//		}
//	    
//	    hashCopy.removeAll(hashValuesDuplicated);
//		
//		return hashCopy.iterator().next();
//	}
	
//	public static int singleNumber(int[] nums) {
//		if (nums.length == 1) return nums[0];
//		
//		ArrayList<Integer> arrayNums = new ArrayList<>();
//		
//		for (Integer value : nums) {
//			if (!arrayNums.contains(value)) {
//				arrayNums.add(value);
//			} else {
//				arrayNums.remove(value);
//			}
//		}
//	
//		
//		return arrayNums.get(0);
//	}
	
//	public static int singleNumber(int[] nums) {
//		int sumOfSet = 0, sumOfNums = 0;
//		
//		Set<Integer> set = new HashSet<>();
//		
//		for (Integer value : nums) {
//			if(!set.contains(value)) {
//				set.add(value);
//				sumOfSet += value;
//			}
//			
//			sumOfNums += value;
//		}
//		
//		return(2 * sumOfSet) - sumOfNums;
//	}
	
	public static int singleNumber(int[] nums) {
//		false ^ false == false
//		true ^ false == true
//		false ^ true == true
//		true ^ true == false
		
		int a = 0;
		
		for (int i : nums) {
			a ^= i;
		}
		
		return a;
	}
	
}
