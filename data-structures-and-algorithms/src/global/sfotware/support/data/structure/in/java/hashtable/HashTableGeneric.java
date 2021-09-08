package global.sfotware.support.data.structure.in.java.hashtable;

/**
 *
 * brunolima on Jun 11, 2021
 * 
 */

@SuppressWarnings("unchecked")
public class HashTableGeneric<Key, Value> {

	private Key[] keys;
	private Value[] values;
	private int numOfItems;
	private int capacity; // it is the maximum number of item,s that can be inserted in the table:
							// numOfIUtems <= capacity

	public HashTableGeneric() {
		this.keys = (Key[]) new Object[Constants.TABLE_SIZE];
		this.values = (Value[]) new Object[Constants.TABLE_SIZE];
		this.capacity = Constants.TABLE_SIZE;
		this.numOfItems = 0;
	}

	public HashTableGeneric(int newCapacity) {
		this.keys = (Key[]) new Object[newCapacity];
		this.values = (Value[]) new Object[newCapacity];
		this.capacity = newCapacity;
		this.numOfItems = 0;
	}

	// O(1)
	public int size() {
		return this.numOfItems;
	}

	// O(1)
	public boolean isEmpty() {
		return this.numOfItems == 0;
	}

	public Value get(Key key) {
		if (key == null)
			return null;

		int index = hash(key);

		while (keys[index] != null) {
			if (keys[index].equals(key)) {
				return values[index];
			}

			index = (index + 1) % capacity;
		}

		return null;
	}

	public void put(Key key, Value value) {
		if (key == null || value == null)
			return;

		// O(1) -> O(N)
		if (numOfItems > capacity * 0.75) {
			resize(2 * capacity);
		}

		int index = hash(key);

		while (keys[index] != null) {

			// update
			if (keys[index].equals(key)) {
				values[index] = value;
				return;
			}

			index = (index + 1) % capacity;
		}

		keys[index] = key;
		values[index] = value;
		numOfItems++;
	}

	public void remove(Key key) {
		if (key == null)
			return;

		int index = hash(key);

		while (!keys[index].equals(key)) {
			index = (index + 1) % capacity;
		}

		keys[index] = null;
		values[index] = null;
		numOfItems--;

		while (keys[index] != null) {
			Key keyTemp = keys[index];
			Value valueTemp = values[index];

			keys[index] = null;
			values[index] = null;

			numOfItems--;
			put(keyTemp, valueTemp);

			index = (index + 1) % capacity;
		}

		if (numOfItems <= capacity / 3) {
			resize(capacity / 2);
		}

	}

	// O(N)
	private void resize(int newCapacity) {
		HashTableGeneric<Key, Value> newTable = new HashTableGeneric<>(newCapacity);

		for (int j = 0; j < capacity; j++) {
			if (keys[j] != null) {
				newTable.put(keys[j], values[j]);
			}
		}
		
		keys = newTable.getKeys();
		values = newTable.getValues();
		capacity = newTable.getCapacity();
	}

	private int hash(Key key) {
		return Math.abs(key.hashCode()) % capacity;
	}

	public Key[] getKeys() {
		return keys;
	}

	public void setKeys(Key[] keys) {
		this.keys = keys;
	}

	public Value[] getValues() {
		return values;
	}

	public void setValues(Value[] values) {
		this.values = values;
	}

	public int getNumOfItems() {
		return numOfItems;
	}

	public void setNumOfItems(int numOfItems) {
		this.numOfItems = numOfItems;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

}
