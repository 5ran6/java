package com.leetcode.problems.easy;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * brunolima on May 24, 2021
 * 
 * Given two binary strings a and b, return their sum as a binary string.
 * 
 * Example 1: Input: a = "11", b = "1" Output: "100"
 * 
 * Example 2: Input: a = "1010", b = "1011" Output: "10101"
 * 
 * Therefore in binary: 
 * 0 + 0 = 0 
 * 0 + 1 = 1 
 * 1 + 0 = 1 
 * 1 + 1 = 10 (which is 0 carry 1)
 * 
 */

public class AddBinary {

	public static void main(String[] args) {
		AddBinary ab = new AddBinary();

		System.out.println("Result >>> " + ab.addBinaryV2("11", "1")); // Result >>> 100
		System.out.println("Result >>> " + ab.addBinaryV2("1010", "1011")); // Result >>> 10101
		
//		ab.transformHexaDecimalToBinary();
	}
	
	
	public String addBinarV1(String a, String b) {
		StringBuilder sb = new StringBuilder();
		
		int i = a.length() - 1;
		int j = b.length() - 1;
		int carry = 0;
		
		while (i >= 0 || j >= 0) {
			int sum = carry;
			
			if (i >= 0) {
				sum += a.charAt(i) - '0';
			}
			
			if (j >= 0) {
				sum += b.charAt(j) - '0';
			}
			
			sb.append(sum % 2);
			carry = sum / 2;
			
			i--;
			j--;
		}
		
		if (carry != 0) {
			sb.append(carry);
		}
		
		return sb.reverse().toString();
	}
	
	public String addBinaryV2(String a, String b) {
		BigInteger aa = new BigInteger(a, 2);
		BigInteger bb = new BigInteger(b, 2);
		return aa.add(bb).toString(2);
	}

	
	public void transformHexaDecimalToBinary( ) {
		executeTransformHexaDecimalToBinary(11);
		executeTransformHexaDecimalToBinary(174);
	}
	
	public void executeTransformHexaDecimalToBinary(int num) {
		int numOriginal = num;
		
		List<Integer> ls = new ArrayList<>();
		
		while(num > 0) {
			ls.add(num % 2);
			num = num / 2;
		}
		
		System.out.println("Num: " + numOriginal + " converted to binary is: " + 
				ls.stream().map((Integer i) -> i.toString())
				.collect(Collectors.joining()));
	}
 	
}
