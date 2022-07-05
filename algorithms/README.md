# Algorithms
Authors: Robert Sedgewick and Kevin Wayne

## 2 - Sorting
### Selection
Search for minor item in the array swap with *i*th position

Properties:
- Swap is linear (N -1)
- Elements to the left of the *i*th position are sorted, to the right need sorting
- Worst case is a reverse array like "9,8,7,6,5,4,3,2,1,0"
- Max number of swaps occur when you have an array that the second position forwared are sorted and the first item is higher than all other items. "9,0,1,2,3,4,5,6,7,8".

![Selection Sort example](./images/selection-example.png)

### Insertion

### Shell

### Merge

#### Bottom Up

### Quick

#### 3 way

### Priority Queue

#### Ordered (eager)

#### Unordered (lazy)

#### Binary Heap

Reheapify: Restoring the heap to a valid state.

- Bottom-up (swim) : a node’s key becomes larger than that node’s parent’s key,

- Top-down (sink): a node’s key becomes smaller than one or both of that node’s children’s keys

## 4 - Graphs

### Depth First Search (DFS)

Good to answers:

- Connectivity. 
  - Are two vertices connected?
  - How many connected components does the graph have?
- Single source paths.
  - Is there a path to from s to a given vertex v? If so, find such a path

### Breadth First Search (BFS)

Good to answers:

- Single source shortest paths.
  - Is there a path from s to a given target vertex v? If so, find a shortest such path (one with a minimal number of edges)

