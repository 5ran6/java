package com.ztm.data.structure.stacks;

/**
 *
 * brunolima on Apr 24, 2021
 * 
 */

public class Node {

	int value;
	Node next;
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}
	
	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}

}
