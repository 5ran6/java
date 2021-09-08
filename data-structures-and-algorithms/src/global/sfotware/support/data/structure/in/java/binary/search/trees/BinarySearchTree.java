package global.sfotware.support.data.structure.in.java.binary.search.trees;

/**
*
* brunolima on Jun 7, 2021
* 
*/

public class BinarySearchTree<T extends Comparable<T>> implements Tree<T> {
	
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

	@Override
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

	@Override
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

	@Override
	public Node<T> getRoot() {
		return this.root;
	}

	@Override
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
	
	private int getAges(Node<T> node) {
		System.out.println("Considering node " + node);
		
		// we have to reinitialize the variables (sum is the parent's node value so the sum of the subtree so far)
		int sum = 0;
		int leftSum = 0;
		int rightSum = 0;
		
		// null nodes have sum value 0
		if (node == null) {
			return 0;
		}
		
		// we do a simple post-order traversal because here we have to calculate both left and right value to
		// be able to calculate the parent's value (sum of children's ages)
		// check the left subtree recursively
		leftSum = getAges(node.getLeftChild());
		
		rightSum = getAges(node.getRightChild());
		
		// update the sum ... given node's value is the own value + left subtree sum + right subtree sum
		System.out.println("Considering node " + node + " total ages so far is " + (((Person) node.getData()).getAge() + leftSum + rightSum));
		sum = ((Person) node.getData()).getAge() + leftSum + rightSum;
		
		return sum;
	}

	@Override
	public int getAgesSum() {
		return getAges(this.root);
	}

}

