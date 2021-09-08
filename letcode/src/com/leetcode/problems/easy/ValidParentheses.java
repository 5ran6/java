package com.leetcode.problems.easy;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

/**
 *
 * brunolima on May 21, 2021
 * 
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and
 * ']', determine if the input string is valid.
 * 
 * An input string is valid if:
 * 
 * Open brackets must be closed by the same type of brackets. 
 * Open brackets must be closed in the correct order.
 * 
 * 
 * Example 1:
 * Input: s = "()" 
 * Output: true 
 * 
 * Example 2:
 * Input: s = "()[]{}" 
 * Output: true 
 * 
 * Example 3:
 * Input: s = "(]" 
 * Output: false 
 * 
 * Example 4:
 * Input: s = "([)]" 
 * Output: false 
 * 
 * Example 5:
 * Input: s = "{[]}" 
 * Output: true
 * 
 * Constraints:
 * 
 * 1 <= s.length <= 10(4) 
 * s consists of parentheses only '()[]{}'.
 * 
 */

public class ValidParentheses {
	
	public static void main(String[] args) {
		ValidParentheses vp = new ValidParentheses();
		
		String s1 = "()";
		String s2 = "()[]{}";
		String s3 = "(]";
		String s4 = "([)]";
		String s5 = "{[]}";
		String s6 = "){";
		
		System.out.println("IsValid: " + vp.isValidV1(s1));
		System.out.println("IsValid: " + vp.isValidV1(s2));
		System.out.println("IsValid: " + vp.isValidV1(s3));
		System.out.println("IsValid: " + vp.isValidV1(s4));
		System.out.println("IsValid: " + vp.isValidV1(s5));
		System.out.println("IsValid: " + vp.isValidV1(s6));
		
		System.out.println("============================");
		
		System.out.println("IsValid: " + vp.isValidV2(s1));
		System.out.println("IsValid: " + vp.isValidV2(s2));
		System.out.println("IsValid: " + vp.isValidV2(s3));
		System.out.println("IsValid: " + vp.isValidV2(s4));
		System.out.println("IsValid: " + vp.isValidV2(s5));
		System.out.println("IsValid: " + vp.isValidV2(s6));
		
		System.out.println("============================");
		
		System.out.println("IsValid: " + vp.isValidV3(s1));
		System.out.println("IsValid: " + vp.isValidV3(s2));
		System.out.println("IsValid: " + vp.isValidV3(s3));
		System.out.println("IsValid: " + vp.isValidV3(s4));
		System.out.println("IsValid: " + vp.isValidV3(s5));
		System.out.println("IsValid: " + vp.isValidV3(s6));
	}

	public boolean isValidV1(String s) {
		if (s.length() % 2 != 0 ) return false;
		
		char[] charArray = s.toCharArray();
		Stack<Character> stack = new Stack<>();
		
		int i = 0;
		
		for (i = 0; i < charArray.length; i++) {
			if (charArray[i] == '(') {
				stack.add(charArray[i]);
			} else if (charArray[i] == '[') {
				stack.add(charArray[i]);
			} else if (charArray[i] == '{') {
				stack.add(charArray[i]);
			} else if (charArray[i] == ')' && !stack.isEmpty() && stack.peek() == '(') {
				stack.pop();
			} else if (charArray[i] == '}' && !stack.isEmpty() && stack.peek() == '{') {
				stack.pop();
			} else if (charArray[i] == ']' && !stack.isEmpty() && stack.peek() == '[') {
				stack.pop();
			} else {
				break;
			}
		}

		return stack.isEmpty() && i == charArray.length;
	}
	
	public boolean isValidV2(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for (char c : s.toCharArray()) {
			if (c == '(') {
				stack.push(')');
			} else if (c == '[') {
				stack.push(']');
			} else if (c == '{' ) {
				stack.push('}');
			} else if (stack.isEmpty() || stack.pop() != c) {
				return false;
			}
		}
		
		return stack.isEmpty();
	}
	
	public boolean isValidV3(String s) {
        Map<Character, Character> brackets = new HashMap<>();
        Deque<Character> stack = new ArrayDeque<>();
        brackets.put('}', '{');
        brackets.put(']', '[');
        brackets.put(')', '(');
        
        for (int i = 0; i < s.length(); i++) {
            if (!brackets.containsKey(s.charAt(i))) {
                stack.addLast(s.charAt(i));
            } else if (stack.isEmpty() || !stack.removeLast().equals(brackets.get(s.charAt(i)))) {
                return false;
            }
        }
        
        return stack.isEmpty();
    }

}
