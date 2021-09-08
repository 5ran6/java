package com.ztm.data.structure.trees;

import java.util.ArrayList;

/**
 *
 * brunolima on Apr 25, 2021
 * 
 */

public class TestMyBinarySearchTree {

	public static void main(String[] args) {
		MyBinarySearchTree bst = new MyBinarySearchTree();
		DepthFirstSearch dfs = new DepthFirstSearch();
		BreadthFirstSearch bfs = new BreadthFirstSearch();

//					9
//		4						20
//1				16		15			170
//		System.out.println(binarySearchTree);

		bst.insert(9);
//		System.out.println(binarySearchTree);

		bst.insert(4);
//		System.out.println(binarySearchTree);

		bst.insert(16);
//		System.out.println(binarySearchTree);

		bst.insert(20);
//		System.out.println(binarySearchTree);

		bst.insert(170);
//		System.out.println(binarySearchTree);

		bst.insert(15);
//		System.out.println(binarySearchTree);

		bst.insert(1);
//		System.out.println(binarySearchTree);

//		System.out.println(binarySearchTree.lookup(100));

//		binarySearchTree.remove(9);

//		System.out.println(binarySearchTree);

		// BreadthFirstSearch
		System.out.println("Breadth First Search: " + bfs.breadthFirstSearch(bst.root));

		ArrayList<Node> queue = new ArrayList<>();
		queue.add(bst.root);
		System.out.println("Breadth First Search Recursive: " + bfs.breadthFirstSearchRecursive(queue, new ArrayList<Integer>()));

		System.out.println("----------------------------------------------------------------------------");

		// DepthFirstSearch
		System.out.println("Traverse in order: " + dfs.traverseInOrder(bst.root, new ArrayList<Integer>()));
		System.out.println("Traverse pre order: " + dfs.traversePreOrder(bst.root, new ArrayList<Integer>()));
		System.out.println("Traverse post order: " + dfs.traversePostOrder(bst.root, new ArrayList<Integer>()));

	}

}
