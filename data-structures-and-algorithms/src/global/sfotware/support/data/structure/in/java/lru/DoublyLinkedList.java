package global.sfotware.support.data.structure.in.java.lru;

/**
*
* brunolima on Jun 12, 2021
* 
*/

public class DoublyLinkedList {
	
	private Node headNode;
	private Node tailNode;
	
	public DoublyLinkedList() {
		
	}

	public Node getHeadNode() {
		return headNode;
	}

	public void setHeadNode(Node headNode) {
		this.headNode = headNode;
	}

	public Node getTailNode() {
		return tailNode;
	}

	public void setTailNode(Node tailNode) {
		this.tailNode = tailNode;
	}
	
}

