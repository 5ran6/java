package challenges;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 *
 * brunolima on May 8, 2021
 * 
 */

public class FindNumber {

	public static void main(String[] args) {
		List<Integer> ls = Arrays.asList(1, 2, 3, 4, 5);
		System.out.println("Result01: " + findNumber01(ls, 1));
		System.out.println("Result01: " + findNumber02(ls, 1));
		System.out.println("Result01: " + findNumber03(ls, 2));
	}

	private static String findNumber01(List<Integer> ls, int n) {
		boolean result = false;
		
		for (Integer num : ls) {
			if (num.equals(n)) {
				result = true;
				break;
			}
		}
		
		return result ? "YES" : "NO";
	}

	private static String findNumber02(List<Integer> ls, int n) {
		return ls.contains(n) ? "YES" : "NO";
	}

	private static String findNumber03(List<Integer> ls, int n) {
		Optional<Integer> result = ls.stream().filter(num -> num.equals(n)).findAny();
		return result.isPresent()? "YES" : "NO";
	}
	
}
