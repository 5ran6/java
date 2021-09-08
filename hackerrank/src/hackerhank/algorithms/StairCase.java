package hackerhank.algorithms;

/**
 *
 * brunolima on Sep 7, 2021
 * 
 * @see https://www.hackerrank.com/challenges/staircase
 * 
 */

public class StairCase {

	public static void main(String[] args) {
		staircase(7);
	}

	public static void staircase(int n) {
		String space = " ";
		
		for (int i = 1; i <= n; i++) {	
			StringBuilder sb = new StringBuilder();
			int totalSpaces = n - i;
			
			// adding spaces
			for (int j = 0; j < totalSpaces; j++) {
				sb.append(space);
			}
			
			// adding symbol
			for (int j = 0; j < i; j++) {
				sb.append("#");
			}
			
			System.out.println(sb.toString());
		}
	}

}
