package com.ztm.data.structure.arrays;

/**
*
* brunolima on Apr 23, 2021
* 
*/

public class ReverseString {
	
	public static void main(String[] args) {
		String hi = "Hi my name is Bruno";
		System.out.println("Length hi: " + hi.length());
//		String hi = null;
		
		System.out.println("String: " + hi);
		System.out.println("String reverse: " + reverseString(hi));
	}

	private static String reverseString(String hi) {
		StringBuilder sb = new StringBuilder();

		if (hi != null && hi != "") {
			char[] array = hi.toCharArray();
			
			for (int i = array.length - 1; i >= 0; i--) {
				sb.append(array[i]);
			}
		}
		
		return sb.toString();
	}

}

