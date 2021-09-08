package com.ztm.data.structure.trie;

import java.util.HashMap;

/**
 *
 * brunolima on Apr 26, 2021
 * 
 */

public class Node {

	HashMap<Character, Node> children = new HashMap<Character, Node>();
	boolean isWord = false;

	@Override
	public String toString() {
		return "Node {children=" + children + ", isWord=" + isWord + "}";
	}

}
