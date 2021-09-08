package com.ztm.data.structure.trees;

/**
 *
 * brunolima on Apr 25, 2021
 * 
 */

public class Node {

	Node left;
	Node right;
	int value;

	public Node(int value) {
		this.left = null;
		this.right = null;
		this.value = value;
	}

	@Override
	public String toString() {
		return "Node [left=" + left + ", right=" + right + ", value=" + value + "]";
	}

}
