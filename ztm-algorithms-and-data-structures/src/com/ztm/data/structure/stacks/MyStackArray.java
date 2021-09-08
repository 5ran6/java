package com.ztm.data.structure.stacks;

import java.util.ArrayList;

/**
*
* brunolima on Apr 25, 2021
* 
*/

public class MyStackArray {
	
	ArrayList<Integer> array;
	
	public MyStackArray() {
		this.array = new ArrayList<>();
	}
	
	public Integer peek() {
		if (this.array.size() > 0) {
			return this.array.get(this.array.size() - 1);
		}
		
		return null;
	}
	
	public void push (int value) {
		this.array.add(value);
	}
	
	public void pop() {
		this.array.remove(array.size() - 1);
	}
	
	public boolean isEmpty() {
		return this.array.size() == 0;
	}
	
}

