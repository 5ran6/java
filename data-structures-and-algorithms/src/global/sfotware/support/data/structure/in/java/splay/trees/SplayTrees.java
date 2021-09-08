package global.sfotware.support.data.structure.in.java.splay.trees;

import global.sfotware.support.data.structure.in.java.avl.trees.Node;

/**
 *
 * brunolima on Jun 9, 2021
 * 
 */

public class SplayTrees<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	public void insert(T data) {
		// this is when we insert the first node into BST (parent is NULL)
		if (root == null) {
			root = new Node<>(data, null);
		} else {
			// there are already items in the BST
			insert(data, root);
		}
	}

	private void insert(T data, Node<T> node) {
		// this is the case when the data is SMALLER then the node
		if (node.getData().compareTo(data) > 0) {
			// there is a valid (not NULL) left child so we go there
			if (node.getLeftChild() != null) {
				insert(data, node.getLeftChild());
				// the left child is a NULL so we create a left child
			} else {
				Node<T> newNode = new Node<>(data, node);
				node.setLeftChild(newNode);
				// we have to do splaying (have to make rotations)
				splay(newNode);
			}
		}
		// this is the case when the data is GREATER then the node
		// go to the right subtree
		else {
			// there is a valid (not NULL) right child so we go there
			if (node.getRightChild() != null) {
				insert(data, node.getRightChild());
				// the right child is a NULL so we create a left child
			} else {
				Node<T> newNode = new Node<>(data, node);
				node.setRightChild(newNode);
				// we have to do splaying (have to make rotations)
				splay(newNode);
			}
		}
	}

	// this is when we make rotations on the new node to become the root node
	private void splay(Node<T> node) {
		// while the node is not the root node
		while(node.getParentNode() != null) {
			// if the grandparent is null it means that we have to make a imsple rotation
			// ZIG CASE
			if (node.getParentNode().getParentNode() == null) {
				// if the node is the left child of the root then RIGHT ROTATE on the root
				if (node.getParentNode().getLeftChild() == node) {
					rightRotation(node.getParentNode());
				} else {
					// if the node is the right child of the root then LEFT ROTATE on the root
					leftRotation(node.getParentNode());
				}
			}
			
			// ZIG-ZIG CASE
			else if (node.getParentNode().getLeftChild() == node 
					&& node.getParentNode().getParentNode().getLeftChild() == node.getParentNode()) {
				rightRotation(node.getParentNode().getParentNode());
				rightRotation(node.getParentNode());
			// this is the symmetric partner of the ZIG-ZIG situation	
			} else if (node.getParentNode().getRightChild() == node 
					&& node.getParentNode().getParentNode().getRightChild() == node.getParentNode()) {
				leftRotation(node.getParentNode().getParentNode());
				leftRotation(node.getParentNode());
			}
			
			// ZIG-ZAG CASE
			else if (node.getParentNode().getLeftChild() == node 
					&& node.getParentNode().getParentNode().getRightChild() == node.getParentNode()) {
				rightRotation(node.getParentNode());
				leftRotation(node.getParentNode());
			} else {
				leftRotation(node.getParentNode());
				rightRotation(node.getParentNode());
			}
		}
		
	}

	@Override
	public void traverse() {
		if (root != null)
			traverse(root);
	}

	private void traverse(Node<T> node) {
		if (node.getLeftChild() != null) {
			traverse(node.getLeftChild());
		}

		System.out.println(node + " - ");

		if (node.getRightChild() != null) {
			traverse(node.getRightChild());
		}
	}

	@Override
	public T getRoot() {
		if (root == null)
			return null;

		return root.getData();
	}

	@Override
	public T find(T data) {
		if (root == null)
			return null;

		return find(data, root);
	}

	private T find(T data, Node<T> node) {
		// this is when we look for a given item in the tree
		if (data.compareTo(node.getData()) < 0) {
			find(data, node.getLeftChild());
		} else if (data.compareTo(node.getData()) > 0) {
			find(data, node.getRightChild());
		} else {
			// WE HAVE FOUND THE ITEM WE ARE LOOKING FOR
			splay(node);
			return data;
		}

		return null;
	}

	// it can be done in O(1)
	private void rightRotation(Node<T> node) {
		System.out.println("Rotating right on node " + node);
		// Node<T> node A

		// this is the new root node after rotation (node B)
		Node<T> tempLeftChild = node.getLeftChild();

		// node C
		Node<T> grandChild = tempLeftChild.getRightChild();

		// make the rotation - the new root node will be the tempLeftChild
		tempLeftChild.setRightChild(node);
		node.setLeftChild(grandChild);

		// we have to handle the parents
		if (grandChild != null) {
			grandChild.setParentNode(node);
		}

		// we have to handle the parents for the node
		Node<T> tempParent = node.getParentNode();
		node.setParentNode(tempLeftChild);
		tempLeftChild.setParentNode(tempParent);

		// we have to handle the parent
		if (tempLeftChild.getParentNode() != null && tempLeftChild.getParentNode().getLeftChild() == node) {
			tempLeftChild.getParentNode().setLeftChild(tempLeftChild);
		}

		if (tempLeftChild.getParentNode() != null && tempLeftChild.getParentNode().getRightChild() == node) {
			tempLeftChild.getParentNode().setRightChild(tempLeftChild);
		}

		// no parent after rotation because it has become the root node
		if (node == root) {
			root = tempLeftChild;
		}
	}

	// it can be done in O(1)
	private void leftRotation(Node<T> node) {
		System.out.println("Rotating left on node " + node);
		// Node<T> node A

		// this is the new root node after rotation (node B)
		Node<T> tempRightChild = node.getRightChild();

		// node C
		Node<T> grandChild = tempRightChild.getLeftChild();

		// make the rotation - the new root node will be the tempLeftChild
		tempRightChild.setLeftChild(node);
		node.setRightChild(grandChild);

		// we have to handle the parents
		if (grandChild != null) {
			grandChild.setParentNode(node);
		}

		// we have to handle the parents for the node
		Node<T> tempParent = node.getParentNode();
		node.setParentNode(tempRightChild);
		tempRightChild.setParentNode(tempParent);

		// we have to handle the parent
		if (tempRightChild.getParentNode() != null && tempRightChild.getParentNode().getLeftChild() == node) {
			tempRightChild.getParentNode().setLeftChild(tempRightChild);
		}

		if (tempRightChild.getParentNode() != null && tempRightChild.getParentNode().getRightChild() == node) {
			tempRightChild.getParentNode().setRightChild(tempRightChild);
		}

		// no parent after rotation because it has become the root node
		if (node == root) {
			root = tempRightChild;
		}
	}

}
