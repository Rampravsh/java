# All About Variables in Java

This document provides a comprehensive overview of variables in Java, including data types, naming conventions, and a comparison with other programming languages like Python, JavaScript, and C++.

## What is a Variable in Java?

A variable is a container that holds a value. In Java, variables are **statically typed**, which means you must declare the type of the variable before you can use it. This type checking helps catch errors at compile-time.

There are three kinds of variables in Java:

*   **Local Variables:** Declared inside a method. They must be initialized before use.
*   **Instance Variables:** Declared in a class but outside a method. They get a default value.
*   **Static Variables:** Declared with the `static` keyword. There is only one copy of this variable per class.

## Java Data Types

Java has two categories of data types:

### 1. Primitive Data Types

These are the most basic data types and are not objects.

*   `byte`: 8-bit integer.
*   `short`: 16-bit integer.
*   `int`: 32-bit integer. (Most common for whole numbers)
*   `long`: 64-bit integer. (Use for very large numbers, suffix with `L`)
*   `float`: 32-bit floating-point number. (Suffix with `f`)
*   `double`: 64-bit floating-point number. (Most common for decimal numbers)
*   `boolean`: `true` or `false`.
*   `char`: 16-bit Unicode character.

### 2. Reference (or Non-Primitive) Data Types

These variables refer to objects.

*   **String:** A sequence of characters.
*   **Arrays:** A collection of variables of the same type.
*   **Classes, Interfaces, etc.:** Custom types you create.

## Identifiers

An identifier is the name you give to a variable, method, class, or other element in your code.

**Rules for identifiers:**

1.  Can contain letters, digits, underscores (`_`), and dollar signs (`$`).
2.  Must begin with a letter, an underscore (`_`), or a dollar sign (`$`).
3.  Are case-sensitive (`myVariable` is different from `myvariable`).
4.  Cannot be a reserved Java keyword (like `int`, `public`, `class`).

## Naming Conventions

Following conventions makes your code easier to read and understand.

*   **Variables and Methods:** Use **camelCase**. Start with a lowercase letter, and capitalize the first letter of each subsequent word.
    *   `int numberOfStudents;`
    *   `String firstName;`
    *   `double accountBalance;`

*   **Classes:** Use **PascalCase** (or UpperCamelCase). Capitalize the first letter of every word.
    *   `public class MyClassName { ... }`

*   **Constants:** Use all uppercase letters with underscores to separate words.
    *   `static final double PI = 3.14159;`

## Comparison with Other Languages

| Feature             | Java                                                              | Python                                                              | JavaScript                                                           | C++                                                                   |
| ------------------- | ----------------------------------------------------------------- | ------------------------------------------------------------------- | -------------------------------------------------------------------- | --------------------------------------------------------------------- |
| **Typing**          | **Static** (must declare type)                                    | **Dynamic** (type is inferred at runtime)                           | **Dynamic** (type is inferred at runtime)                            | **Static** (must declare type)                                        |
| **Declaration**     | `type variableName = value;` <br> `int myNum = 5;`                | `variable_name = value` <br> `my_num = 5`                           | `let variableName = value;` <br> `let myNum = 5;`                     | `type variableName = value;` <br> `int myNum = 5;`                     |
| **Naming Convention** | `camelCase` for variables                                         | `snake_case` for variables                                          | `camelCase` for variables                                            | `snake_case` or `camelCase` (depends on style guide)                  |
| **Primitives**      | Has distinct primitive types (`int`, `char`) and object types (`String`). | Everything is an object.                                            | Has primitives (`number`, `string`, `boolean`) but they can behave like objects. | Has distinct primitive types very similar to Java.                    |
| **Type Safety**     | **Strong.** A variable's type cannot change.                      | **Strong.** A variable's type can change, but you can't mix types in operations arbitrarily (e.g., `3 + "hello"` is an error). | **Weak.** A variable's type can change, and it will try to coerce types in operations (e.g., `3 + "hello"` results in `"3hello"`). | **Strong.** A variable's type cannot change.                          |
