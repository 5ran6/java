package com.br.cracking.code.interview.array.and.strings;

/**
 *
 * brunolima on Oct 14, 2021
 * 
 * Is Unique: Implement an algorithm to determine if a string has all unique
 * characters. What if you cannot use additional data structures?
 * 
 */

public class IsUnique {

	public static void main(String[] args) {
		String word = "abca";

		System.out.println(word + " has unique chars? " + isUniqueChars(word));
		System.out.println(word + " has unique chars? " + isUniqueCharsLowerCase(word));
	}

//	The time complexity for this code is O(n)
//	The space complexity is O(1).

	private static boolean isUniqueChars(String word) {
		boolean[] alphabet = new boolean[128];

		for (int i = 0; i < word.length(); i++) {
			int idx = Character.getNumericValue(word.charAt(i));

			if (alphabet[idx] == true) {
				return false;
			} else {
				alphabet[idx] = true;
			}
		}

		return true;
	}

	/**
	 * https://www.geeksforgeeks.org/bitwise-operators-in-java/
	 * 
	 * Bitwise OR (|) => This operator is a binary operator, denoted by ‘|’. It
	 * returns bit by bit OR of input values, i.e, if either of the bits is 1, it
	 * gives 1, else it gives 0.
	 * 
	 * Bitwise AND (&) => This operator is a binary operator, denoted by ‘&’. It
	 * returns bit by bit AND of input values, i.e, if both bits are 1, it gives 1,
	 * else it gives 0.
	 * 
	 * Bitwise XOR (^) => This operator is a binary operator, denoted by ‘^’. It
	 * returns bit by bit XOR of input values, i.e, if corresponding bits are
	 * different, it gives 1, else it gives 0.
	 * 
	 * Bitwise Complement (~) => This operator is a unary operator, denoted by ‘~’.
	 * It returns the one’s complement representation of the input value, i.e, with
	 * all bits inverted, which means it makes every 0 to 1, and every 1 to 0.
	 * 
	 * Signed Right shift operator (>>) – Shifts the bits of the number to the right
	 * and fills the voids left with the sign bit (1 in case of negative number and
	 * 0 in case of positive number). The leftmost bit and a depends on the sign of
	 * initial number. Similar effect as of dividing the number with some power of
	 * two.
	 * 
	 * Unsigned Right shift operator (>>>) – Shifts the bits of the number to the
	 * right and fills 0 on voids left as a result. The leftmost bit is set to 0.
	 * (>>>) is unsigned-shift; it’ll insert 0. (>>) is signed, and will extend the
	 * sign bit.
	 * 
	 * Left shift operator (<<) – Shifts the bits of the number to the left and
	 * fills 0 on voids left as a result. Similar effect as of multiplying the
	 * number with some power of two.
	 * 
	 * Unsigned Left shift operator (<<<) – Unlike unsigned Right Shift, there is no
	 * “<<<” operator in Java, because the logical (<<) and arithmetic left-shift
	 * (<<<) operations are identical.
	 * 
	 */

	private static boolean isUniqueCharsLowerCase(String word) {
		int checker = 0;

		for (int i = 0; i < word.length(); i++) {
			int val = word.charAt(i) - 'a';

			if ((checker & (1 << val)) > 0) {
				return false;
			}

			checker |= (1 << val);
		}

		return true;
	}

}
