<!-- Arrays in Java — Comprehensive guide from basic to advanced -->

# Arrays in Java

This README is a comprehensive guide to arrays in Java, covering basics through advanced topics, practical examples, common pitfalls, and best practices.

Contents

- Introduction
- Declaration & Initialization
- Default values
- Accessing and iterating
- Common operations (length, copy, sort, search)
- Multi-dimensional and jagged arrays
- Arrays utility and Streams
- Varargs and arrays
- Arrays and generics / covariance
- Performance & memory
- Concurrency and parallel operations
- Practical examples
- Pitfalls & tips
- Further reading

## Introduction

An array is a fixed-size, ordered collection of elements of the same type. It's a basic building block for storing multiple values and is part of the core Java language.

Key properties:

- Fixed length after creation.
- Homogeneous types (primitive or reference types).
- Zero-based indexing.

## Declaration & Initialization

Declaration:

```java
int[] a;      // preferred style
int b[];      // legal, less common
```

Allocation and initialization:

```java
// allocate and then assign
a = new int[5];          // length 5, indexes 0..4

// declaration with inline initialization
int[] nums = {1, 2, 3, 4};

// allocate multi-dimensional
int[][] matrix = new int[3][4];
```

Notes:

- Arrays created with `new` contain default values (0, false, or null).
- You cannot change an array's length after creation; use collections (e.g., `ArrayList`) for resizable sequences.

## Default Values

Default values for array elements:

- byte, short, int, long: `0`
- float, double: `0.0` or `0.0f`
- char: `\u0000`
- boolean: `false`
- reference types (objects): `null`

## Accessing and Iterating

```java
int[] arr = {10, 20, 30};
int first = arr[0];
int last = arr[arr.length - 1];

// for loop
for (int i = 0; i < arr.length; i++) {
	System.out.println(arr[i]);
}

// enhanced for loop
for (int v : arr) System.out.println(v);
```

Avoid accessing with negative indexes or >= `length` — causes `ArrayIndexOutOfBoundsException`.

## Common Operations

Length:

- `arr.length` (note: `length` is a final field, not a method)

Copying arrays:

```java
int[] src = {1,2,3,4};
int[] dest = new int[4];
System.arraycopy(src, 0, dest, 0, src.length);

// convenience
int[] copy = java.util.Arrays.copyOf(src, src.length);
```

Sorting and searching:

```java
java.util.Arrays.sort(src);                 // in-place sort
int idx = java.util.Arrays.binarySearch(src, 3); // requires sorted
```

Filling with a value:

```java
int[] a = new int[5];
java.util.Arrays.fill(a, 7); // all elements = 7
```

Equality and string representation:

```java
boolean eq = java.util.Arrays.equals(a, copy);
String s = java.util.Arrays.toString(a);    // pretty print  [1, 2, 3]
```

## Multi-dimensional and Jagged Arrays

Declaration:

```java
int[][] mat = new int[3][4];  // true rectangular 3x4

// jagged (rows can differ)
int[][] jagged = new int[3][];
jagged[0] = new int[2];
jagged[1] = new int[4];
jagged[2] = new int[1];
```

Iterating:

```java
for (int i = 0; i < mat.length; i++) {
	for (int j = 0; j < mat[i].length; j++) {
		// use mat[i][j]
	}
}
```

## Arrays Utility and Streams

`java.util.Arrays` contains many helpers:

- `sort`, `parallelSort`
- `binarySearch`
- `copyOf`, `copyOfRange`
- `fill`, `equals`, `deepEquals`
- `toString`, `deepToString`

Streams and functional operations:

```java
int[] nums = {1,2,3,4,5};
int sum = java.util.Arrays.stream(nums).sum();
int[] doubled = java.util.Arrays.stream(nums).map(x -> x * 2).toArray();

// for reference arrays
String[] names = {"a","b"};
String joined = java.util.Arrays.stream(names).collect(java.util.stream.Collectors.joining(","));
```

## Varargs and Arrays

Method with variable arguments is backed by an array:

