package com.leetcode.arrays;

/**
 *
 * brunolima on Mar 20, 2021
 * 
 */

public class _5_DVD {

	private String name;
	private int releaseYear;
	private String director;

	public _5_DVD(String name, int releaseYear, String director) {
		super();
		this.name = name;
		this.releaseYear = releaseYear;
		this.director = director;
	}

	@Override
	public String toString() {
		return "DVD [name=" + name + ", releaseYear=" + releaseYear + ", director=" + director + "]";
	}

}
