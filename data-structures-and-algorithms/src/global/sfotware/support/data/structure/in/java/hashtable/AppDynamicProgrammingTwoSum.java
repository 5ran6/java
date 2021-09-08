package global.sfotware.support.data.structure.in.java.hashtable;

/**
*
* brunolima on Jun 12, 2021
* 
*/

public class AppDynamicProgrammingTwoSum {
	
	public static void main(String[] args) {
		int[] nums = {3, 5, 2, -4, 8, 11};
		int S = 7;
		
		NaiveSolution naiveSolution = new NaiveSolution(nums, S);
//		naiveSolution.solve();
		
		DynamicProgrammingTwoSum dynamicProgrammingTwoSum = new DynamicProgrammingTwoSum(nums, S);
		dynamicProgrammingTwoSum.solveDynammicProgramming();
	}

}