```java
void printAll(String... items) {
	for (String s : items) System.out.println(s);
}

// call
printAll("a", "b");
// called as printAll(new String[]{"a","b"}) under the hood
```

Be careful: varargs creates an array each call (costly in hot loops). Use overloads or lists when appropriate.

## Arrays and Generics / Covariance

Arrays are covariant for reference types:

```java
Object[] objs = new String[3]; // allowed at compile time
objs[0] = 123; // throws ArrayStoreException at runtime
```

Generics are invariant and incompatible with primitive arrays directly. Avoid mixing: `List<String>[]` is allowed but can be confusing and unsafe.

Type erasure and `T[]` with generics: you cannot create `new T[10]` inside generic code. Use `java.lang.reflect.Array.newInstance(componentType, length)` when necessary.

## Cloning Arrays

Arrays implement `clone()` which performs a shallow copy:

```java
int[] a = {1,2,3};
int[] b = a.clone(); // separate array for primitives

Object[] ref = new Object[]{ new int[]{1} };
Object[] refClone = ref.clone();
// refClone[0] points to the same inner int[] (shallow copy)
```

For nested arrays use `java.util.Arrays.copyOf` on each level or `deepCopy` patterns.

## Memory & Performance

- Arrays have contiguous memory for primitives (JVM dependent), which improves cache locality.
- Access by index is O(1).
- Insertion/deletion (except at end) requires shifting elements O(n).

When to use arrays vs `ArrayList`:

- Use arrays for fixed-size data and performance-sensitive primitive data.
- Use `ArrayList` for dynamic-sized collections and rich APIs.

Boxing cost: `List<Integer>` stores references to `Integer` objects — extra memory and boxing/unboxing overhead compared to `int[]`.

## Concurrency and Parallel Operations

`java.util.Arrays.parallelSort` uses the ForkJoin framework and can be faster on large arrays and multi-core CPUs.

Careful with sharing arrays between threads — protect with synchronization or use atomic types / concurrent collections.

## Practical Examples

1. Sum of an int array:

```java
int[] arr = {1,2,3,4};
int sum = 0;
for (int v : arr) sum += v;
// or
int sum2 = java.util.Arrays.stream(arr).sum();
```

2. Reverse an array in-place:

```java
void reverse(int[] a) {
	for (int i = 0, j = a.length - 1; i < j; i++, j--) {
		int t = a[i]; a[i] = a[j]; a[j] = t;
	}
}
```

3. Resize an array (create new larger array and copy):

```java
int[] old = {1,2,3};
int[] larger = java.util.Arrays.copyOf(old, old.length * 2);
```

4. Convert between `List` and array:

```java
List<String> list = java.util.List.of("a","b");
String[] arr = list.toArray(new String[0]);

// array to list (fixed-size list backed by array)
List<String> fixed = java.util.Arrays.asList(arr);
```

## Common Pitfalls & Tips

- Confusing `length` (array field) vs `length()` (String/method).
- Expect `ArrayIndexOutOfBoundsException` when index invalid.
- Remember arrays are fixed-size; use `ArrayList` or copy when resizing.
- Avoid `List<int[]>` when you meant `int[][]`; use primitives carefully.
- Varargs & generics: avoid `List<T>...` in public APIs — it can produce warnings and heap pollution.
- When converting a `List<T>` to `T[]`, prefer `list.toArray(new T[0])` — modern JVMs optimize it well.

## Advanced: Reflection & Runtime Creation

Create array with runtime component type: useful in generic utilities.

```java
import java.lang.reflect.Array;

Object makeArray(Class<?> componentType, int length) {
	return Array.newInstance(componentType, length);
}

// example
String[] s = (String[]) makeArray(String.class, 5);
```

## Further Reading

- Java Language Specification: arrays section
- `java.util.Arrays` and `java.util.stream` API docs
- Effective Java (Joshua Bloch) — advice about arrays, collections, and generics

---

If you'd like, I can:

- add runnable example files into this folder (e.g., `examples/`) with tests,
- include diagrams or cheat-sheet PDFs,
- or make a concise printable cheat-sheet version.

Tell me which follow-up you'd like and I'll update the repo accordingly.
