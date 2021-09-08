package global.sfotware.support.data.structure.in.java.arrays;

import java.util.Arrays;

/**
 *
 * brunolima on Jun 3, 2021
 * 
 * The problem is that we want to find duplicates in a T[] one-dimensional array
 * of integers in O(N) running time where the integer values are smaller than
 * the length of the array - and we can not use negative values!
 * 
 * Good luck!
 * 
 */

public class FindDuplicatesAnArray {

	public static void main(String[] args) {
		FindDuplicatesAnArray fdaa = new FindDuplicatesAnArray();

		int[] nums = { 2, 3, 1, 2, 4, 3 };

		fdaa.findDuplicates(nums);
	}

	private void findDuplicates(int[] nums) {
		// this is why it is an O(N) running time algorithm
		for (int i = 0; i < nums.length; i++) {

			// if this value is positive we have to flip
			if (nums[Math.abs(nums[i])] > 0) {
				System.out.println("Num before: " + nums[i] + " Abs "+ nums[Math.abs(nums[i])]);
				nums[Math.abs(nums[i])] = -nums[Math.abs(nums[i])];
				System.out.println("Num after: " + nums[i] + " Abs "+ nums[Math.abs(nums[i])] + "\n");
			}

			// otherwise it is negative: it means repetition
			else {
				System.out.println(Math.abs(nums[i]) + " is a repetition! at index: " + i + "\n");
			}       
		}
		
		System.out.println(Arrays.toString(nums));

	}

}
