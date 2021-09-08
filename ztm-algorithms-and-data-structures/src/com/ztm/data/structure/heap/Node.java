package com.ztm.data.structure.heap;

/**
*
* brunolima on Apr 26, 2021
* 
*/

public class Node {
	
	String value;
	int priority;
	
	public Node(String value, int priority) {
		this.value = value;
		this.priority = priority;
	}

	@Override
	public String toString() {
		return "Node [value=" + value + ", priority=" + priority + "]";
	}
	
}

