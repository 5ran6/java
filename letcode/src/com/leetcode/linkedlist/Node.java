package com.leetcode.linkedlist;

/**
*
* brunolima on Jun 3, 2021
* 
*/

public class Node {
	
	int val;
	Node next;
	
	public Node(int val) {
		this.val = val;
	}
	
	public Node(int val, Node next) {
		this.val = val;
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [val=" + val + ", next=" + next + "]";
	}
	
}

