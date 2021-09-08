package com.leetcode.problems.easy;

import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * brunolima on May 13, 2021
 * 
 */

public class PalindromeNumber {

	public static void main(String[] args) {
		PalindromeNumber pn = new PalindromeNumber();
	
		System.out.println(pn.isPalindrome(121));
		System.out.println(pn.isPalindrome(10));
		System.out.println(pn.isPalindrome(101101));
		System.out.println(pn.isPalindrome(01));
	}
	
	public boolean isPalindrome(int value) {
		String valueS = String.valueOf(value);
		
		Stack<Character> stack = new Stack<>();
		LinkedList<Character> queue = new LinkedList<>();
		
		for (int i = 0; i < valueS.length(); i++) {
			stack.add(valueS.charAt(i));
			queue.add(valueS.charAt(i));
		}
		
		for (int i = 0; i < valueS.length(); i++) {
			if (stack.pop() != queue.poll()) {
				return false;
			}
		}
		
		return true;
	}

}
