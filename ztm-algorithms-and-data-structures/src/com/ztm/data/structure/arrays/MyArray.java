package com.ztm.data.structure.arrays;

/**
*
* brunolima on Apr 22, 2021
* 
*/

public class MyArray {
	
	private int length;
	private Object[] data;
	
	public MyArray(int capacity) {
		this.length = 0;
		this.data = new Object[capacity];
	}
	
	public MyArray() {
		this(5);
	}
	
	public Object get(int index) {
		return this.data[index];
	}
	
	public int push(Object obj) {
		int sizeArray = this.data.length;
		
		if (this.length == sizeArray) {
			Object[] newData = new Object[this.length * 2];
			
			for (int i = 0; i < this.data.length; i++) {
				newData[i] = this.data[i];
			}
			
			this.data = newData;
		}
		
		this.data[this.length] = obj;
		
		this.length++;
		
		return this.length;
	}
	
	public boolean isEmpty() {
		return this.length == 0;
	}
	
	// array = [1, 2, 3, 4]
	// remove index 1 (value 2)
	
	public void delete(int index) {
		if(!(index >= 0 && index < this.length)) {
			throw new IllegalArgumentException("Invalid position!");
		}
		
		for (int i = index; i < this.length - 1; i++) {
			this.data[i] = this.data[i + 1];
		}
		
		this.length--;
	}
	
	public static void main(String[] args) {
		MyArray myArray = new MyArray();
		
		myArray.push("hi");
		myArray.push("nice");
		
		for (int i = 0; i < myArray.data.length; i++) {
			System.out.println(i + " : " + myArray.data[i]);
		}
		
		System.out.println("------------");
		
		myArray.push("to");
		myArray.push("meet");
		myArray.push("you");
		
		for (int i = 0; i < myArray.data.length; i++) {
			System.out.println(i + " : " + myArray.data[i]);
		}
		
		myArray.push("where");
		myArray.push("are");
		myArray.push("you");
		myArray.push("from");
		myArray.push("?");
		myArray.push("?");
		
		System.out.println("------------");
		
		for (int i = 0; i < myArray.data.length; i++) {
			System.out.println(i + " : " + myArray.data[i]);
		}
		
		System.out.println(myArray.get(0) + " : " +  myArray.get(1));
	}
}

