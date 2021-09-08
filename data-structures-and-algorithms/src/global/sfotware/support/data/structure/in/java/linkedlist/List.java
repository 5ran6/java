package global.sfotware.support.data.structure.in.java.linkedlist;

/**
*
* brunolima on Jun 4, 2021
* 
*/

public interface List<T extends Comparable<T>> {

	public void insert(T data);
	
	public void remove(T data);
	
	public void traverse();
	
	public int size();
	
	public Node<T> getMiddleNode();
	
	public void reverse();
	
}

