package com.leetcode.problems.easy;

import java.util.Map;

/**
 *
 * brunolima on May 13, 2021
 * 
 */

public class RomanToInteger {

//	Roman numerals are usually written largest to smallest from left to right. 
//	However, the numeral for four is not IIII. Instead, the number four is written as IV. 
//	Because the one is before the five we subtract it making four. 
//	The same principle applies to the number nine, which is written as IX. 
//	There are six instances where subtraction is used:
//	I (1) can be placed before V (5) and X (10) to make 4 and 9. 
//	X (10) can be placed before L (50) and C (100) to make 40 and 90. 
//	C (100) can be placed before D (500) and M (1000) to make 400 and 900.

	public static void main(String[] args) {
		RomanToInteger rti = new RomanToInteger();

		System.out.println(rti.romanToInt("III")); // 3
		System.out.println(rti.romanToInt("IV"));  // 4
		System.out.println(rti.romanToInt("IX"));  // 9 
		System.out.println(rti.romanToInt("LVIII"));  // 58
		System.out.println(rti.romanToInt("LXXXIX")); // 89
		System.out.println(rti.romanToInt("D")); // 500
		System.out.println(rti.romanToInt("M")); // 1000
	}

	public int romanToInt(String value) {
		Map<Character, Integer> mapRomanNumeral = Map.of(
				'I', 1, 
				'V', 5, 
				'X', 10, 
				'L', 50, 
				'C', 100, 
				'D', 500, 
				'M', 1000);
		
		char[] charArray = value.toCharArray();
		
		int sum = 0;
		
		for (int i = charArray.length - 1; i >= 0; i--) {
			char current = charArray[i];
			char previous = i >= 1 ? charArray[i - 1] : charArray[i];
			
			if (previous == 'I' && (current == 'V' || current == 'X')) {
				sum += mapRomanNumeral.get(current) - mapRomanNumeral.get(previous);
				i--;
			} else if (previous == 'X' && (current == 'L' || current == 'C')) {
				sum += mapRomanNumeral.get(current) - mapRomanNumeral.get(previous);
				i--;
			} else if (previous == 'C' && (current == 'D' || current == 'M')) {
				sum += mapRomanNumeral.get(current) - mapRomanNumeral.get(previous);
				i--;
			} else {
				sum += mapRomanNumeral.get(current);	
			}
		}
		
		return sum;
	}

}
