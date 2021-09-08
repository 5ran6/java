# Splay Trees
```
- Splay Trees are types of binary search trees with the additional property that recently accessed elements are quick to access again

- Was invented back in 1985 by Daniel Sleator an Robert Tarjan

- Most of the operatiuons have O(logN) time complexity - but some are very slow with O(N) running times

- Splay Trees not strictly balanced 0 thats why it is faster and it is easy to implement

- Splay Trees are kept balanced with the help of rotations

- FAST ACCESS TO ELEMENTS ACCESSED RECENTLY

- Recently manipulated nodes are located near the root node of the splay tree - this topology is maintained by rotations
```

## Splay Trees - Search Operation
```
- It is like in a standard binary search tree

- We make rotations when we find the given element we are looking for - it is going to be the root node

- This operation is called splaying

- THE AIM OF ROTATIONS (SPLAYING) IS NOT TO REBALANCE THE TREE!!!

- In the next search it can be accessed very fast even in O(!) time because it is in the root node

- The splay operation can be achieved by 3 methods (relies heavily on standard subtree rotations)

- 1) ZIG-ZAG SITUATION
	- the node x is a right child of a left child
	- or the node x is a left child of a right child
	- basically this is the left-right heavy (or right-left heavy) case
	- here we have symmetric cases again
	- we have to make 2 rotations (left and right rotations) 

- 2) ZIG-ZIG SITUATION
	- the node x is a left child of a left child
	- or the node x is a right child of a right child
	- this is the doubly left or right heavy cases
	- here we have symmetric cases again
	- we have to make 2 rotations (left and right rotations)

- 3) ZIG SITUATION
	- we have to repeat the previous steps (zig-zig and zig-zag cases) over and over again until we get to the root node
	- sometimes we end up at situations when just a single (left or right) rotation is needed to make sure node x will become the root node
	- here node x is just the child of the root
```
## Splay Trees Applications
```
- 1) CACHES
	- In computing, a cache is a hardware or software component that stores data so that future requests for that data can be served faster
	- A Splay Tree is a binary search tree with the additional properly that recently accessed elements are quick to access again. 

- 2) GARBAGE COLLECTORS
	- Garbage collection is the process that automatically allows deleting the memory region that is not longer in use (remove unused objects 
	from the heap memory)
	
	- In a splay tree the least frequently visited nodes are located near the leaf nodes (we can remove then)
	
- 3) IP ROUTING
	- A network router receives network packets at a hight rate from incoming connections
	- Must quickly decide on which outgoing wire to send each packet based on the IP address present in the packet
	- An IP address has been used once is likely to be used again
	- Recently visited nodes inb a splay tree can be accessed in O(1) constant running time

```
