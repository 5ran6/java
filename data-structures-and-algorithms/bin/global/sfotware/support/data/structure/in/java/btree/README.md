#B-Trees

## File Systems and DataBases
```
- There are 2 types of memory:
	- 1) Main memory (RAM) fast: all the data structures considered so far are stored in the main memory.
		- stack memory and heao memory are located in the main memory as well
	
	- 2) External Memory (Peripheral Memory) slow : hard disk, CD-ROM etc.
		- hard drive storage can store large amounts and sizes of files such as file systems or databases
		- the data located on the hard drive disk (HDD) can not be processed explicity
		- it must be brought into the main memory
		- in the main memory (RAM) we can use either the stack memory or the heap memory
		- we can manipulate (read or write) the blocks which means at least 512 bytes
		- ACCESS THE BLOCKS IS SLOW!!!

- accessing items on the external memory (HDD) is way slower than manipulating the main memory
- we need totally different data structures
- EXTERNAL MEMORY ACCESS TIME: 12ms
- RAM ACCESS TIME: 0.0001ms
- so far we have manipulated data present on the main memory but now we have to fetch the data from the external memory first

```

## B-Trees
```
- It was first constructed in 1971 by Rudolf Bayer and Ed McCreight
- B-Trees are self balancing tree like data structures
- Supports operations such as insertions, deletion, sequential access and searchiing in O(logN) time complexity
- The nodes may have more than 2 children + multiple keys
- B-Trees data structures are optimizes for systems that read an write large blocks of data
- B-Trees are a good example of a data structure for external memory
- Commonly used in databases and filesystems
```

## B-Trees Properties
```
1) All the nodes of these tree structure can contain m keys - so it may have m+1 children (branching factor) 
2) Every node is at least half full - so contain at least m/2 items
3) If the N number of items in a node is less than m/2 then we merge it with another node and if N > m then we split the node
4) All leaf nodes are at the same level (balanced)

``
