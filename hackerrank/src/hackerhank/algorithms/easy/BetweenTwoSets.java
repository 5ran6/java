package hackerhank.algorithms.easy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Oct 18, 2021
 * 
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 * 
 * https://en.wikipedia.org/wiki/Least_common_multiple
 * https://en.wikipedia.org/wiki/Greatest_common_divisor
 * 
 */

public class BetweenTwoSets {

	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(2, 6);
		List<Integer> b = Arrays.asList(24, 36);
		System.out.println(getTotalX(a, b));

		List<Integer> c = Arrays.asList(2, 4);
		List<Integer> d = Arrays.asList(16, 32, 96);
		System.out.println(getTotalX(c, d));

	}

	public static int getTotalX(List<Integer> a, List<Integer> b) {
		int lcm = a.get(0);

		for (int i = 0; i < a.size(); i++) {
			lcm = calculateLCM(lcm, a.get(i));
		}

//		System.out.println("lcm >>> " + lcm);

		int gcd = b.get(0);

		for (int i = 0; i < b.size(); i++) {
			gcd = calculateGCD(gcd, b.get(i));
		}

//		System.out.println("gcd >>> " + gcd);

		int count = 0;

		for (int i = lcm, j = 2; i <= gcd; i = lcm * j, j++) {
			if (gcd % i == 0) {
				count++;
			}
		}

		return count;
	}

	private static int calculateLCM(int n1, int n2) {
		if (n1 == 0 || n2 == 0)
			return 0;

		// turns the value in a positive number
		int abs1 = Math.abs(n1);
		int abs2 = Math.abs(n2);

		// set min and max value
		int min = Math.min(abs1, abs2);
		int max = Math.max(abs1, abs2);

		int lcm = max;

		while (lcm % min != 0) {
			lcm += max;
		}

		return lcm;
	}

	private static int calculateGCD(int n1, int n2) {
		int gcd = 1;

		for (int i = 1; i <= n1 && i <= n2; i++) {
			if (n1 % i == 0 && n2 % i == 0) {
				gcd = i;
			}
		}

		return gcd;
	}

}
