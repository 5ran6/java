# Arrays

```
The aim is to make operations as fast as possible: inserting new items or removing given items from the data structure.

Arrays are data structures where all the items are identified by an integer value starting with 0 - the so called index

The items of the array are located right next to each other in them main memory (RAM) - they can be accessed by the index

ADVANTAGE: Accessing the items - Random Access

Every single item (value) can be identified with a given index

Indexes start with 0

Usually we can store items of the same type

Random access: items are located right next to each other so we can get them with the help of the index - in O(1) running time

===============================================================
e.g:
Array
  3		  12		 -2		9	   5			(items on array)
0x100	0x116	0x132  0x148 	 0x164		(memory address)

memory address = array's address + index * data size (4 byte)
===============================================================

- Static Array: Size of the array does not change
- Dynamic Array: Size of the array may change dynamically

- Manipulating the last item (insertion or removal): O(1) running time - this is why we like arrays

- Manipulating arbitrary item (insertion or removal): O(N) runnint time - if these kinds of operations will dominate then array
data structure is not the best option


```
