# Priority Queue
```
- It is an abstract data type such as queue

- Every item has an additional property - the so called priority value

- In a Priority Queue an element with high priority is served before an element with lower priority

- Priority Queues are usually implemented with heap data structures but it can be implemented with
self balancing trees as well

- It is very similar to queues with some modification: the highest priority element is retrieved first

- Sometimes we do not specify the priority for example when implementing heap data structures

- The value of integer (or float) can be interpreted as a priority

- So we can omit the priority when inserting new integers or float

- For example: the priority of 10 will be greater than that of 5 because 10 > 5 so there is no need to store
the priority in another variable

- The concept of Priority Queue naturally suggest a sorting algorithm where we have to insert all the elements to be sorted
into a priority queue

- Remove the items one by one from the priority queue an it yelds the sorted order

- If we take out a given item then it will be the one with the highest priority value

- This is exactly how heap sort works

```

# HEAPS
```
- Heaps are basically binary trees

- Two main binary heap types: min heap and max heap

- It was first constructed back in 1964 by J.W.J. Willians

- 1) MAX HEAP
	- In a max heap the keys of parent nodes are always greater than or equal to those of the children. The highest key (max value) is in
	the root node.
	
- 2) MIN HEAP
	- In a min heap of parent nodes are less than or equal to those of the children and the lowest key (min items) is in the root node

- Heaps are basically a binary trees

- Two main binary heap types: min heap and max heap

- It is complete so it cannot be imbalanced

- We insert every new item to the next available place

- APPLICATIONS: Dijskstra's algorithm, Prim's algorithm

```

## Heap Properties
```
- 1) COMPLETENESS: we construct the heap from left to right across each row - of course the last row may not be fully complete

- 2) HEAP PROPERTY: every node can have 2 children so heaps are almost-complete binary trees
	- min heap: The parent node is always smaller than the child nodes (left and right nodes)
	- max heap: The parent node is always greater than the child nodes  (left and right nodes)
```

## Heap Operations
```
- Removing the root node (and usually this is the case) can be done in O(logN) running time

- What if we want to remove an arbitrary item?

- First we have to find it in the array with O(N) linear search an then we can remove it in O(logN)

- REMOVING AN ARBITRARY ITEM TAKES O(N) TIME

- This is the same if we want to find an item in a heap

- Heaps came to be to find and manipulate the root node (max o min item) in an efficient manner
```

## Heap Sort
```
- It was constructed back in 1964 by J.W.J Williams

- HeapSort is a comparison-based sorting algorithm

- Uses heap data structure rathen than a linear-time search to find the maximum

- It is a bit slower in practice on most machines than a well-implemented quicksort

- But it has the advantage of more favorable O(logN) worst-case running time complexity

- Heap Sort is an in place algorithm

- DOES NOT NEED ADDITIONAL MEMORY - of course we have to store the N items

- But it is not a stable sort - wich means it does not keep the relative order of items with same values

- First we have to construct the heap data structure from the numbers we want to sort

- We have to consider the items one by one in O(N) and we have to insert them into the heap in O(logN) so the total running time
will be O(NlogN)

- We take the root node (include it in the solution set) and swap it with the last item

- Do heapify starting with the root node because the heap properties may be violated

- We do it N times (for all the items in the data structure)

```

## Binominal Heaps
```
- Similar to binary heap but also support quick merging of two heaps

- It is important as an implementation of the mergeable heap abstract data type (meldable heap)

- Which is a priority queue basically + supporting merge operation

- A Binomial Heap is implemented as a collection of trees

- The O(logN) logarithmic insertion time complexity can be reduced to O(1) constant time complexity with the help of binominal heaps

```

## Fibonacci Heaps
```
- Fibonacci Heaps are faster than the classic binary heap

- Dijkstra's shortest path algorithm and Prim's spanning tree algorithm run faster if they rely on Fibonacci heap instead of
binary heaps

- But very hard to implement efficiently so usually does not worth the effort

- Unlike binary heaps it can have several children - tehe number of children are usually kept slow

- We can achieve O(1) running time for insertion operation instead of O(logN) logarithmic running time

- Every node has degree at most O(logN) and the size of a subtree rooted in a node of degree k is at least Fk+2 where Fk is the k-th 
Fibonacci number

```









