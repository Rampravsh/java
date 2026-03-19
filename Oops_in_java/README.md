# Object-Oriented Programming (OOP) in Java, C++, Python, and JavaScript

This document provides a comprehensive overview of Object-Oriented Programming (OOP) principles with examples in Java, C++, Python, and JavaScript. It covers fundamental concepts and explores the differences in their implementation across these languages.

## Table of Contents

1.  [Core OOP Concepts](#core-oop-concepts)
    *   [Objects](#objects)
    *   [Classes](#classes)
    *   [Encapsulation](#encapsulation)
    *   [Inheritance](#inheritance)
    *   [Polymorphism](#polymorphism)
    *   [Abstraction](#abstraction)
2.  [Language-Specific Implementations](#language-specific-implementations)
    *   [Java](#java)
    *   [C++](#c++)
    *   [Python](#python)
    *   [JavaScript](#javascript)
3.  [Key Differences Summary](#key-differences-summary)
4.  [Advanced Concepts](#advanced-concepts)

---

## Core OOP Concepts

### Objects

An **object** is a fundamental unit in OOP that represents a real-world entity. It consists of:
*   **State:** Attributes or properties (data).
*   **Behavior:** Methods (functions) that operate on the data.

For example, a `car` object would have states like `color` and `speed`, and behaviors like `accelerate()` and `brake()`.

### Classes

A **class** is a blueprint for creating objects. It defines the properties and methods that all objects of that class will have.

**Java:**
```java
class Car {
    String color;
    int speed;

    void accelerate() {
        // implementation
    }
}
```

**C++:**
```cpp
class Car {
public:
    std::string color;
    int speed;

    void accelerate() {
        // implementation
    }
};
```

**Python:**
```python
class Car:
    def __init__(self, color, speed):
        self.color = color
        self.speed = speed

    def accelerate(self):
        # implementation
        pass
```

**JavaScript (ES6):**
```javascript
class Car {
    constructor(color, speed) {
        this.color = color;
        this.speed = speed;
    }

    accelerate() {
        // implementation
    }
}
```

### Encapsulation

**Encapsulation** is the bundling of data (attributes) and methods that operate on the data into a single unit (a class). It restricts direct access to some of an object's components, which is a means of preventing accidental interference and misuse of the data. Access to the data is typically controlled through public methods (getters and setters).

**Java:**
```java
public class Person {
    private String name; // private attribute

    public String getName() { // getter
        return name;
    }

    public void setName(String newName) { // setter
        this.name = newName;
    }
}
```

### Inheritance

**Inheritance** is a mechanism where a new class (subclass or derived class) inherits properties and behaviors from an existing class (superclass or base class). This promotes code reuse.

**Java:**
```java
class Vehicle { // Superclass
    // ...
}

class Car extends Vehicle { // Subclass
    // ...
}
```

**C++:**
```cpp
class Vehicle { // Base class
    // ...
};

class Car : public Vehicle { // Derived class
    // ...
};
```

**Python:**
```python
class Vehicle: # Superclass
    pass

class Car(Vehicle): # Subclass
    pass
```

**JavaScript (ES6):**
```javascript
class Vehicle { // Superclass
    constructor() {}
}

class Car extends Vehicle { // Subclass
    constructor() {
        super();
    }
}
```

### Polymorphism

**Polymorphism** ("many forms") allows objects of different classes to be treated as objects of a common superclass. It's the ability to present the same interface for differing underlying forms (data types). A common use of polymorphism is when a parent class reference is used to refer to a child class object.

A common example is **method overriding**, where a subclass provides a specific implementation of a method that is already defined in its superclass.

**Java:**
```java
class Animal {
    public void makeSound() {
        System.out.println("Some generic sound");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}

class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Meow");
    }
}
```

### Abstraction

**Abstraction** means hiding complex implementation details and showing only the essential features of the object. It's about simplifying complex reality by modeling classes appropriate to the problem.

This is often achieved through **abstract classes** and **interfaces**. An abstract class cannot be instantiated and may contain abstract methods (methods without a body). An interface is a completely abstract class that only contains abstract methods.

**Java:**
```java
// Abstract Class
abstract class Shape {
    abstract void draw(); // abstract method
}

class Circle extends Shape {
    void draw() {
        System.out.println("Drawing a circle");
    }
}

// Interface
interface Drawable {
    void draw();
}

class Square implements Drawable {
    public void draw() {
        System.out.println("Drawing a square");
    }
}
```

---

## Language-Specific Implementations

### Java
*   **Statically Typed:** Types are checked at compile time.
*   **Single Inheritance:** A class can only inherit from one superclass. Interfaces are used to achieve a form of multiple inheritance.
*   **Explicit Access Modifiers:** `public`, `private`, `protected`, and default (package-private).
*   **Everything is a Class:** All code resides within classes.

### C++
*   **Statically Typed:** Types are checked at compile time.
*   **Multiple Inheritance:** A class can inherit from multiple base classes, which can lead to the "Diamond Problem".
*   **Explicit Access Modifiers:** `public`, `private`, `protected`.
*   **Pointers and Memory Management:** Requires manual memory management (or smart pointers).

### Python
*   **Dynamically Typed:** Types are checked at run time.
*   **Multiple Inheritance:** Supports inheriting from multiple classes.
*   **Name Mangling for "Private" Attributes:** Uses `__` prefix to make attributes harder to access, but not truly private.
*   **"self" is Explicit:** The instance of the object is passed as the first argument to methods (`self`).

### JavaScript
*   **Dynamically Typed:** Types are checked at run time.
*   **Prototypal Inheritance:** Objects inherit directly from other objects. The `class` syntax (since ES6) is syntactic sugar over this.
*   **No True "Private" Members (pre-ES2022):** Encapsulation is often achieved by convention (e.g., `_` prefix). Newer versions of JavaScript are introducing private class fields using a `#` prefix.
*   **"this" Context:** The value of `this` can change depending on how a function is called.

---

## Key Differences Summary

| Feature               | Java                               | C++                                     | Python                             | JavaScript (ES6+)                  |
| --------------------- | ---------------------------------- | --------------------------------------- | ---------------------------------- | ---------------------------------- |
| **Typing**            | Static                             | Static                                  | Dynamic                            | Dynamic                            |
| **Inheritance**       | Single (with interfaces)           | Multiple                                | Multiple                           | Single (Prototypal)                |
| **Encapsulation**     | `private`, `protected`, `public`   | `private`, `protected`, `public`        | Convention (`_`) & Name Mangling (`__`) | Convention (`_`) & `#` prefix     |
| **Abstraction**       | `abstract` classes & `interface`s  | `virtual` functions & abstract classes   | `abc` module                       | Not explicit, convention-based      |
| **Memory Management** | Automatic (Garbage Collection)     | Manual (or smart pointers)              | Automatic (Garbage Collection)     | Automatic (Garbage Collection)     |

---

## Advanced Concepts

*   **Method Overloading vs. Overriding:**
    *   **Overloading:** Defining multiple methods with the same name but different parameters within the same class.
    *   **Overriding:** A subclass provides a specific implementation for a method defined in its superclass.
*   **Constructors and Destructors:**
    *   **Constructors:** Special methods for creating and initializing an object.
    *   **Destructors:** Called when an object is destroyed (primarily a concept in C++ for resource cleanup).
*   **Static Members:**
    *   **Static methods/attributes** belong to the class itself, not to any specific instance.
*   **Virtual Functions (C++):**
    *   A `virtual` function in a base class can be overridden by a derived class, enabling polymorphism.
