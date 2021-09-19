package hackerhank.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Sep 8, 2021
 * 
 * @see https://docs.google.com/forms/d/e/1FAIpQLScBqNRFK6c0UhsbGJBxhiFZ3_l57WVLkhvdlXH4tKoZqmdU2g/viewform
 */

public class TODO_FormingAMagicSquare {

	public static void main(String[] args) {
		List<List<Integer>> matrix = new ArrayList<List<Integer>>();

		matrix.add(Arrays.asList(5, 3, 4));
		matrix.add(Arrays.asList(1, 5, 8));
		matrix.add(Arrays.asList(6, 4, 2));
		
		formingMagicSquare(matrix);

	}

	public static int formingMagicSquare(List<List<Integer>> matrix) {
		// Write your code here

		System.out.println(Arrays.toString(matrix.toArray()));
		
		
		
		
		return 0;
	}

}
