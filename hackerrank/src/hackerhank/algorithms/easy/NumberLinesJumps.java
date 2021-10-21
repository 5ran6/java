package hackerhank.algorithms.easy;

/**
 *
 * brunolima on Oct 18, 2021
 * 
 * https://www.hackerrank.com/challenges/kangaroo/problem
 * 
 */

public class NumberLinesJumps {

	public static void main(String[] args) {
//		System.out.println(kangaroo(0, 3, 4, 2));
//		System.out.println(kangaroo(0, 2, 5, 3));
		System.out.println(kangaroo(21, 6, 47, 3));
	}

	public static String kangaroo(int x1, int v1, int x2, int v2) {
		if (v2 > v1) return "NO";
		
		int jumpKangoo1 = x1 + v1;
		int jumpKangoo2 = x2 + v2;
		String result = "";
		
		if (jumpKangoo1 == jumpKangoo2) {
			return "YES";
		} else {
			while(jumpKangoo1 != jumpKangoo2) {
				jumpKangoo1 += v1;
				jumpKangoo2 += v2;
				
				if (jumpKangoo1 > jumpKangoo2) {
					result = "NO";
					break;
				} else if (jumpKangoo1 == jumpKangoo2) {
					result = "YES";
					break;
				}
			}
		}
		
		return result;
	}
}
