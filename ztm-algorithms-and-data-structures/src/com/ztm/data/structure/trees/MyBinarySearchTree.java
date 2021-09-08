package com.ztm.data.structure.trees;

/**
 *
 * brunolima on Apr 25, 2021
 * 
 */
public class MyBinarySearchTree extends BreadthFirstSearch {

	Node root;

	public MyBinarySearchTree() {
		this.root = null;
	}

	public MyBinarySearchTree insert(int value) {
		Node newNode = new Node(value);

		if (this.root == null) {
			this.root = newNode;
			return this;
		} else {
			Node currentNode = this.root;

			while (true) {
				if (value < currentNode.value) {
					// Add on Left
					if (currentNode.left == null) {
						currentNode.left = newNode;
						return this;
					}

					currentNode = currentNode.left;
				} else {
					// Add on Right
					if (currentNode.right == null) {
						currentNode.right = newNode;
						return this;
					}

					currentNode = currentNode.right;
				}
			}
		}
	}

	public boolean lookup(int value) {
		Node currentNode = this.root;

		while (currentNode != null) {
			if (currentNode.value > value) {
				currentNode = currentNode.left;
			} else if (currentNode.value < value) {
				currentNode = currentNode.right;
			} else {
				return true;
			}
		}

		return false;
	}

	public void remove(int value) {
		if (this.root == null) {
			return;
		}

		Node currentNode = this.root;
		Node parentNode = null;

		// while current is not null
		while (currentNode != null) {
			if (currentNode.value > value) {
				// go left
				parentNode = currentNode;
				currentNode = currentNode.left;
			} else if (currentNode.value < value) {
				// go right
				parentNode = currentNode;
				currentNode = currentNode.right;
			} else {
				// (current.value == value, means if we found the value to be removed)
				// Option 1: No right child (child means the child of current Node)
				if (currentNode.right == null) {
					// If parentNode is null means delete the root node
					if (parentNode == null) {
						this.root = currentNode.left;
					} else {
						// If currentNode < parentNode, make current left child a right child of parent
						if (currentNode.value < parentNode.value) {
							parentNode.left = currentNode.left;
						}
						// If currentNode > parentNode, make current's left child a right child of
						// parent
						else if (currentNode.value > parentNode.value) {
							parentNode.right = currentNode.left;
						}
					}
				}

				// Option 2: Right Child wich doesn't have a left child
				else if (currentNode.right.left == null) {
					if (parentNode == null) {
						this.root = currentNode.right;
					} else {
						// If currentNode < parentNode, make current's right child a left child of
						// parent
						if (currentNode.value < parentNode.value) {
							parentNode.left = currentNode.right;
						}

						// If currentNode > parentNode, make current's right child a right child of
						// parent
						else if (currentNode.value > parentNode.value) {
							parentNode.right = currentNode.right;
						}
					}
				}

				// Option 3: Right child which have left child
				else {
					if (parentNode == null) {
						// save reference of left and right nodes of the root
						Node leftNode = this.root.left;
						Node rightNode = this.root.right;

						// root.right.left node becomes new root
						this.root = currentNode.right.left;
						rightNode.left = rightNode.left.right;

						// set back the saved reference of left and right nodes of root
						this.root.left = leftNode;
						this.root.right = rightNode;
					} else {
						if (currentNode.value < parentNode.value) {
							parentNode.left = currentNode.right.left;
						} else if (currentNode.value > parentNode.value) {
							parentNode.right = currentNode.right.left;
						}
					}
				}

				return;
			}
		}
	}

	@Override
	public String toString() {
		return "MyBinarySearchTree [root=" + root + "]";
	}

}
