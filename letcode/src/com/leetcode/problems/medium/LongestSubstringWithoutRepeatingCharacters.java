package com.leetcode.problems.medium;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * brunolima on Mar 17, 2021
 * 
 * Given a string s, find the length of the longest substring without repeating
 * characters.
 * 
 * Example 1: Input: s = "abcabcbb" Output: 3 Explanation: The answer is "abc",
 * with the length of 3.
 * 
 * Example 2: Input: s = "bbbbb" Output: 1 Explanation: The answer is "b", with
 * the length of 1.
 * 
 * Example 3: Input: s = "pwwkew" Output: 3 Explanation: The answer is "wke",
 * with the length of 3. Notice that the answer must be a substring, "pwke" is a
 * subsequence and not a substring.
 * 
 * Example 4: Input: s = "" Output: 0
 * 
 * 
 * Constraints:
 * 
 * 0 <= s.length <= 5 * 104 s consists of English letters, digits, symbols and
 * spaces.
 * 
 */

public class LongestSubstringWithoutRepeatingCharacters {

	@Test
	public void test01() {
		int expected1 = 3;
//		int result1 = lengthOfLongestSubstring01("abcabcbb");
//		int result1 = lengthOfLongestSubstring02("abcabcbb");
//		int result1 = lengthOfLongestSubstring03("abcabcbb");
		int result1 = lengthOfLongestSubstring04("abcabcbb");
		Assert.assertEquals(expected1, result1);
	}

	@Test
	public void test02() {
		int expected2 = 1;
//		int result2 = lengthOfLongestSubstring01("bbbbb");
//		int result2 = lengthOfLongestSubstring02("bbbbb");
//		int result2 = lengthOfLongestSubstring03("bbbbb");
		int result2 = lengthOfLongestSubstring04("bbbbb");
		Assert.assertEquals(expected2, result2);
	}

	@Test
	public void test03() {
		int expected3 = 3;
//		int result3 = lengthOfLongestSubstring01("pwwkew");
//		int result3 = lengthOfLongestSubstring02("pwwkew");
//		int result3 = lengthOfLongestSubstring03("pwwkew");
		int result3 = lengthOfLongestSubstring04("pwwkew");
		Assert.assertEquals(expected3, result3);
	}

	@Test
	public void test04() {
		int expected4 = 0;
//		int result4 = lengthOfLongestSubstring01("");
//		int result4 = lengthOfLongestSubstring02("");
//		int result4 = lengthOfLongestSubstring03("");
		int result4 = lengthOfLongestSubstring04("");
		Assert.assertEquals(expected4, result4);

	}

	public int lengthOfLongestSubstring04(String s) {
		Integer[] chars = new Integer[128];

		int left = 0;
		int right = 0;

		int res = 0;
		while (right < s.length()) {
			char r = s.charAt(right);

			Integer index = chars[r];
			if (index != null && index >= left && index < right) {
				left = index + 1;
			}

			res = Math.max(res, right - left + 1);

			chars[r] = right;
			right++;
		}

		return res;
	}

	public int lengthOfLongestSubstring03(String s) {
		int n = s.length(), ans = 0;
		Map<Character, Integer> map = new HashMap<>(); // current index of character

		// try to extend the range [i, j]
		for (int j = 0, i = 0; j < n; j++) {
			if (map.containsKey(s.charAt(j))) {
				i = Math.max(map.get(s.charAt(j)), i);
			}
			ans = Math.max(ans, j - i + 1);
			map.put(s.charAt(j), j + 1);
		}
		return ans;
	}

	public int lengthOfLongestSubstring02(String s) {
		int[] chars = new int[128];

		int left = 0;
		int right = 0;

		int res = 0;
		while (right < s.length()) {
			char r = s.charAt(right);
			chars[r]++;

			while (chars[r] > 1) {
				char l = s.charAt(left);
				chars[l]--;
				left++;
			}

			res = Math.max(res, right - left + 1);

			right++;
		}
		return res;
	}

	public int lengthOfLongestSubstring01(String s) {
		int n = s.length();
		int res = 0;

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				if (checkRepetition(s, i, j)) {
					res = Math.max(res, j - i + 1);
				}
			}
		}

		return res;
	}

	private boolean checkRepetition(String s, int start, int end) {
		int[] chars = new int[128];

		for (int i = start; i <= end; i++) {
			char c = s.charAt(i);
			chars[c]++;

			if (chars[c] > 1) {
				return false;
			}
		}

		return true;
	}
}
