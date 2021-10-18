package hackerhank.algorithms.easy;

import java.time.temporal.ValueRange;
import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Oct 17, 2021
 * 
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 * 
 */

public class AppleAndOrange {

	public static void main(String[] args) {
//		int s = 7;
//		int t = 10;
//		int a = 4;
//		int b = 12;
//		List <Integer> apples = Arrays.asList(2, 3, -4);
//		List <Integer> oranges = Arrays.asList(3, -2, -4);
//		
//		countApplesAndOranges(s, t, a, b, apples, oranges);
		
		
		int s = 7;
		int t = 11;
		int a = 5;
		int b = 15;
		List <Integer> apples = Arrays.asList(-2, 2, 1);
		List <Integer> oranges = Arrays.asList(5, -6);
		
		countApplesAndOranges(s, t, a, b, apples, oranges);
	}

	public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
		ValueRange range = ValueRange.of(s, t);
		int countApplesSamHouse = 0;
		int countOrangesSamHouse = 0;
		
		for (Integer value : apples) {
			int sum = a + (value);
			
			if (range.isValidValue(sum)) {
				countApplesSamHouse++;
			}
		}
		
		System.out.println(countApplesSamHouse);
		
		for (Integer value : oranges) {
			int sum = b + (value);
			
			if (range.isValidValue(sum)) {
				countOrangesSamHouse++;
			}
		}
		
		System.out.println(countOrangesSamHouse);
	}
}
