package com.br.cracking.code.interview.array.and.strings;

import java.util.Arrays;

/**
 *
 * brunolima on Oct 15, 2021
 * 
 * Given a string, write a function to check if it is a permutation of a
 * palindrome. A palindrome is a word or phrase that is the same forwards and
 * backwards. A permutation is a rearrangement of letters. The palindrome does
 * not need to be limited to just dictionary words.
 * 
 */

public class PalindromePermutation {

	public static void main(String[] args) {
		String phrase = "tactc oapapa";

		System.out.println(phrase + " is palindrome? >>> " + isPermutationOfPalindrome(phrase));
	}

	private static boolean isPermutationOfPalindrome(String phrase) {
		if (phrase == null || phrase.isEmpty()) {
			return false;
		}

//		int[] tableAlphabet = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];
		int[] tableAlphabet = new int[26];

//		System.out.println(tableAlphabet.length);
//		System.out.println(Arrays.toString(tableAlphabet));

		fillTableAlphabet(tableAlphabet, phrase);

//		int countOdd = countOddSolution1(tableAlphabet);
//		return countOdd <= 1;

//		return countOddSolution2(tableAlphabet);

		int bitVector = countOddSolution3(phrase);
		return bitVector == 0 || checkExactlyOneBitSet(bitVector);
	}

	private static boolean checkExactlyOneBitSet(int bitVector) {
		return (bitVector & (bitVector - 1)) == 0;
	}

	private static int countOddSolution1(int[] tableAlphabet) {
		int countOdd = 0;

		for (int i = 0; i < tableAlphabet.length; i++) {
			if (tableAlphabet[i] % 2 == 0) {
				continue;
			} else if (tableAlphabet[i] % 2 == 1) {
				countOdd++;
			}
		}
		return countOdd;
	}

	private static boolean countOddSolution2(int[] tableAlphabet) {
		boolean foundOdd = false;

		for (int i = 0; i < tableAlphabet.length; i++) {
			if (tableAlphabet[i] % 2 == 1) {
				if (foundOdd) {
					return false;
				}

				foundOdd = true;
			}
		}

		return foundOdd;
	}

	private static int countOddSolution3(String phrase) {
		int bitVector = 0;

		for (char c: phrase.toCharArray()) {
			int x = getCharFromAlphabet(c);

			bitVector = toggle(bitVector, x);
		}

		return bitVector;
	}

	private static int toggle(int bitVector, int index) {
		if (index < 0)
			return bitVector;

		int mask = 1 << index;

		if ((bitVector & mask) == 0) {
			bitVector |= mask;
		} else {
			bitVector &= ~mask;
		}

		return bitVector;
	}

	private static void fillTableAlphabet(int[] tableAlphabet, String phrase) {

		for (int i = 0; i < phrase.length(); i++) {
			int pos = getCharFromAlphabet(phrase.charAt(i));

			if (pos != -1) {
				tableAlphabet[pos]++;
			}
		}

		System.out.println(Arrays.toString(tableAlphabet));
	}

	private static int getCharFromAlphabet(char charAt) {
		int valueA = Character.getNumericValue('a'); // value 10
		int valueZ = Character.getNumericValue('z'); // value 35
		int valueCharArt = Character.getNumericValue(charAt);

		if (valueCharArt >= valueA && valueCharArt <= valueZ) {
			return valueCharArt - valueA;
		}

		return -1;
	}

}
