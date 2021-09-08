package global.sfotware.support.data.structure.in.java.linkedlist;

/**
*
* brunolima on Jun 4, 2021
* 
*/

public class LinkedList<T extends Comparable<T>> implements List<T> {

	// this is the head or root node
	private Node<T> head;
	private int numOfItems;
	
	@Override
	public void insert(T data) {
		if (head == null) {
			// this is the first item in the linked list
			head = new Node<>(data);
		} else {
			// we know that this is not the first item in the linked list
			insertBeginning(data);
		}

		numOfItems++;
	}
	
	// we just have to update the references 0(1)
	private void insertBeginning(T data) {
		Node<T> newNode = new Node<>(data);
		newNode.setNextNode(head);
		head = newNode;
	}
	
	public void insertEnd(T data) {
		insertEnd(data, head);
		numOfItems++;
	}
	
	// because we have to start with the root node
	// first we have to find the last node in O(N)
	private void insertEnd(T data, Node<T> node) {
		// this is when we keep looking for the last node O(N)
		if (node.getNextNode() != null) {
			insertEnd(data, node.getNextNode());
		} else {
			// we have found the last node
			Node<T> newNode = new Node<>(data);
			node.setNextNode(newNode);
		}
	}

	@Override
	public void remove(T data) {
		if (head == null) return;
		
		// we want to remove the first node (root)
		if (head.getData().compareTo(data) == 0) {
			head = head.getNextNode();
		} else {
			remove(data, head, head.getNextNode());
		}
		
	}

	private void remove(T data, Node<T> rootNode, Node<T> nextNode) {
		// we have to find the node we want to remove
		while(nextNode != null) {
			
			// this is the node we want to remove
			if (nextNode.getData().compareTo(data) == 0) {
				// update the references
				numOfItems--;
				rootNode.setNextNode(nextNode.getNextNode());
				nextNode = null;
				return;
			}
			
			rootNode = nextNode;
			nextNode = nextNode.getNextNode();
		}
	}

	@Override
	public void traverse() {
		if (head == null) return;
		
		Node<T> actualNode = head;
		
		while(actualNode != null) {
			System.out.println(actualNode);
			actualNode = actualNode.getNextNode();
		}
		
		System.out.println("-------------------");
	}

	@Override
	public int size() {
		return numOfItems;
	}

	@Override
	// Finding the middle node
	public Node<T> getMiddleNode() {
		Node<T> fastPointer = head;
		Node<T> slowPointer = head;
		
		while(fastPointer.getNextNode() != null && fastPointer.getNextNode().getNextNode() != null) {
			fastPointer = fastPointer.getNextNode().getNextNode();
			slowPointer = slowPointer.getNextNode();
		}
		
		return slowPointer;
	}

	@Override
	public void reverse() {
		Node<T> currentNode = head;
		Node<T> previousNode = null;
		Node<T> nextNode = null;
		
		while(currentNode != null) {
			nextNode = currentNode.getNextNode();
			currentNode.setNextNode(previousNode);
			previousNode = currentNode;
			currentNode = nextNode;
		}
		
		head = previousNode;
	}

}

