package hackerhank.algorithms.easy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Oct 19, 2021
 * 
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 * 
 */

public class SubArrayDivision {

	public static void main(String[] args) {
		System.out.println(birthday(Arrays.asList(2, 2, 1, 3, 2), 4, 2)); //2
//		System.out.println(birthday(Arrays.asList(1, 2, 1, 3, 2), 3, 2)); // 2
//		System.out.println(birthday(Arrays.asList(1, 1, 1, 1, 1, 1), 3, 2)); //0
//		System.out.println(birthday(Arrays.asList(4), 4, 1)); // 1
//		System.out.println(birthday(Arrays.asList(2, 5, 1, 3, 4, 4, 3, 5, 1, 1, 2, 1, 4, 1, 3, 3, 4, 2, 1), 18, 7));
	}

	public static int birthday(List<Integer> s, int d, int m) {
		int count = 0;
		
		for (int i = 0; i <= s.size() - m; i++) {
			int sum =0;
			
			for (int j = i; j < i + m; j++) {
				sum += s.get(j);
			}
			
			if (sum == d) count++;
		}

		return count;
	}

}
