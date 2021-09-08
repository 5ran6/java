package global.sfotware.support.data.structure.in.java.arrays;

import java.util.Arrays;

/**
 *
 * brunolima on Jun 3, 2021
 * 
 * Your task is to construct an algorithm to check whether two words (or
 * phrases) are anagrams or not!
 * 
 * "An anagram is a word or phrase formed by rearranging the letters of a
 * different word or phrase, typically using all the original letters exactly
 * once"
 * 
 * For example: restful and fluster are anagrams.
 * 
 * Good luck!
 * 
 */

public class Anagram {

	public static void main(String[] args) {
		Anagram anagram = new Anagram();
		
		String s1 ="restful";
		String s2 ="fluster";
		
		String result = anagram.checkIsAnagram(s1.toCharArray(), s2.toCharArray());
		System.out.println(result);
	}

	private String checkIsAnagram(char[] cs1, char[] cs2) {
		if (cs1.length != cs2.length) return "Its not an anagram!";
		
		// Bottleneck because it has O(NlogN) running time
		Arrays.sort(cs1);
		Arrays.sort(cs2);
		
		// Running time is O(N)
		for (int i = 0; i < cs1.length; i++) {
			if (cs1[i] != cs2[i]) {
				return "It's not an anagram";
			}
		}
		
		
		return "They are an anagram ;)";
	}
	
}
