package hackerhank.algorithms.easy;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Stack;

/**
 *
 * brunolima on Sep 8, 2021
 * 
 * @see https://www.hackerrank.com/challenges/reduced-string/problem
 */

public class SuperReducedString {

	public static void main(String[] args) {
//		String s1 = "aaabccddd";
//		System.out.println(superReducedStringV1(s1));
//
//		String s2 = "aa";
//		System.out.println(superReducedStringV1(s2));
//
//		String s3 = "baab";
//		System.out.println(superReducedStringV1(s3));
//
//		String s4 = "";
//		System.out.println(superReducedStringV1(s4));
//
//		String s5 = "b";
//		System.out.println(superReducedStringV1(s5));
//		
//		String s6 = "aaabccddd";
//		System.out.println(superReducedStringV2(s6));
		
		String s7= "aaabccddd";
		System.out.println(superReducedStringV3(s7));
	}
	
	public static String superReducedStringV1(String s) {
		while(true) {
			// Used for loop termination
			int len = s.length();
			
			// "(.)" is a capturing group that captures any character
            // "\\1" is a backreference that will match the character captured by the first capturing group (i.e. the one captured by "(.)")
            s = s.replaceAll("(.)\\1", "");
            
            if (s.length() == len) {
            	break;
            }
		}
		
		return s.isEmpty() ? "Empty String" : s;
	}
	
	public static String superReducedStringV2(String s) {
		LinkedList<Character> linkedList = new LinkedList<Character>();
		
		for (int i = 0; i < s.length(); i++) {
			char charAt = s.charAt(i);
			
			if(!linkedList.isEmpty() && (linkedList.peekLast() == charAt)) {
				linkedList.removeLast();
			} else {
				linkedList.addLast(charAt);
			}
			
			System.out.println("linkedList >>> " + linkedList);
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (Character character : linkedList) {
			sb.append(character);
		}
		
		return sb.toString().equals("") ? "Empty String" : sb.toString();
	}
	
	
	public static String superReducedStringV3(String s) {
		Stack<Character> stack = new Stack<Character>();
		
		for (int i = s.length() - 1; i >= 0; i--) {
			if (!stack.isEmpty() && (stack.peek() == s.charAt(i))) {
				stack.pop();
			} else {
				stack.add(s.charAt(i));
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		Iterator<Character> it = stack.iterator();
		while(it.hasNext()) {
			sb.append(it.next());
		}
		
		sb.reverse();
		
		
		return sb.toString().equals("") ? "Empty String" : sb.toString();
	}

}
