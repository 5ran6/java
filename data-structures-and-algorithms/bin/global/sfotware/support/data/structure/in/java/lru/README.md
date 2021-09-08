# Least Recently Used (LRU) Cache
```
- What is the aim of caches?
	- We want to access the recently used items (for example URLs) very fast so in O(1) 
	time complexity (adn discard least recently used ones)
		NAIVE APPROACH: use a single hashtable and we can achieve put() and get() operations in O(!) BUT
		the memory complexity is not favorable
	
	- Splay Trees are working fine but again we store all the items in a tree-like structure
	
	- LRU cacehs use (usually) doubly linked lists to achieve this goal + we have to use hashtables as well to boost linked lists!! 

- We ususally use age bits to track the items stored in the cache frequently used items have higher age bit values
	- When the cache is full: we have to remove the least recently used item
	- Other approach: items older to the head are more important (we use this approach during implementation) 


- PROBLEM: when we consider a given item (URL) that given item may be in the memory already
	- In this case we have to update the value
	-  Of course first we have to dinf the given item: with linked lists this operation takes O(N) time complexity
	- THIS IS WHY WE USE A HASTABLE!!! (we can reduce the O(N) running time to O(1)
	 
```
