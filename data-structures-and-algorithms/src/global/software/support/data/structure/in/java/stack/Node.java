package global.software.support.data.structure.in.java.stack;

/**
 *
 * brunolima on Jun 6, 2021
 * 
 */

public class Node<T> {

	private T data;
	
	// this is why this implementation has some additional memory complexity
	private Node<T> nextNode;

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Node<T> getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}

	@Override
	public String toString() {
		return "" + data;
	}
	
	
	
}
