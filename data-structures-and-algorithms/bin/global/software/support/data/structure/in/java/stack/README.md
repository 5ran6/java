# STACK

```
- It is an abstract data type - and it can be implemented wither with arrays or with linkedLists

- It has a so called LIFO structure - the last item we inserted is the first item we take out

- Basic operations are pop(), push() and peek()

- Most of the modern programming languages are stack-oriented

- They define most basic operations (adding two numbers) as taking their argument from the stack and placing any
return values back on the stack
```
## Stacks applications
```
- Is stack-oriented programming languages

- Graph algorithms rely heavily on stacks such as depth-firts search can be implemented with stacks

- Finding Eulerian cycles in a G(V,E) graph

- Finding strongly connected components in a given G(V,E) graph
```

## Memory Management
```
- There are 2 main types of memory: stack memory and heap memory

Stack Memory
- The stack memory is a special region in the RAM (random access memory)

- This is a special data type (stack) that store the active functions and local variables as well

- This is how Java knows where to return after finish execution of a given function

- Fast access

- Small Size

- No fragmentation

Heap Memory
- The heap memory is a special region in the RAM (random access memory)

- The size of the heap memory is way larger than that of the stack memory (we can store more items)

- Objects are store on the heap memory

- Slow access

- May become fragmented

```

## Parsing with Stacks
```
- Interpreter have the ability to interpret given code

- Stacks are extremely useful when parsing huge  XML files either with SAX or with STAX

- The shunting-yard algorithm is a method for parsing mathematical expressions with the help
of stack abstract data types

- It was first constructed by Edsger Dijkstra

- The algorithm maintains multiple stacks


```








