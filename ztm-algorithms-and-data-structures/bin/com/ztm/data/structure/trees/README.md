#Trees
```
Level 0: 2^0 = 1
Level 1: 2^1 = 2
Level 2: 2^2 = 4
Level 3: 2^3 = 8

total of nodes  = 2ˆn - 1
log nodes = steps

log 100 = 2
10ˆ2 = 100
```

## Binary Search Tree (BST)
```
lookup O(log N)
insert O(log N)
delete O(log N)

			101
	33				105
9		37		104		144

BFS [101, 33, 105, 9, 37, 104, 144]
DFS [101, 33, 9, 37, 105, 104, 144]


Pros:
1 - Better than O(n)
2 - Ordered
3 - Flexible size

Cons:
No O(1) operations

```

## BFS Breadth First Search
```
Pros:
- Shortest Path
- Closer Nodes

Cons: 
- More Memory
```

## DFS Deapth First Search
```
Pros:
- Less Memory
- Does Path Exist?

Cons: 
- Can get Slow
```

## Questions
```
//If you know a solution is not far from the root of the tree: BFS

//If the tree is very deep and solutions are rare: BFS (DFS will take long time)

//If the tree is very wide: DFS (BFS will need too much memory)

//If solutions are frequent but located deep in the tree: DFS

//Determining whether a path exists between two nodes: DFS

//Finding the shortest path: BFS

```

## TO SEE
```
Algorithms DIJKSTRA and BELLMAN
```


	