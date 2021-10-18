package com.br.cracking.code.interview.array.and.strings;

/**
 *
 * brunolima on Oct 15, 2021
 * 
 * Implement a method to perform basic string compression using the counts of
 * repeated characters. For example, the string aabcccccaaa would become
 * a2blc5a3. If the "compressed" string would not become smaller than the
 * original string, your method should return the original string. You can
 * assume the string has only uppercase and lowercase letters (a - z).
 * 
 */

public class StringCompression {

	public static void main(String[] args) {
		String s = "aabcccccaaaaaaaa";

		System.out.println(compressString(s));
	}

	private static String compressString(String s) {
		System.out.println(s);

		StringBuilder sb = new StringBuilder();

		int count = 0;

		for (int i = 0; i < s.length(); i++) {
			count++;

			/* If next character is different than current, append this char to result. */
			if (i + 1 >= s.length() || s.charAt(i) != s.charAt(i + 1)) {
				sb.append(s.charAt(i)).append(count);
				count = 0;
			}
		}

//		return sb.length() < s.length() ? s : sb.toString();
		return sb.toString();
	}

}
