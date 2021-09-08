# Associative Arrays
```
- Associative arrays (maps or dictionaries) are abstract data type

- Composed of a collection of key-value pairs where each key appears at most once in the collection

- Most of the time we implement associative arrays with hashtables but binary search trees can be used as well

- The aim is to reach O(1) time complexity for most of the operations

- Finding an arbitrary item in an array takes O(N) linear runnint time (BUT HAS O(!) RANDOM ACCESS) 

- We can do better with binary searches trees with O(logN) logarithmic running times

- AVL Trees and RED-BLACK trees can guarantee O(logN) running times

- We can combine random acces with hash-functions to end up with O(1) running times (ASSOCIATIVE ARRAYS)

- There are several operations we want to implement - and we want these operations to have O(1) running time

- adding (key, value) pairs to collection

- removing (key, value) pairs from the collection

- lookup a given value associated with a given key

- The key and value pairs are unordered - this is why associative arrays do not support sorting as an operation

```

## Hastables
```
- How to achieve O(1) running times for insertions and removal operations?

- We should transform the key into an array index - to achieve random access

- This is why keys must be unique to avoid using the same indexes

- h(x) hash-function transforms the key into an index in the range [0,m-1]
```

## Hash-functions
```
- The h(x) hash-function transforms the keys into array indexes 

- It should handle any types - strings, floats, integers or even custom object as well

- If we have integer keys we just have to use the modulo (%) operator to transform the number into the range [0,m-1]

- We can use the ASCII values of the letters when dealing with strings

- THE h(x) HASH FUNCTION DISTRIBUTES THE KEYS UNIFORMLY INTO BUCKETS (ARRAY SLOTS)!!!

```

## Hash-functions
```
- Collisions occur when the h(x) hash-function maps two keys to the same array slot (bucket)

- There are several approaches to deal with collisions:
	- 1) CHAINING
		- We store the items in the same bucket (with same indexes) in a linked list data structure
		- We end up with a linked list with O(N) linear running time for most of the operations
		
	- 2) OPEN ADDRESSING
		- If we come to the conclusion that there is a collision then we generate a new index for the item (try to find another bucket)
		
		- Linear probing: if collision happened at array index k then we try index k+1, k+2, k+3...until we find an empty bucket
			- Not always the best option possible because there will be clusters in the underlying array
			- But it has better cache performance than other approaches
		
		- Quadratic probing: if collision happened at array index k then we try successive values of an arbitrary quadratic polynomial
			(arrays slots 1, 4, 9, 16...steps aways from the collision)
			- There will be no clusters (unlike linear probing)
			- But no cache advantage (items are far away in memory) 	
		
		- Rehashing: If collison happened at array index k then we use the h(k) hash-function again to generate a new index
```

## Load Factor
```
- The p(x) probability of collision is not constant

- The more items are there in the hashtable the higher the p(x) probability of colision

- This is why we have to define a new parameter of the hashtable - the so-called load factor

- Load factor => n/m, n is the number of actual items in the array data structure and m is the size of the array (DEFINES A TYPICAL MEMORY AND RUNNING TIME TRADE-OFF)

- SMALL LOAD FACTOR (around 0)
	- The hashtable is nearly empty which means low p(x) probability of collisions
	
	- But of course a lot of memory is wasted
	
- HIGH LOAD FACTOR (around 1)
	- The hashtable is nearly fully which means high p(x) probability of collisions
	
	- No memory is wasted but the running time may be reduced to O(N) linear running time
```


## Load Factor and Dinamic Resizing
```
- The p(x) probability of collision is not constant

- The more items are there in the hashtable the higher the p(x) probability of colission

- This is why we have to define a new parameter of the hashtable - the so-called load factor

- SOMETIMES WE HAVE TO RESIZE THE HASHTABLE

- Performance relies heavily on the load factor. Sometimes is better to use memory to achieve faster running times

- When the load factor is > 0.75 then Java resize the hashtable automatically to avoid too many collisions

- Python does the same when the load factor > 0.66

- So sometimes it is better to resize and change the size of the underlying array data structure

- But the problem is that the hash values are depending on the size of the underlying array data structure

- So we have to consider all the items in the old hashtable and insert them into the new one with the h(x) hash-function

- It takes O(n) linear running time - this fact may make dynamic-sized hash tables inappropriate for real-time applications

```

```
Map 			=> HashTable, HashMap, LinkedHashMap
SortedMap 	=> TreeMap

List 		=> ArrayList, LinkedList, Vector, Stack

Queue		=> PriorityQueue
Deque		=> ArrayDeque


Set 			=> HashSet, LinkedHashSet,
SortedSet	=> TreeSet

TreeMap: guarantee the order, is sorted
HahsMap: doesn't guarantee the order, it's not synchronized, allows one null key and and any number of null values
HashTable: it's synchronized but it's slow, doesn't not allow nulls keys or values

```



