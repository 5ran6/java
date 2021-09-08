package global.sfotware.support.data.structure.in.java.hashtable;

/**
 *
 * brunolima on Jun 12, 2021
 * 
 */

public class NaiveSolution {

	// the onde-dimensional array in wich we store the integers
	private int nums[];

	// the S target we are after
	private int S;

	public NaiveSolution(int[] nums, int S) {
			this.nums = nums;
			this.S = S;
		}

	// because of the nested for loop it has O(Nˆ2) quadratic reunning time
	// complexity
	public void solve() {

		// we consider all the items in the array
		for (int i = 0; i < nums.length; i++) {
			// for all items we check all other items
			for (int j = 0; j < nums.length; j++) {

				// and check if two items sum up to S or not
				if (nums[i] + nums[j] == S) {
					System.out.println("Solution: " + nums[i] + " + " + nums[j]);
				}
			}
		}
	}

}
