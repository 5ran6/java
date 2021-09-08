package global.software.support.data.structure.in.java.stack;

/**
*
* brunolima on Jun 6, 2021
* 
*/

public class AppStackArray {

	public static void main(String[] args) {
		StackArray<Integer> nums = new StackArray<>();
		
		nums.push(1);
		nums.push(2);
		nums.push(3);
		nums.push(4);
		nums.push(5);
		nums.push(6);
		nums.push(7);
		
		while(!nums.isEmpty()) {
			System.out.println(nums.pop());
		}
	}
	
}

