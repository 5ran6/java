package global.sfotware.support.data.structure.in.java.red.black.trees;

/**
 *
 * brunolima on Jun 9, 2021
 * 
 */

public class RedBlackTree<T extends Comparable<T>> implements Tree<T> {

	private Node<T> root;

	@Override
	public void insert(T data) {
		// this is when we insert the first node into BST (parent is NULL)
		if (root == null) {
			root = new Node<>(data, null);
			settleViolations(root);
		} else {
			// there are already items in the BST
			insert(data, root);
		}
	}

	// O(logN)
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

				// WE HAVE TO CHECK whether the red black properties are violated
				settleViolations(newNode);
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

				// WE HAVE TO CHECK whether the red black properties are violated
				settleViolations(newNode);
			}
		}
	}

	@Override
	public void remove(T data) {
		if (root != null) {
			remove(data, root);
		}
	}

	private void remove(T data, Node<T> node) {
		if (node == null)
			return;

		// first we have to search for the item we want to remove
		if (data.compareTo(node.getData()) < 0) {
			remove(data, node.getLeftChild());
		} else if (data.compareTo(node.getData()) > 0) {
			remove(data, node.getRightChild());
		} else {
			// we have found the item we want to remove

			// if the node is a leaf node (without left and right children)
			// this is the case 1
			if (node.getLeftChild() == null && node.getRightChild() == null) {
				System.out.println("Removing a leaf node...");

				// wheter the node is a left child or right child
				Node<T> parent = node.getParentNode();

				// the node is a left child
				if (parent != null && parent.getLeftChild() == node) {
					parent.setLeftChild(null);
				}
				// the node is a right child
				else if (parent != null && parent.getRightChild() == node) {
					parent.setRightChild(null);
				}

				// maybe the root node is the one we want to remove
				if (parent == null) {
					root = null;
				}

				// remove the node and makes it eligible for GC
				node = null;
			}

			// this is the case 2 when we remove items with a single child
			// a single right child
			else if (node.getLeftChild() == null && node.getRightChild() != null) {
				System.out.println("Removing a node with a single right child...");

				Node<T> parent = node.getParentNode();

				// the node is a left child
				if (parent != null && parent.getLeftChild() == node) {
					parent.setLeftChild(node.getRightChild());
				}
				// the node is a right child
				else if (parent != null && parent.getRightChild() == node) {
					parent.setRightChild(node.getRightChild());
				}

				// when we deal with the root node
				if (parent == null) {
					root = node.getRightChild();
				}

				// have to update the right child's parent
				node.getRightChild().setParentNode(parent);
				node = null;

			}

			// it is approximately the same case 2 but we have to deal with left child
			else if (node.getLeftChild() != null && node.getRightChild() == null) {
				System.out.println("Removing a node with a single left child...");

				Node<T> parent = node.getParentNode();

				// the node is a left child
				if (parent != null && parent.getLeftChild() == node) {
					parent.setLeftChild(node.getLeftChild());
				}
				// the node is a right child
				else if (parent != null && parent.getRightChild() == node) {
					parent.setRightChild(node.getLeftChild());
				}

				// when we deal with the root node
				if (parent == null) {
					root = node.getLeftChild();
				}

				// have to update the right child's parent
				node.getLeftChild().setParentNode(parent);
				node = null;
			}

			// remove 2 children
			else {
				System.out.println("Removing a node with 2 children...");

				// find the predecessor (max item in the left subtree)
				Node<T> predecessor = getPredecessor(node.getLeftChild());

				// swap just the values
				T temp = predecessor.getData();
				predecessor.setData(node.getData());
				node.setData(temp);

				// we have to call the delete method recursively on the predecessor
				remove(data, predecessor);
			}
		}

		// settle the violations
	}

	@Override
	public void traverse() {
		// in-order traversal O(N) linear runnitng time
		if (root != null)
			traverse(root);
	}

	// O(N)
	private void traverse(Node<T> node) {
		if (node.getLeftChild() != null) {
			traverse(node.getLeftChild());
		}

		System.out.print(node + " - ");

		if (node.getRightChild() != null) {
			traverse(node.getRightChild());
		}
	}

	// takes at most O(logN)
	private void settleViolations(Node<T> node) {
		Node<T> parentNode = null;
		Node<T> grandParentNode = null;

		// we have to check the violations up to the root node
		while (node != root && isRead(node) && isRead(node.getParentNode())) {
			parentNode = node.getParentNode();
			grandParentNode = node.getParentNode().getParentNode();

			// parent is a left child of it's parent (so the grandparent)
			if (parentNode == grandParentNode.getLeftChild()) {
				Node<T> uncle = grandParentNode.getRightChild();

				// case 1.) and case 4.) RECOLORING
				if (uncle != null & isRead(uncle)) {
					grandParentNode.setColor(NodeColor.RED);
					parentNode.setColor(NodeColor.BLACK);
					uncle.setColor(NodeColor.BLACK);
					node = grandParentNode;
				} else {
					// case 2.) 
					if (node == parentNode.getRightChild()) {
						leftRotation(parentNode);

						// update the references we keep going to the root node
						node = parentNode;
						parentNode = grandParentNode;
					}

					// case 3.) rotation on the grandparent + parent and grandparente switch color
					rightRotation(grandParentNode);
					System.out.println("Recoloring: " + parentNode + " + " + grandParentNode);

					// swap the color of the parent and the grandparent
					NodeColor tempColor = parentNode.getColor();
					parentNode.setColor(grandParentNode.getColor());
					grandParentNode.setColor(tempColor);

					// update the references
					node = parentNode;
				}
			} else {
				// parent is a right child of it's parent (so the grandparent)
				Node<T> uncle = grandParentNode.getLeftChild();
				
				// case 1.) and case 4.) RECOLORING
				if (uncle != null & isRead(uncle)) {
					grandParentNode.setColor(NodeColor.RED);
					parentNode.setColor(NodeColor.BLACK);
					uncle.setColor(NodeColor.BLACK);
					node = grandParentNode;
				}  else {
					// case 2.) symmetric partner
					if (node == parentNode.getLeftChild()) {
						rightRotation(parentNode);

						// update the references we keep going to the root node
						node = parentNode;
						parentNode = grandParentNode;
					}
					
					// case 3.) symmetric parter
					leftRotation(grandParentNode);
					
					System.out.println("Recoloring: " + parentNode + " + " + grandParentNode);

					// swap the color of the parent and the grandparent
					NodeColor tempColor = parentNode.getColor();
					parentNode.setColor(grandParentNode.getColor());
					grandParentNode.setColor(tempColor);

					// update the references
					node = parentNode;
				}
			}
		}
		
		// root node cannot ne RED so we have to recolor if necessary
		if (isRead(root)) {
			System.out.println("Recoloring the root to black...");
			root.setColor(NodeColor.BLACK);
		}
	}

	private boolean isRead(Node<T> node) {
		if (node == null)
			return false;

		return node.getColor() == NodeColor.RED;
	}

	private Node<T> getPredecessor(Node<T> node) {
		if (node.getRightChild() != null) {
			return getPredecessor(node.getRightChild());
		}

		return node;
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
