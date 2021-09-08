package hackerhank.stringslab;

import java.util.Scanner;

/**
 *
 * brunolima on Sep 6, 2021
 * 
 */

public class JavaReverse {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		
		int length = A.length() / 2;

		boolean isPalindrome = true;
		
		for (int i = A.length() - 1, j = 0; i >= length; i--, j++) {
			if (A.charAt(i) != A.charAt(j)) {
				isPalindrome = false;
				break;
			}
			
//			System.out.println("j >>>" + A.charAt(j));
//			System.out.println("i >>>" + A.charAt(i));
		}
		
		System.out.println("Is palindrome? " + isPalindrome);

		sc.close();
	}

}
