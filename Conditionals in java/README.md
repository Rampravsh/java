# Conditionals in Java

This document provides a comprehensive guide to conditional statements in Java, which are used to control the flow of execution based on certain conditions.

## 1. `if` Statement

The `if` statement is the most basic conditional statement. It executes a block of code only if a specified condition is true.

### Syntax
```java
if (condition) {
    // code to be executed if the condition is true
}
```

### Example
```java
int age = 20;
if (age >= 18) {
    System.out.println("You are eligible to vote.");
}
```

## 2. `if-else` Statement

The `if-else` statement provides an alternative block of code to be executed if the condition is false.

### Syntax
```java
if (condition) {
    // code to be executed if the condition is true
} else {
    // code to be executed if the condition is false
}
```

### Example
```java
int number = 7;
if (number % 2 == 0) {
    System.out.println("The number is even.");
} else {
    System.out.println("The number is odd.");
}
```

## 3. `if-else-if` Ladder

The `if-else-if` ladder is used to test multiple conditions sequentially.

### Syntax
```java
if (condition1) {
    // code to be executed if condition1 is true
} else if (condition2) {
    // code to be executed if condition2 is true
} else if (condition3) {
    // code to be executed if condition3 is true
} else {
    // code to be executed if all above conditions are false
}
```

### Example
```java
int marks = 75;
if (marks >= 90) {
    System.out.println("Grade A");
} else if (marks >= 80) {
    System.out.println("Grade B");
} else if (marks >= 70) {
    System.out.println("Grade C");
} else {
    System.out.println("Grade D");
}
```

## 4. Nested `if` Statements

You can have `if` statements inside other `if` statements. This is called nesting.

### Syntax
```java
if (outer_condition) {
    // code
    if (inner_condition) {
        // code
    }
}
```

### Example
```java
int age = 25;
boolean isCitizen = true;
if (age >= 18) {
    if (isCitizen) {
        System.out.println("You are eligible to vote.");
    } else {
        System.out.println("You must be a citizen to vote.");
    }
} else {
    System.out.println("You must be at least 18 years old to vote.");
}
```

## 5. Ternary Operator

The ternary operator (`? :`) is a shorthand for the `if-else` statement. It can be used to assign a value to a variable based on a condition.

### Syntax
```java
variable = (condition) ? value_if_true : value_if_false;
```

### Example
```java
int num1 = 10;
int num2 = 20;
int max = (num1 > num2) ? num1 : num2;
System.out.println("The maximum is: " + max); // Output: The maximum is: 20
```

## 6. `switch` Statement

The `switch` statement allows a variable to be tested for equality against a list of values. Each value is called a case, and the variable being switched on is checked for each case.

### Traditional `switch` (Before Java 14)

### Syntax
```java
switch (expression) {
    case value1:
        // code
        break; // optional
    case value2:
        // code
        break; // optional
    // you can have any number of case statements.
    default: // optional
        // code
}
```
**Note:** The `break` statement is used to exit the `switch` block. If `break` is omitted, execution will "fall through" to the next case.

### Example
```java
int day = 4;
String dayString;
switch (day) {
    case 1:  dayString = "Monday";
             break;
    case 2:  dayString = "Tuesday";
             break;
    case 3:  dayString = "Wednesday";
             break;
    case 4:  dayString = "Thursday";
             break;
    case 5:  dayString = "Friday";
             break;
    case 6:  dayString = "Saturday";
             break;
    case 7:  dayString = "Sunday";
             break;
    default: dayString = "Invalid day";
             break;
}
System.out.println(dayString); // Output: Thursday
```

### Enhanced `switch` (Java 14 and later)

Java 14 introduced a more concise and less error-prone `switch` expression.

#### Arrow `->` Syntax
This syntax avoids fall-through, so `break` statements are not needed.

```java
int day = 4;
String dayString = switch (day) {
    case 1 -> "Monday";
    case 2 -> "Tuesday";
    case 3 -> "Wednesday";
    case 4 -> "Thursday";
    case 5 -> "Friday";
    case 6 -> "Saturday";
    case 7 -> "Sunday";
    default -> "Invalid day";
};
System.out.println(dayString); // Output: Thursday
```

#### `yield` Keyword
The `yield` keyword is used to return a value from a `switch` expression when a block of code is needed.

```java
int day = 1;
String dayType = switch (day) {
    case 1, 2, 3, 4, 5 -> "Weekday";
    case 6, 7 -> {
        System.out.println("It's the weekend!");
        yield "Weekend";
    }
    default -> "Invalid day";
};
System.out.println(dayType); // Output: It's the weekend! Weekday
```
(Note: The `println` inside the case also executes)
