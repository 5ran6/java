package global.sfotware.support.data.structure.in.java.red.black.trees;

/**
 *
 * brunolima on Jun 9, 2021
 * 
 */

public class AppRedBlackTree {

	public static void main(String[] args) {
		RedBlackTree<Integer> rbt = new RedBlackTree<>();
		
		rbt.insert(10);
		rbt.insert(20);
		rbt.insert(30);
		rbt.insert(40);
		
		rbt.traverse();
		
	
	}

}
