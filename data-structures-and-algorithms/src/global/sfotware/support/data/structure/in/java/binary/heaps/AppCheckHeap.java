package global.sfotware.support.data.structure.in.java.binary.heaps;

/**
 *
 * brunolima on Jun 11, 2021
 * 
 */

public class AppCheckHeap {

	public static void main(String[] args) {
		int[] nums = {1, 2, 3, 4, 5};
		CheckHeap checkHeap = new CheckHeap();
		System.out.println(checkHeap.isMinHeap(nums));
		
		nums[0] = 6;
		System.out.println(checkHeap.isMinHeap(nums));
	}

}
