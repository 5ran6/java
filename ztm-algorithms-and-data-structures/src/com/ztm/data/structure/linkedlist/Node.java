package com.ztm.data.structure.linkedlist;

/**
 *
 * brunolima on Apr 24, 2021
 * 
 */

public class Node {

	private int value;
	private Node next;
	
	public Node(int value) {
		this.value = value;
		this.next = null;
	}

	public Node(int value, Node next) {
		this.value = value;
		this.next = next;
	}

	public Node getNext() {
		return next;
	}
	
	public void setNext(Node next) {
		this.next = next;
	}

	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + "]";
	}

}
