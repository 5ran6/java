package com.ztm.data.structure.stacks;

/**
*
* brunolima on Apr 25, 2021
* 
*/

public class MyStack {
	
	private int length;
	private Node bottom;
	private Node top;
	
	public MyStack() {
		this.length = 0;
		this.bottom = null;
		this.top = null;
	}
	
	public Integer peek() {
		if (this.length > 0) {
			return this.top.value;
		} else {
			return null;
		}
	}
	
	public void push (int value) {
		Node newNode = new Node(value);
		
		if(this.length == 0) {
			this.top = newNode;
			this.bottom = newNode;
		} else {
			newNode.next = this.top;
			this.top = newNode;
		}
		
		this.length++;
	}
	
	public void pop() {
		if (this.length > 0) {
			this.top = this.top.next;
			
			if (this.length == 1) {
				this.bottom = null;
			}
			
			this.length--;
		}
	}
	
	public Integer getLastElement() {
		if (this.length > 0) {
			return this.bottom.value;
		}
		
		return null;
	}
	
	public boolean isEmpty() {
		return this.length == 0;
	}

	@Override
	public String toString() {
		return "MyStack [length=" + length + ", bottom=" + bottom + ", top=" + top + "]";
	}
	
}

