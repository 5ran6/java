package com.ztm.data.structure.trees;

import java.util.ArrayList;

/**
*
* brunolima on Apr 27, 2021
* 
*/

public class BreadthFirstSearch {
	
	public ArrayList<Integer> breadthFirstSearch(Node root) {
		Node currentNode = root;
		ArrayList<Integer> resultArray = new ArrayList<>();
		ArrayList<Node> queue = new ArrayList<>();

		queue.add(currentNode);

		while (queue.size() > 0) {
			currentNode = queue.remove(0);
			resultArray.add(currentNode.value);

			if (currentNode.left != null) {
				queue.add(currentNode.left);
			}

			if (currentNode.right != null) {
				queue.add(currentNode.right);
			}
		}

		return resultArray;
	}

	public ArrayList<Integer> breadthFirstSearchRecursive(ArrayList<Node> queue, ArrayList<Integer> array) {
		if (queue.size() == 0) {
			return array;
		}

		Node currentNode = queue.remove(0);
		array.add(currentNode.value);

		if (currentNode.left != null) {
			queue.add(currentNode.left);
		}

		if (currentNode.right != null) {
			queue.add(currentNode.right);
		}

		return breadthFirstSearchRecursive(queue, array);
	}

}
