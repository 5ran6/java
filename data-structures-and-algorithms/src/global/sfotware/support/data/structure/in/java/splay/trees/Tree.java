package global.sfotware.support.data.structure.in.java.splay.trees;

/**
 *
 * brunolima on Jun 9, 2021
 * 
 */

public interface Tree<T> {

	public void insert(T data);

	public T find(T data);

	public void traverse();
	
	public T getRoot();

}
