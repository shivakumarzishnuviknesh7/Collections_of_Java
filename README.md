
# Java Collections Framework

## Overview

The Java Collections Framework (JCF) provides a set of classes and interfaces that implement commonly reusable collection data structures. This framework is a key component of the Java programming language and provides both generic and non-generic implementations for managing groups of objects.

This README serves as a comprehensive guide to all the collections available in the JCF, including their usage, advantages, and key methods.

## Table of Contents

1. [Core Interfaces](#core-interfaces)
    - [Collection](#collection-interface)
    - [List](#list-interface)
    - [Set](#set-interface)
    - [Queue](#queue-interface)
    - [Deque](#deque-interface)
    - [Map](#map-interface)
2. [Implementations](#implementations)
    - [ArrayList](#arraylist)
    - [LinkedList](#linkedlist)
    - [HashSet](#hashset)
    - [LinkedHashSet](#linkedhashset)
    - [TreeSet](#treeset)
    - [PriorityQueue](#priorityqueue)
    - [ArrayDeque](#arraydeque)
    - [HashMap](#hashmap)
    - [LinkedHashMap](#linkedhashmap)
    - [TreeMap](#treemap)
    - [Concurrent Collections](#concurrent-collections)
3. [Utilities](#utilities)
    - [Collections](#collections-class)
    - [Arrays](#arrays-class)
4. [Best Practices](#best-practices)
5. [Further Reading](#further-reading)

## Core Interfaces

### Collection Interface

The `Collection` interface is the root of the collections hierarchy. It defines the basic operations that are common to all collections:

- **add(E e)**: Adds an element to the collection.
- **remove(Object o)**: Removes a single instance of the specified element.
- **size()**: Returns the number of elements in the collection.
- **clear()**: Removes all elements from the collection.
- **iterator()**: Returns an iterator over the elements.

### List Interface

The `List` interface extends `Collection` and represents an ordered collection (a sequence). Key features:

- Allows duplicate elements.
- Provides positional access and insertion.
  
**Implementations:**
- `ArrayList`
- `LinkedList`
- `Vector` (Legacy)
- `Stack` (Legacy)

### Set Interface

The `Set` interface extends `Collection` and represents a collection that does not allow duplicate elements.

**Implementations:**
- `HashSet`
- `LinkedHashSet`
- `TreeSet`

### Queue Interface

The `Queue` interface extends `Collection` and represents a collection designed for holding elements prior to processing.

**Implementations:**
- `LinkedList`
- `PriorityQueue`

### Deque Interface

The `Deque` (Double-Ended Queue) interface extends `Queue` and allows insertion and removal of elements from both ends.

**Implementations:**
- `ArrayDeque`
- `LinkedList`

### Map Interface

The `Map` interface represents a collection of key-value pairs. It does not extend `Collection`.

**Implementations:**
- `HashMap`
- `LinkedHashMap`
- `TreeMap`
- `Hashtable` (Legacy)
- `Properties` (Legacy)

## Implementations

### ArrayList

- **Description:** A resizable array implementation of the `List` interface.
- **Use Cases:** When you need fast random access to elements.
- **Key Methods:**
  - `add(E e)`
  - `get(int index)`
  - `remove(int index)`
  - `set(int index, E element)`

### LinkedList

- **Description:** A doubly-linked list implementation of the `List` and `Deque` interfaces.
- **Use Cases:** When you need frequent insertions and deletions.
- **Key Methods:**
  - `addFirst(E e)`
  - `addLast(E e)`
  - `removeFirst()`
  - `removeLast()`

### HashSet

- **Description:** A hash table implementation of the `Set` interface.
- **Use Cases:** When you need to prevent duplicates and require fast lookups.
- **Key Methods:**
  - `add(E e)`
  - `remove(Object o)`
  - `contains(Object o)`

### LinkedHashSet

- **Description:** A `HashSet` that maintains insertion order.
- **Use Cases:** When you need set behavior with consistent iteration order.
- **Key Methods:**
  - Same as `HashSet`.

### TreeSet

- **Description:** A Red-Black tree-based implementation of the `NavigableSet` interface.
- **Use Cases:** When you need sorted set behavior.
- **Key Methods:**
  - `first()`
  - `last()`
  - `subSet(E fromElement, E toElement)`

### PriorityQueue

- **Description:** A priority heap-based queue.
- **Use Cases:** When you need elements ordered by their natural ordering or a custom comparator.
- **Key Methods:**
  - `offer(E e)`
  - `peek()`
  - `poll()`

### ArrayDeque

- **Description:** A resizable array implementation of the `Deque` interface.
- **Use Cases:** When you need a double-ended queue without capacity limitations.
- **Key Methods:**
  - `addFirst(E e)`
  - `addLast(E e)`
  - `removeFirst()`
  - `removeLast()`

### HashMap

- **Description:** A hash table-based implementation of the `Map` interface.
- **Use Cases:** When you need key-value pairs with fast lookup by key.
- **Key Methods:**
  - `put(K key, V value)`
  - `get(Object key)`
  - `remove(Object key)`

### LinkedHashMap

- **Description:** A `HashMap` that maintains insertion order.
- **Use Cases:** When you need map behavior with consistent iteration order.
- **Key Methods:**
  - Same as `HashMap`.

### TreeMap

- **Description:** A Red-Black tree-based implementation of the `NavigableMap` interface.
- **Use Cases:** When you need sorted map behavior.
- **Key Methods:**
  - `firstKey()`
  - `lastKey()`
  - `subMap(K fromKey, K toKey)`

### Concurrent Collections

- **Description:** Thread-safe collections for concurrent access.
- **Implementations:**
  - `ConcurrentHashMap`
  - `CopyOnWriteArrayList`
  - `CopyOnWriteArraySet`
  - `ConcurrentLinkedQueue`

## Utilities

### Collections Class

The `Collections` class consists of static methods that operate on or return collections. 

**Key Methods:**
- `sort(List<T> list)`
- `shuffle(List<?> list)`
- `binarySearch(List<? extends Comparable<? super T>> list, T key)`
- `reverse(List<?> list)`
- `unmodifiableList(List<? extends T> list)`

### Arrays Class

The `Arrays` class provides methods for manipulating arrays.

**Key Methods:**
- `asList(T... a)`
- `sort(T[] a)`
- `binarySearch(T[] a, T key)`
- `equals(Object[] a, Object[] a2)`
- `fill(T[] a, T val)`

## Best Practices

- **Choose the Right Collection:** Select the appropriate collection type based on your needs (e.g., `ArrayList` for fast access, `LinkedList` for fast insertions/deletions).
- **Use Generics:** Always use generics to ensure type safety.
- **Minimize Collection Resizing:** When possible, initialize collections with an appropriate initial capacity.
- **Use Iterators Safely:** When removing elements during iteration, use the `Iterator`'s `remove()` method to avoid `ConcurrentModificationException`.

## Further Reading

- [Java Collections Framework Documentation](https://docs.oracle.com/javase/8/docs/technotes/guides/collections/index.html)
- [Effective Java by Joshua Bloch](https://www.oreilly.com/library/view/effective-java/9780134686097/)
