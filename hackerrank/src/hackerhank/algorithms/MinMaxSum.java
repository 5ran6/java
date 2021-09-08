package hackerhank.algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 * brunolima on Sep 7, 2021
 * 
 * @see https://www.hackerrank.com/challenges/mini-max-sum/problem
 * 
 */

public class MinMaxSum {

	public static void main(String[] args) {
//		miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
		miniMaxSum(Arrays.asList(1, 3, 5, 7, 9));
	}

	public static void miniMaxSum(List<Integer> arr) {
		long minSum = 0;
		long maxSum = 0;
		
		List<Long> sum = new ArrayList<>();
		int indexExcept = 0;
		
		for (int i = 0; i < arr.size(); i++) {
			long totalSum = 0;
			
			for (int j = 0; j < arr.size(); j++) {
				if (j != indexExcept) {
					totalSum += arr.get(j);
				}
			}
			
			sum.add(totalSum);
			
			indexExcept++;
		}
		
		Collections.sort(sum);
		minSum = sum.get(0);
		maxSum = sum.get(sum.size() - 1);
		
		System.out.println(minSum + " " + maxSum);
	}

}
