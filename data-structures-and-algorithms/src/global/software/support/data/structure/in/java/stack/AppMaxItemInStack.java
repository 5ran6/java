package global.software.support.data.structure.in.java.stack;

/**
 *
 * brunolima on Jun 7, 2021
 * 
 */

public class AppMaxItemInStack {

	public static void main(String[] args) {
		MaxItemInStack max = new MaxItemInStack();

		max.push(10);
		max.push(5);
		max.push(1);
		max.push(12);
		max.push(11);

		System.out.println(max.getMaxItem());
	}

}
