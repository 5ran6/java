# Binary Search Trees

```
 - Arrays can manipulate the last item in O(1) constant running time complexity that is quite fast
 
 - Linked Lists can manipulate the first item of the data structure fast 
 
 - Searching for an arbitrary item takes O(N) linear running time for both data structures
 
 - WHAT IF THE ARRAY DATA STRUCTURE IS SORTED?
 
 - We can search for arbitrary item in O(logN) logarithmic time complexity
 
 - This is the concept behind binary search

 - Every node in the tree can have at most 2 children (left child and right child)
 
 - left child is smaller than the parent node
 
 - right child is greater than the parent node
 
 - We can access the root node exclusively and all other nodes can be accessed via the root node
 
 - The height of a tree is the number of edges on the longest downward path between the root and a leaf node. The number of layers the tree contains.
 
 - The logarithmic O(logN) running time is valid only when the tree structure is balanced, case tree in unbalanced  it'll be O(N)
 
 - We should keep the height of a tree at a minimum which is h=logN

 - The tree structure may became unbalanced which means the number of nodes significantly differ in the subtree
 
 - If the tree is unbalanced so the h=logN relation is no more valid then the operations running time is no more O(logN) logarithmic
 
```

## Binary Search Tree Traversal
```
- PRE-ORDER TRAVERSAL
We visit the root node of the binary tree then the left subtree and finally the right subtree in a recursive manner

- POST-ORDER TRAVERSAL
We visit the left subtree of the binary tree then the right subtree and finally the root node in a recursive manner

- IN-ORDER TRAVERSAL (SORTED ORDER)
We visit the left subtree of the binary tree then the root node and finally the right subtree in a recursive manner


```
