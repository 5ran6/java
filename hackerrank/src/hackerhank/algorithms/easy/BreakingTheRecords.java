package hackerhank.algorithms.easy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * brunolima on Oct 19, 2021
 * 
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 * 
 */

public class BreakingTheRecords {

	public static void main(String[] args) {
		List<Integer> scores1 = Arrays.asList(10, 5, 20, 20, 4, 5, 2, 25, 1);
		System.out.println(breakingRecords(scores1));

		List<Integer> scores2 = Arrays.asList(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
		System.out.println(breakingRecords(scores2));

	}

	public static List<Integer> breakingRecords(List<Integer> scores) {
		if (scores.size() == 0)
			return scores;

		int highScore = scores.get(0);
		int lowestScore = scores.get(0);
		int countBestRecord = 0;
		int countWorstRecord = 0;

		for (int i = 1; i < scores.size(); i++) {
			if (scores.get(i) > highScore) {
				highScore = scores.get(i);
				countBestRecord++;
			} else if (scores.get(i) < lowestScore) {
				lowestScore = scores.get(i);
				countWorstRecord++;
			}
		}

		return Arrays.asList(countBestRecord, countWorstRecord);
	}

}
