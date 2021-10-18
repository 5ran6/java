package challenges;

import java.util.ArrayList;
import java.util.List;

/**
*
* brunolima on May 8, 2021
* 
*/

public class OddNumbers {
	
	public static void main(String[] args) {
		
		System.out.println("Result 01: " + oddNumbers1(2, 5).toString());
		System.out.println("Result 01: " + oddNumbers2(2, 5).toString());
	}

	private static List<Integer> oddNumbers1(int l, int r) {
		List<Integer> result = new ArrayList<Integer>();
		
		for(int i = l; i <= r; i++) {
			if (i % 2 == 1) {
				result.add(i);
			}
		}
		
		return result;
	}
	
	private static List<Integer> oddNumbers2(int l, int r) {
		List<Integer> result = new ArrayList<Integer>();
		
		while (l <= r) {
			if (l % 2 == 1) {
				result.add(l);
			}
			l++;
		}
		
		return result;
	}

}

