package hackerhank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Sep 7, 2021
 * 
 * 
 * @see https://www.hackerrank.com/challenges/diagonal-difference/problem
 */

public class DiagonalDifference {

	public static void main(String[] args) {
		List<List<Integer>> arr = new ArrayList<List<Integer>>();
		arr.add(Arrays.asList(11, 2, 4));
		arr.add(Arrays.asList(4, 5, 6));
		arr.add(Arrays.asList(10, 8, -12));
//		System.out.println(diagonalDifference(arr));

		List<List<Integer>> arr2 = new ArrayList<List<Integer>>();
		arr2.add(Arrays.asList(6, 6, 7, -10, 9, -3, 8, 9, -1));
		arr2.add(Arrays.asList(9, 7, -10, 6, 4, 1, 6, 1, 1));
		arr2.add(Arrays.asList(-1, -2, 4, -6, 1, -4, -6, 3, 9));
		arr2.add(Arrays.asList(-8, 7, 6, -1, -6, -6, 6, -7, 2));
		arr2.add(Arrays.asList(-10, -4, 9, 1, -7, 8, -5, 3, -5));
		arr2.add(Arrays.asList(-8, -3, -4, 2, -3, 7, -5, 1, -5));
		arr2.add(Arrays.asList(-2, -7, -4, 8, 3, -1, 8, 2, 3));
		arr2.add(Arrays.asList(-3, 4, 6, -7, -7, -8, -3, 9, -6));
		arr2.add(Arrays.asList(-2, 0, 5, 4, 4, 4, -3, 3, 0));
		System.out.println(diagonalDifference(arr2));

	}

	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here
		System.out.println(Arrays.toString(arr.toArray()));

		int sumDiagLeftToRight = 0;
		int sumDiagRightToLeft = 0;
		int numRowsAndCols = arr.get(0).size();

		System.out.println("numRowsAndCols >>> " + numRowsAndCols);

		for (int i = 0; i < numRowsAndCols; i++) {
			sumDiagLeftToRight += arr.get(i).get(i);
		}

		System.out.println("sumDiagLeftToRight >>> " + sumDiagLeftToRight);

		for (int i = 0, j = numRowsAndCols; i < numRowsAndCols; i++, j--) {
			sumDiagRightToLeft += arr.get(i).get(j - 1);
		}

		System.out.println("sumDiagRightToLeft >>> " + sumDiagRightToLeft);

		return (sumDiagLeftToRight > sumDiagRightToLeft ? (sumDiagLeftToRight - sumDiagRightToLeft)
				: (sumDiagRightToLeft - sumDiagLeftToRight));
	}

}
