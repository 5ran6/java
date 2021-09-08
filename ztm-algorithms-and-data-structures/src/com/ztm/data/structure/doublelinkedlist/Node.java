package com.ztm.data.structure.doublelinkedlist;

/**
 *
 * brunolima on Apr 24, 2021
 * 
 */

public class Node {

	int value;
	Node next;
	Node previous;

	public Node(int value) {
		this.value = value;
		this.next = null;
		this.previous = null;
	}
//
//	public int getValue() {
//		return value;
//	}
//
//	public void setValue(int value) {
//		this.value = value;
//	}
//
//	public Node getNext() {
//		return next;
//	}
//
//	public void setNext(Node next) {
//		this.next = next;
//	}
//
//	public Node getPrevious() {
//		return previous;
//	}
//
//	public void setPrevious(Node previous) {
//		this.previous = previous;
//	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", next=" + next + ", previous=" + previous + "]";
	}

}
