# A Comprehensive Guide to Java Methods

This guide provides a detailed overview of methods in Java, from fundamental concepts to more advanced topics.

## 1. Introduction to Java Methods

### What is a Method?
A method is a block of code that performs a specific task. It runs only when it is called. You can pass data, known as parameters, into a method. Methods are used to perform certain actions, and they are also known as functions.

### Why Use Methods?
- **Code Reusability**: Write the code once and use it many times.
- **Readability & Organization**: Break down complex problems into smaller, manageable pieces.
- **Maintainability**: Makes code easier to debug and maintain.

### Basic Syntax
A method is defined within a class. It has a name, a return type, and a list of parameters.

```java
accessModifier static/instance returnType methodName(parameter1, parameter2, ...) {
    // method body
    // code to be executed
    return value; // if returnType is not void
}
```
- **`accessModifier`**: (e.g., `public`, `private`) Defines the visibility of the method.
- **`static/instance`**: The `static` keyword means the method belongs to the class itself, not to an instance of the class. Instance methods (without `static`) can only be called on an object.
- **`returnType`**: The data type of the value the method returns. Use `void` if the method does not return a value.
- **`methodName`**: The name of the method.
- **`parameters`**: A comma-separated list of input data, each with a specified data type and name.

---

## 2. Core Concepts

### Method Declaration & Calling
`method1.java` demonstrates the four basic types of methods based on input and output.

```java
// 1. No Parameters, No Return Value
static void greet() {
    System.out.println("Hello");
}

// 2. With Parameters, No Return Value
static void sayHello(String name) {
    System.out.println("Hello " + name);
}

// 3. No Parameters, With Return Value
static int getNumber() {
    return 10;
}

// 4. With Parameters, With Return Value
static int multiply(int a, int b) {
    return a * b;
}

// Calling the methods
greet();
sayHello("Alice");
int num = getNumber();
int result = multiply(5, 3);
```

### Pass-by-Value
Java is strictly **pass-by-value**. This means:
- When a **primitive type** (like `int`, `double`, `boolean`) is passed to a method, a copy of the value is passed. Changes to the parameter inside the method do not affect the original variable.
- When an **object reference** (like an array or any class object) is passed, a copy of the reference (the memory address) is passed. This means the method can modify the *internal state* of the object, but it cannot change the original reference to point to a new object.

---

## 3. Method Overloading
Method overloading allows a class to have multiple methods with the **same name**, as long as their **parameter lists are different**. This can be a different number of parameters, different types of parameters, or a different order of parameter types.

`method2.java` illustrates this:
```java
// Overloaded 'sum' methods
static int sum(int a, int b) {
    return (a + b);
}

// Different number of parameters
static int sum(int a, int b, int c) {
    return (a + b + c);
}

// Different types of parameters
static double sum(double a, double b) {
    return (a + b);
}
```
Method overloading improves code readability by allowing you to use the same name for methods that perform similar actions.

---

## 4. Variable Scope
The scope of a variable determines where it can be accessed in the code. `method4.java` shows two basic scopes:

- **Local Scope**: Variables declared inside a method or a block (like an `if` statement or loop) are only accessible within that method or block.
- **Class Scope (Static Variables)**: Variables declared with the `static` keyword at the class level are shared among all instances of the class and can be accessed from any static or instance method in that class.

```java
public class ScopeExample {
    static String classScopedName = "Global"; // Class scope

    public static void main(String[] args) {
        int methodScopedVar = 10; // Local (method) scope

        if (methodScopedVar == 10) {
            int blockScopedVar = 20; // Local (block) scope
            System.out.println(blockScopedVar);
        }
        // System.out.println(blockScopedVar); // This would cause a compile error
    }
}
```
---

## 5. Recursion
Recursion is a technique where a method calls itself to solve a problem. A recursive method must have two parts:

1.  **Base Case**: A condition that stops the recursion. Without a base case, the method would call itself infinitely, leading to a `StackOverflowError`.
2.  **Recursive Step**: The part of the method that calls itself, typically with a modified argument that moves it closer to the base case.

`method5.java` shows a simple recursive function:
```java
static void countDown(int i) {
    // Base case
    if (i < 0) {
        return;
    }
    
    System.out.println(i);
    
    // Recursive step
    countDown(i - 1);
}
```
Recursion is an elegant way to solve problems that can be broken down into smaller, self-similar sub-problems, such as traversing tree structures or calculating factorials.

---

## 6. Advanced Topics

### Varargs (Variable-Length Arguments)
You can create a method that accepts a variable number of arguments by using `...` in the parameter declaration. The varargs parameter is treated as an array within the method.

```java
public static int sumAll(int... numbers) {
    int total = 0;
    for (int num : numbers) {
        total += num;
    }
    return total;
}

// Can be called with any number of arguments
sumAll(1, 2);
sumAll(5, 10, 15, 20);
```

### Method Chaining
Method chaining is a pattern where multiple methods are called sequentially on the same object in a single statement. This is common in builders and stream operations. The `method3.java` example shows a simple call stack chain, but true method chaining requires methods to return the object instance (`this`).

```java
// Example: StringBuilder
StringBuilder sb = new StringBuilder();
sb.append("Hello").append(" ").append("World").delete(5, 6).insert(5, ",");
System.out.println(sb.toString()); // "Hello, World"
```

### `final` Methods
A method declared with the `final` keyword cannot be overridden by subclasses. This is used to enforce a specific implementation and prevent unintended changes in the class hierarchy.

```java
public class Parent {
    public final void show() {
        System.out.println("This is a final method.");
    }
}

public class Child extends Parent {
    // public void show() { } // This would cause a compile error
}
```

### Abstract Methods
An abstract method is a method that is declared without an implementation (it has no body). It must be declared in an `abstract` class. Any subclass of the abstract class must either be abstract itself or provide an implementation for all abstract methods.

```java
abstract class Animal {
    // Abstract method (no body)
    public abstract void makeSound();
}

class Dog extends Animal {
    // Provide implementation
    public void makeSound() {
        System.out.println("Woof");
    }
}
```
