package global.sfotware.support.data.structure.in.java.hashtable;

/**
 *
 * brunolima on Jun 11, 2021
 * 
 */

public class HashItem {

	private int key;
	private int value;
	private HashItem nextHashItem;

	public HashItem(int key, int value) {
		super();
		this.key = key;
		this.value = value;
	}

	public int getKey() {
		return key;
	}

	public void setKey(int key) {
		this.key = key;
	}

	public int getValue() {
		return value;
	}

	public void setValue(int value) {
		this.value = value;
	}

	public HashItem getNextHashItem() {
		return nextHashItem;
	}

	public void setNextHashItem(HashItem nextHashItem) {
		this.nextHashItem = nextHashItem;
	}

}