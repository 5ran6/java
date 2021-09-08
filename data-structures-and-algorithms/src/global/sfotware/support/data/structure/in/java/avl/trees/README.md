# AVL Trees

```
- It is a balanced data structure invented back in 1962 by Adelson-Velsky and Landis (AVL)

- This data structure has a guaranteed O(logN) running time 

- The running time of binary search trees depends on the h height of the binary search tree

- In an AVL tree the heights of the two child subtrees of any node differ by at most one

- AVL trees are faster than red-black trees because they are more rigidly balanced but needs more work

- Operating systems relies heavily on these data structures

- All the operations are the same as we have seen with binary search trees (insertion and removal)

- After every insertion and removal operations we have to check whether the tree has become imbalanced or not

- It the tree is imbalanced then we have to make rotations

- AVL trees are exactly the same as binary search trees

- The only difference is that we track the h height parameters of the nodes in the tree

- h left - h right > 1 => All subtrees height parameter can not differ more than 1 (otherwise the treei s imbalanced)

- We have to update the binary search tree and make rotations if it gets imbalanced

- This is why we have the h height parameters - we just have to check the differences in height parameters after every operation

```

## AVL Trees Rotations
```
- We have to track the h height parameters for all the nodes in the binary search tree

- We can calculate the balance factors for the nodes

- Have to make rotations if necessary to rebalance search trees

1-) LEFT ROTATION
Negative balance factors means right heavy situation so we have to make a left rotation to rebalance the tree

2-) RIGHT ROTATION
Positive balance factors means left heavy situation so we have to make a right rotation to rebalance the tree

- Rotations are extremely fast - we just have to update the references in O(1) constant running time

- This operation does not change the properties of the tree

- The in-order traversal remains the same as well as the parent-child relationships in three

- THERE MAY BE OTHER ISSUS BECAUSE OF ROTATIONS

- We have to check up to the root node whether to make further rotations or not - it takes O(logN) running time

```

## Balanced Binary Trees Applications
```
1) GAME ENGINES
- Almost all the game engines use binary search trees to determine which objects should be rendered in the game world
(It was first used in Doom back in 1993)

2) COMPILERS
- It is crucial in programming languages to be able to parse syntax expressions (loops or statements)

- This is why compilers use  a special binary search tree the so-called syntax tree

3) AVL SORT
- We can use balanced tree data structures to sort items efficiently in O(NlogN) linearithmic running time complexity

- We have to insert the N items into an AVL tree

- Then we just have to make a simple in-order-traversal in O(N) linear running time

- Final running time is O(NlogN) + O(N) = O(NlogN)

4) DATABASES
- We can construct databases with AVL tree - usually when we have to make lot of look-ups (search operations)

- If deletions and insertions are frequent the AVL tree is not the best option possible because of the huge number of rotatios

- Trees support quite a lot operations (huge advantage)

- Red-Black Trees and B-trees are more popular


```

