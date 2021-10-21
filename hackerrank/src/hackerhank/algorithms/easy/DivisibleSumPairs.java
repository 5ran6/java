package hackerhank.algorithms.easy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Oct 20, 2021
 * 
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 * 
 */

public class DivisibleSumPairs {

	public static void main(String[] args) {
		System.out.println(divisibleSumPairs(6, 5, Arrays.asList(1, 2, 3, 4, 5, 6)));
		
		System.out.println(divisibleSumPairs(6, 3, Arrays.asList(1, 3, 2, 6, 1, 2)));
	}

	public static int divisibleSumPairs(int n, int k, List<Integer> ar) {
		int count = 0;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				int a = ar.get(i);
				int b = ar.get(j);

//				System.out.println("sum = " + a + " + " + b + " = " + (a + b));

				int sum = a + b;

				if (sum % k == 0) {
					count++;
				}
			}
		}

		return count;
	}

}
