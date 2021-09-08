package global.sfotware.support.data.structure.in.java.lru;

/**
 *
 * brunolima on Jun 12, 2021
 * 
 */

public class Node {

	private int id;
	private String data;
	private Node previousNode;
	private Node nextNode;

	public Node() {

	}

	public Node(int id, String data) {
		super();
		this.id = id;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public Node getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(Node previousNode) {
		this.previousNode = previousNode;
	}

	public Node getNextNode() {
		return nextNode;
	}

	public void setNextNode(Node nextsNode) {
		this.nextNode = nextsNode;
	}

	@Override
	public String toString() {
		return id + " - " + data;
	}
	
	

}
