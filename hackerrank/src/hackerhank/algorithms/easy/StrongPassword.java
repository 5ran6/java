package hackerhank.algorithms.easy;

import java.util.regex.Pattern;

/**
 *
 * brunolima on Sep 18, 2021
 * 
 * @see https://www.hackerrank.com/challenges/strong-password/problem
 * 
 */

public class StrongPassword {

	public static void main(String[] args) {
		String password = "#HackerRank";

		System.out.println(minimumNumber(2, password));

	}

	public static int minimumNumber(int n, String password) {
		// Return the minimum number of characters to make the password strong
		if (password == null || password.isBlank()) {
			return 6;
		}

		int count = 0;

		// check if contains numbers -> 0123456789
		if (!Pattern.compile("(\\d)").matcher(password).find()) {
			count++;
		}

		// check if contains letters uppercase -> ABCDEFGHIJKLMNOPQRSTUVWXYZ
		if (!Pattern.compile("([A-Z])").matcher(password).find()) {
			count++;
		}

		// check if contains letters lowercase -> abcdefghijklmnopqrstuvwxyz
		if (!Pattern.compile("([a-z])").matcher(password).find()) {
			count++;
		}

		// check if contains special characters -> (!@#$%^&*()-+)
		if (!Pattern.compile("(\\W)").matcher(password).find()) {
			count++;
		}
		
		if ((count + password.length()) < 6) {
			count = count + 6 - (count + password.length());
		}

		return count;
	}

}
