# Bitwise Operators in Java

This document provides a comprehensive guide to understanding and using bitwise operators in Java, from basic principles to advanced, real-world applications.

## Introduction

Bitwise operators are special operators that manipulate data at the bit level. They operate on integer types (`byte`, `short`, `int`, `long`) and treat them as a sequence of binary digits (bits). These operators are powerful for low-level programming, optimization, and specific algorithms where direct bit manipulation is necessary.

---

## 1. Basic Bitwise Operators

These operators perform bit-by-bit logical operations.

### a. Bitwise AND (`&`)

The AND operator returns a `1` for a bit position only if both corresponding bits are `1`.

| A | B | A & B |
|---|---|-------|
| 0 | 0 |   0   |
| 0 | 1 |   0   |
| 1 | 0 |   0   |
| 1 | 1 |   1   |

**Use Case:** Often used for "masking" – checking if a specific bit is turned on.

```java
int a = 5; // 0101
int b = 3; // 0011

int result = a & b; // 0001 (which is 1)
System.out.println(result); // Prints 1
```

### b. Bitwise OR (`|`)

The OR operator returns a `1` for a bit position if at least one of the corresponding bits is `1`.

| A | B | A \| B |
|---|---|--------|
| 0 | 0 |    0   |
| 0 | 1 |    1   |
| 1 | 0 |    1   |
| 1 | 1 |    1   |

**Use Case:** Often used for "setting" – turning a specific bit on.

```java
int a = 5; // 0101
int b = 3; // 0011

int result = a | b; // 0111 (which is 7)
System.out.println(result); // Prints 7
```

### c. Bitwise XOR (`^`)

The XOR (exclusive OR) operator returns a `1` if the corresponding bits are different.

| A | B | A ^ B |
|---|---|-------|
| 0 | 0 |   0   |
| 0 | 1 |   1   |
| 1 | 0 |   1   |
| 1 | 1 |   0   |

**Use Case:** Used for toggling a bit or swapping two variables without a temporary variable.

```java
int a = 5; // 0101
int b = 3; // 0011

int result = a ^ b; // 0110 (which is 6)
System.out.println(result); // Prints 6
```

### d. Bitwise NOT (`~`) / Complement

The NOT operator inverts all the bits of its operand. It turns `1`s to `0`s and `0`s to `1`s. In Java, this is based on two's complement representation.

```java
int a = 5; // 00000101
// ~a results in 11111010, which is -6 in two's complement
int result = ~a; 
System.out.println(result); // Prints -6
```

---

## 2. Bitwise Shift Operators

These operators shift the bits of a number to the left or right.

### a. Left Shift (`<<`)

Shifts the bits of the number to the left by a specified number of positions. The rightmost new bits are filled with zeros.

**Effect:** Equivalent to `number * 2^shift`.

```java
int a = 5; // 0101

// 0101 << 2  =>  010100 (which is 20)
int result = a << 2; 
System.out.println(result); // Prints 20 (5 * 2^2)
```

### b. Signed Right Shift (`>>`)

Shifts the bits to the right. The leftmost new bits are filled with the value of the sign bit (the most significant bit). This is called "sign extension" and preserves the number's sign.

**Effect:** Equivalent to `number / 2^shift`.

```java
// With a positive number
int a = 20; // 00010100
// 20 >> 2  =>  00000101 (which is 5)
System.out.println(a >> 2); // Prints 5

// With a negative number
int b = -20; // 11101100 (in 8 bits for simplicity)
// -20 >> 2 =>  11111011 (which is -5)
System.out.println(b >> 2); // Prints -5
```

### c. Unsigned Right Shift (`>>>`)

Shifts the bits to the right and always fills the leftmost new bits with zeros, regardless of the number's sign.

**Effect:** Can make a negative number positive.

```java
int b = -20; // 11111111111111111111111111101100 (32 bits)
// -20 >>> 2 will shift zeros in
int result = b >>> 2; 
System.out.println(result); // Prints a large positive number
```

---

## 3. Advanced & Real-World Use Cases

The `main.java` file in this directory contains a full, runnable example of these concepts.

### a. Flag Management / Permission Systems

This is the most common real-world use case. A single integer can hold dozens of boolean flags (options, permissions, etc.).

*   **Define Flags:** Each flag is a power of two.
*   **Grant/Add Flag:** Use `OR (|)`.
*   **Revoke/Remove Flag:** Use `AND (&)` with `NOT (~)`.
*   **Check Flag:** Use `AND (&)`.
*   **Toggle Flag:** Use `XOR (^)`.

```java
final int FLAG_A = 1; // 0001
final int FLAG_B = 2; // 0010
final int FLAG_C = 4; // 0100

// Grant flags A and C
int settings = FLAG_A | FLAG_C; // 0101

// Check if Flag C is set
if ((settings & FLAG_C) == FLAG_C) {
    System.out.println("Flag C is active.");
}

// Remove Flag A
settings = settings & ~FLAG_A; // 0101 & ~0001  =>  0101 & 1110 = 0100
```

### b. Fast Mathematical Operations

*   **Check for Even/Odd:** A number is odd if its last bit is 1.
    ```java
    if ((number & 1) == 1) {
        // odd
    } else {
        // even
    }
    ```
*   **Multiply/Divide by Powers of 2:** Use `<<` and `>>` for performance-critical code, as bit shifts are faster than arithmetic operations.

### c. Swapping Two Numbers Without a Temp Variable

A classic interview question solved with XOR.

```java
int a = 10;
int b = 20;

a = a ^ b;
b = a ^ b; // b becomes original a
a = a ^ b; // a becomes original b
```

### d. Color Channel Manipulation

In graphics, a color is often represented as a single 32-bit integer, with 8 bits for Alpha, Red, Green, and Blue (ARGB). Bitwise operators are used to extract, modify, and combine these color channels.

```java
int argb = 0xFF6699CC; // A=FF, R=66, G=99, B=CC

// Extract the Green channel
int green = (argb & 0x0000FF00) >> 8; // Mask and shift

// Remove the Alpha channel (make it opaque)
argb = argb | 0xFF000000;
```
