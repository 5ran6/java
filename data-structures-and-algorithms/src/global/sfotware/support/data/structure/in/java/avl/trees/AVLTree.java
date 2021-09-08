package global.sfotware.support.data.structure.in.java.avl.trees;

/**
*
* brunolima on Jun 8, 2021
* 
*/

public class AVLTree<T extends Comparable<T>> implements Tree<T>{

	private Node<T> root;

	@Override
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
				node.setLeftChild(new Node<>(data, node));
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
				node.setRightChild(new Node<>(data, node));
			}
		}
		
		updateHeight(node);
		
		// settle the violation
		settleViolations(node);
	}

	@Override
	public void remove(T data) {
		if (root != null) {
			remove(data, root);
		}
	}

	private void remove(T data, Node<T> node) {
		if (node == null) return;
		
		// first we have to search for the item we want to remove
		if (data.compareTo(node.getData()) < 0) {
			remove(data, node.getLeftChild());
		} else if (data.compareTo(node.getData()) > 0) {
			remove(data, node.getRightChild());
		} else {
			// we have found the item we want to remove
			
			// if the node is a leaf node (without left and right children)
			// this is the case 1
			if(node.getLeftChild() == null && node.getRightChild() == null) {
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
				
				updateHeight(parent);
				
				// settle violations
				settleViolations(parent);
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
				
				updateHeight(parent);
				
				// settle the violations
				settleViolations(parent);
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
				
				updateHeight(parent);
				
				// settle the violations
				settleViolations(parent);
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
	}

	private Node<T> getPredecessor(Node<T> node) {
		if (node.getRightChild() != null) {
			return getPredecessor(node.getRightChild());
		}
		
		return node;
	}

	@Override
	public void traverse() {
		// in-order traversal O(N) linear runnitng time
		if (root == null) return;
		
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

	public T getMin() {
		if (root == null) return null;
		
		// the min item is the leftmost item in the tree
		return getMin(root);
	}

	private T getMin(Node<T> node) {
		if (node.getLeftChild() != null) {
			return getMin(node.getLeftChild());
		}
		
		return node.getData();
	}

	public T getMax() {
		if (root == null) return null;
		
		// the max item is the rightmost item in the tree
		return getMax(root);
	}

	private T getMax(Node<T> node) {
		if (node.getRightChild() != null) {
			return getMax(node.getRightChild());
		}
		
		return node.getData();
	}

	public Node<T> getRoot() {
		return this.root;
	}

	public Node<T> getKSmallest(Node<T> node, int k) {
		// numbes of nodes in the left subtree + 1 because we count the root node of the subtree as well
		int n = treeSize(node.getLeftChild()) + 1;
		
		// this is when we find the kth smallest item
		if (n == k) {
			return node;
		}
		
		// if the number of nodes in the left subtree > k-th smallest item
		// it means the k-th smallest item is in the left subtree
		if (n > k) return getKSmallest(node.getLeftChild(), k);
		
		// if the number of nodes in the left subtree is smaller then the k-th
		// smallest item then we can discard the left subtree and consider the right subtree
		// NOW WE ARE NOT LOOKING FOR THE K-TH BUT the K-Nth SMALLEST ITEM
		if (n < k) return getKSmallest(node.getRightChild(), k - n);
		
		return null;
	}

	// calculate the size of a subtree with root node 'node
	private int treeSize(Node<T> node) {
		// this is the base case
		if (node == null) return 0;
		
		// recursively sum up the size of the left subtree + size of right subtree
		// size of tree = size left subtree + size of right subtree + 1 (because of root)
		return (treeSize(node.getLeftChild()) + treeSize(node.getRightChild()) + 1);
	}
	
	// it returns the height parameter for a given node
	private int height(Node<T> node) {
		if (node == null) return -1;
	
		return node.getHeight();
	}

	// update the height of a given node
	private void updateHeight(Node<T> node) {
		node.setHeight(Math.max(height(node.getLeftChild()), height(node.getRightChild())) + 1);
	}
	
	// balance factor to decide the left heavy or right heavy cases
	private int getBalance(Node<T> node) {
		if (node == null) return 0;	
		
		return height(node.getLeftChild()) - height(node.getRightChild());
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
		
		// after rotations the height parameters can change
		updateHeight(node);
		updateHeight(tempLeftChild);
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
		
		// after rotations the height parameters can change
		updateHeight(node);
		updateHeight(tempRightChild);
	}
	
	private void settleViolations(Node<T> node) {
		// we have to check up to the root node O(logN)
		while(node != null) {
			updateHeight(node);
			settleViolationsHelper(node);
			node = node.getParentNode();
		}
	}

	private void settleViolationsHelper(Node<T> node) {	
		int balance = getBalance(node);
		
		// OK we know the tree is LEFT HEAVY BUT it can be left-right heavy or left-left heavy
		if (balance > 1) {
			// left right heavy situation: left rotation
			if (getBalance(node.getLeftChild()) < 0) {
				leftRotation(node.getLeftChild());
			}
			
			// doubly left heavy situation then just a single right rotation is needed
			// this is the right rotation
			rightRotation(node);
		}
		
		// OK we know the tree is RIGHT HEAVY BUT it can be right-right heavy or right-left heavy
		if (balance < -1) {
			// right left heavy situation: right rotation
			if (getBalance(node.getRightChild()) > 0) {
				rightRotation(node.getRightChild());
			}
			
			// doubly right heavy situation then just a single right rotation is needed
			// this is the left rotation
			leftRotation(node);
		}
	}
	
}

