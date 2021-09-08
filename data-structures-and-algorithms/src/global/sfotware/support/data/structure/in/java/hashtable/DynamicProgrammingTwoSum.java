package global.sfotware.support.data.structure.in.java.hashtable;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * brunolima on Jun 12, 2021
 * 
 * The two sum problem is a common interview question (it is very similar to the
 * subset sum problem)
 * 
 * THE PROBLEM: find all the pairs of two integers in aa unsroted array of
 * integers that the sum up to a given S
 * 
 * [1,2,3,4] is the array and S = 5 --> [1, 4] and [2, 3] are the solutions
 * 
 * - the naive solution has O(Nˆ2) running time - we can use dynammic
 * programming to reduce the running time to O(N) linear running time
 */

public class DynamicProgrammingTwoSum {

	private int nums[];
	private int S;
	private Map<Integer, Integer> hashTable;

	public DynamicProgrammingTwoSum(int[] nums, int s) {
		super();
		this.nums = nums;
		S = s;
		this.hashTable = new HashMap<Integer, Integer>();
	}

	// we can eliminate the second for loop with a hash table (running time complexity tradeoff)
	public void solveDynammicProgramming() {

		// consider all the items once so it has O(N) linear running time complexity
		for (int i = 0; i < nums.length; i++) {
			
			// check the remainder (actual value - target value)
			int remainder = S - nums[i];
			
			// check if the remainder exists in the hashTable: it means we have found a pair
			// O(1)
			if (hashTable.containsValue(remainder)) {
				System.out.println("Solution " + nums[i] + " + " + remainder + " = " + S);
			}
			
			// add the current number to the hashtable
			hashTable.put(i, nums[i]);
		}
	}

}
