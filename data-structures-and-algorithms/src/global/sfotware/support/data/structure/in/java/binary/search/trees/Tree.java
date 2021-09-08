package global.sfotware.support.data.structure.in.java.binary.search.trees;

/**
*
* brunolima on Jun 8, 2021
* 
*/

public interface Tree<T> {
	
	public void insert(T data);
	
	public void remove(T data);
	
	// in-order traverse yelds the natural ordering
	public void traverse();
	
	public T getMin();
	
	public T getMax(); 
	
	public Node<T> getRoot();
	
	public Node<T> getKSmallest(Node<T> node, int k);
	
	public int getAgesSum();

}

