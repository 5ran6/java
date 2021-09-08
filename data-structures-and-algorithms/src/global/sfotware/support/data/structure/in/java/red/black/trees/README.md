# Red-Black Trees

```
- It is a balanced data structure invented back in 1978 by Leonidas Guibas and Robert Sedgewick

- This data structure has a guaranteed O(logN) running time

- The running time of binary search trees depends on the h height of the binary search tree

- AVL trees are faster than red-black trees because they are more rigidly balanced but needs more work

- But it is faster to construct a red-black tree

- Operating Systems relies heavily on these data structures

```

## Red-Black Trees (Properties)
```
- Each node is either red or black

- The root node is always black

- all lead nodes (NULL pointers) are black

- Every red node must have two black child nodes and no other children - it must have a black parent

- Every path from a given node to any of its descendant NULL nodes contains the same number of black nodes

```