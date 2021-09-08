package global.sfotware.support.data.structure.in.java.arrays;

import java.util.Arrays;

/**
 *
 * brunolima on Jun 3, 2021
 * 
 * The problem is that we want to reverse a T[] array in O(N) linear time
 * complexity and we want the algorithm to be in-place as well - so the
 * algorithm can not use additional memory!
 * 
 * For example: input is [1,2,3,4,5] then the output is [5,4,3,2,1]
 * 
 * Good luck!
 * 
 */

public class ReverseArray {

	public static void main(String[] args) {
		ReverseArray ra = new ReverseArray();
		
		int[] nums = { 1, 2, 3, 4, 5 };
		ra.myReverseArray(nums);
//		ra.reverseArray(nums);
		
		int[] nums1 = { 1, 2, 3, 4 };
		ra.myReverseArray(nums1);
//		ra.reverseArray(nums1);
	}

	public void myReverseArray(int[] nums) {
		System.out.println("Before >>> " + Arrays.toString(nums));
		
		int startIndex = nums[0];
		int endIndex = nums[nums.length - 1];

		for (int i = 0, j = nums.length - 1 ; i <= nums.length / 2 && j >= nums.length / 2; i++, j--) {
			nums[i] = endIndex;
			nums[j] = startIndex;
			
			startIndex = nums[i + 1];
			endIndex = nums[j - 1];	
		}
		
		System.out.println("After >>> " + Arrays.toString(nums));
	}
	
	public void reverseArray(int[] nums) {
		System.out.println("Before >>> " + Arrays.toString(nums));
		
		// pointer to the first item
		int startIndex = 0;
		
		// pointer to the last item
		int endIndex = nums.length - 1;
		
		// we swap 2 items in 1 iteration: so we just have to make N/2 iterations
		while(endIndex > startIndex) {
			
			// swap two items with the index endIndex and startIndex
			swap(nums, startIndex, endIndex);
			
			// increment and decrement the indexes
			startIndex++;
			endIndex--;
		}
		
		System.out.println("After >>> " + Arrays.toString(nums));
	}

	private void swap(int[] nums, int startIndex, int endIndex) {
		int temp = nums[startIndex];
		nums[startIndex] = nums[endIndex];
		nums[endIndex] = temp;
	}

}
