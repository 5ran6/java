package hackerhank.algorithms.easy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Sep 7, 2021
 * 
 * 
 * @see https://www.hackerrank.com/challenges/plus-minus/problem
 */

public class PlusMinus {

	public static void main(String[] args) {
		List<Integer> arr = Arrays.asList(1, 1, 0, -1, -1);

		plusMinus(arr);

	}

	public static void plusMinus(List<Integer> arr) {
		// Write your code here
		System.out.println(Arrays.toString(arr.toArray()));
		
		int sizeArr = arr.size();
		int sumPositive = 0;
		int sumNegative = 0;
		int sumZeros = 0;
		
		for (Integer value : arr) {
			if (value > 0) {
				sumPositive++;
			} else if (value < 0) {
				sumNegative++;
			} else {
				sumZeros++;
			}
		}
		
		System.out.println(String.format("%.6f", Double.valueOf(sumPositive) / sizeArr));
		System.out.println(String.format("%.6f", Double.valueOf(sumNegative) / sizeArr));
		System.out.println(String.format("%.6f", Double.valueOf(sumZeros) / sizeArr));
	}

}
