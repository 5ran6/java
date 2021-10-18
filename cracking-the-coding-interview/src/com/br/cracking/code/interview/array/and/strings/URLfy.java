package com.br.cracking.code.interview.array.and.strings;

/**
 *
 * brunolima on Oct 14, 2021
 * 
 * Write a method to replace all spaces in a string with '%20'. You may assume
 * that the string has sufficient space at the end to hold the additional
 * characters, and that you are given the "true" length of the string. (Note: if
 * implementing in Java, please use a character array so that you can perform
 * this operation in place.)
 * 
 */

public class URLfy {
	
	public static void main(String[] args) {
		String s = "Mr John Smith    ";
		
		int size = getSizeRealString(s) + 1;
		
		System.out.println(urlFy(s.toCharArray(), size));
	}

	private static int getSizeRealString(String s) {
		for (int i = s.length() - 1 ; i >= 0; i--) {
			if (s.charAt(i) != ' ') {
				return i;
			}
		}
		
		return -1;
	}

	private static String urlFy(char[] cs, int sizeReal) {
		System.out.println("cs.length >>> " + cs.length);
		System.out.println("length >>> " + sizeReal);
		
		int countSpaces = 0;
		
		for (int i = 0; i < sizeReal; i++) {
			if (cs[i] == ' ') {
				countSpaces++;
			} 
		}
		
		int lastIndexString = sizeReal + countSpaces * 2;
		
		if (lastIndexString == cs.length) {
			if (sizeReal < cs.length) cs[sizeReal] = '\0';
			
			for (int i = sizeReal - 1; i >= 0; i--) {
				if (cs[i] == ' ') {
					cs[lastIndexString - 1] = '0';
					cs[lastIndexString - 2] = '2';
					cs[lastIndexString - 3] = '%';
					lastIndexString = lastIndexString - 3;
				} else {
					cs[lastIndexString - 1] = cs[i];
					lastIndexString--;
				}
			}
		}
		
		return new String(cs);
	}

}
