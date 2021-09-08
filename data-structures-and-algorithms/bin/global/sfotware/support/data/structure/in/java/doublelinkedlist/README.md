# DoubleLinkedList

```
- It's another data structure - the aim is to be able to store items efficiently (insertion and removal operations)

- Arrays have a huge disadvantage: there may be holes in the data structure and we have to shift a lot of items

- This problem can be eliminated by double linked lists

- Every node stores the data itself and references to the next node and to the previous node in the linked list (2 pointers)

- This is why doubly linked lists need more memory than linked lists

- It has an advantage - there can not be holes in the data structure so there is no need for shifting items

- We store references to the head node an the tail node as well so these nodes can be accessed in O(1) running time

- It can be traversed in both directions (huge advantage)

- Removing a given node is easier because there is a pointer to the previous node as well

```
