package codsignal;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

/**
 *
 * brunolima on Feb 10, 2021
 * 
 * You are given a string s. Consider the following algorithm applied to this
 * string:
 * 
 * Take all the prefixes of the string, and choose the longest palindrome
 * between them. If this chosen prefix contains at least two characters, cut
 * this prefix from s and go back to the first step with the updated string.
 * Otherwise, end the algorithm with the current string s as a result. Your task
 * is to implement the above algorithm and return its result when applied to
 * string s.
 * 
 * Note: you can click on the prefixes and palindrome words to see the
 * definition of the terms if you're not familiar with them.
 * 
 * Example
 * 
 * For s = "aaacodedoc", the output should be palindromeCutting(s) = "".
 * 
 * The initial string s = "aaacodedoc" contains only three prefixes which are
 * also palindromes - "a", "aa", "aaa". The longest one between them is "aaa",
 * so we cut if from s. Now we have string "codedoc". It contains two prefixes
 * which are also palindromes - "c" and "codedoc". The longest one between them
 * is "codedoc", so we cut if from the current string and obtain the empty
 * string. Finally the algorithm ends on the empty string, so the answer is "".
 * 
 * For s = "codesignal", the output should be palindromeCutting(s) =
 * "codesignal". The initial string s = "codesignal" contains the only prefix,
 * which is also palindrome - "c". This prefix is the longest, but doesn't
 * contain two characters, so the algorithm ends with string "codesignal" as a
 * result.
 * 
 * For s = "", the output should be palindromeCutting(s) = "".
 * 
 * Input/Output
 * 
 * [execution time limit] 3 seconds (java)
 * 
 * [input] string s
 * 
 * A string consisting of English lowercase letters.
 * 
 * Guaranteed constraints: 0 ≤ s.length ≤ 1000.
 * 
 * [output] string
 * 
 * The result of the described algorithm.
 * 
 */

public class PalindromeCutting {

	@Test
	public void palindromeCuttingTests() {

		// Expected Output: ""
		String test1 = "aaacodedoc";
		String test1Expected = "";
		assertEquals(test1Expected, palindromeCutting(test1));

		// Expected Output: "codesignal"
		String test2 = "codesignal";
		String test2Expected = "codesignal";
//		assertEquals(test2Expected, palindromeCutting(test2));

		// Expected Output: ""
		String test3 = "";
		String test3Expected = "";
//		assertEquals(test3Expected, palindromeCutting(test3));

		// Expected Output: "a"
		String test4 = "a";
		String test4Expected = "a";
//		assertEquals(test4Expected, palindromeCutting(test4));

		// Expected Output: "b"
		String test5 = "abbab";
		String test5Expected = "b";
//		assertEquals(test5Expected, palindromeCutting(test5));

		// Expected Output: "a"
		String test6 = "aaabba";
		String test6Expected = "a";
//		assertEquals(test6Expected, palindromeCutting(test6));

		// Expected Output: "b"
		String test7 = "aaaaaaab";
		String test7Expected = "b";
//		assertEquals(test7Expected, palindromeCutting(test7));

	}

	public String palindromeCutting(String s) {
		if (s.equals("") || s.length() == 1) return s;
		
		
		// aaacodedoc
		char[] charArray = s.toCharArray();
		for(int i = 0; i < charArray.length; i++) {
			System.out.println(charArray[i]);
		}
		
		String newS = s.substring(0, 3);
		System.out.println(newS);
		
		return null;
	}

}
