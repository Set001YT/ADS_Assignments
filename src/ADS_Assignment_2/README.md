# ADS Assignment 2 — Custom Data Structures in Java
## Overview

This project is a custom implementation of basic data structures in Java **without using built-in collections** (only `Iterator` is allowed).  
The main goal is to understand the underlying mechanics behind common data structures such as `ArrayList`, `LinkedList`, `Stack`, `Queue`, and `MinHeap`.
Made by Asset Iglikov, SE-2434

## 📂 Structure

- `MyList<T>` – custom interface that defines a list-like structure
- `MyArrayList<T>` – implementation of a dynamic array
- `MyLinkedList<T>` – doubly linked list implementation
- `MyStack<T>` – stack based on `MyArrayList`
- `MyQueue<T>` – queue based on `MyLinkedList`
- `MyMinHeap<T extends Comparable<T>>` – min-heap using `MyArrayList`
- `Main.java` – test cases to validate all functionality

## ⚙️ Features

### ✅ MyArrayList
- Add, remove, get, set
- Dynamic resizing (manual)
- Index bounds checking
- `size()`, `isEmpty()` methods

### ✅ MyLinkedList (Doubly)
- Node structure with `next` and `prev`
- Efficient insertion/removal
- Safe traversal and index checking

### ✅ MyStack
- Push/pop/peek
- Based on `MyArrayList`

### ✅ MyQueue
- Enqueue/dequeue
- Based on `MyLinkedList`

### ✅ MyMinHeap
- Insert, extractMin, getMin
- Min-heap property maintained via `heapify`
- Based on `MyArrayList`

## 🧪 Testing

Each structure is tested in `Main.java`. Example operations:
```java
MyStack<Integer> stack = new MyStack<>();
stack.push(10);
stack.push(20);
System.out.println(stack.pop()); // 20

MyMinHeap<Integer> heap = new MyMinHeap<>();
heap.insert(4);
heap.insert(1);
heap.insert(3);
System.out.println(heap.extractMin()); // 1
