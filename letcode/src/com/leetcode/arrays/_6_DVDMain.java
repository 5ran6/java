package com.leetcode.arrays;

/**
*
* brunolima on Mar 20, 2021
* 
*/

public class _6_DVDMain {
	
	public static void main(String[] args) {
		_5_DVD[] dvdArray = new _5_DVD[15];
		
		_5_DVD avengers = new _5_DVD("Avengers", 2019, "Unknow");
		_5_DVD batman = new _5_DVD("Batman Returns", 2012, "Unknow");
		
		dvdArray[0] = avengers;
		dvdArray[1] = batman;
		
		for (_5_DVD dvd : dvdArray) {
			System.out.println(dvd);
		}
		
	}

}

