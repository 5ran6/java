package com.ztm.data.structure.trees;

import java.util.ArrayList;

/**
 *
 * brunolima on Apr 27, 2021
 * 
 */

public class DepthFirstSearch {
	// 101
	// 33 105

	// TRAVERSE IN ORDER => 33, 101, 105
	public ArrayList<Integer> traverseInOrder(Node node, ArrayList<Integer> array) {
		if (node.left != null) {
			traverseInOrder(node.left, array);
		}

		array.add(node.value);

		if (node.right != null) {
			traverseInOrder(node.right, array);
		}

		return array;
	}

	// TRAVERSE PRE ORDER => 101, 33, 105
	public ArrayList<Integer> traversePreOrder(Node node, ArrayList<Integer> array) {
		array.add(node.value);

		if (node.left != null) {
			traversePreOrder(node.left, array);
		}

		if (node.right != null) {
			traversePreOrder(node.right, array);
		}

		return array;
	}

	// TRAVERSE POST ORDER => 33, 105, 101
	public ArrayList<Integer> traversePostOrder(Node node, ArrayList<Integer> array) {
		if (node.left != null) {
			traversePostOrder(node.left, array);
		}

		if (node.right != null) {
			traversePostOrder(node.right, array);
		}

		array.add(node.value);

		return array;
	}

}
