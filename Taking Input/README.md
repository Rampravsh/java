# Taking Input in Java

This document provides a comprehensive guide to various methods of taking input in Java, from basic to advanced techniques.

## 1. Using the `Scanner` Class

The `Scanner` class is part of the `java.util` package and is the most common and easiest way to get input from the user in Java. It can be used to read input from various sources, including the keyboard (standard input).

### How to use `Scanner`

1.  **Import the `Scanner` class:**
    ```java
    import java.util.Scanner;
    ```

2.  **Create a `Scanner` object:**
    ```java
    Scanner scanner = new Scanner(System.in);
    ```

3.  **Use `Scanner` methods to read input:**
    *   `nextInt()`: Reads an integer value.
    *   `nextDouble()`: Reads a double value.
    *   `next()`: Reads the next token (word) as a string.
    *   `nextLine()`: Reads the entire line of text.

### Example:

```java
import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        scanner.close();
    }
}
```

## 2. Using the `BufferedReader` Class

For reading a stream of characters, `BufferedReader` is more efficient than `Scanner`. It reads text from a character-input stream, buffering characters so as to provide for the efficient reading of characters, arrays, and lines.

### How to use `BufferedReader`

1.  **Import necessary classes:**
    ```java
    import java.io.BufferedReader;
    import java.io.IOException;
    import java.io.InputStreamReader;
    ```

2.  **Create a `BufferedReader` object:**
    ```java
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    ```

3.  **Read input:**
    *   The `readLine()` method reads a line of text. It returns `null` if the end of the stream is reached.

### Example:

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderExample {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.print("Enter your city: ");
        String city = reader.readLine();

        System.out.println("You live in " + city + ".");
    }
}
```

## 3. Using `System.in.read()`

The `System.in.read()` method reads a single byte of data from the standard input stream. It returns the byte as an integer. This is a more low-level way to read input.

### Example:

```java
public class ReadChar {
    public static void main(String[] args) throws Exception {
        System.out.print("Enter a character: ");
        char c = (char) System.in.read();
        System.out.println("You entered: " + c);
    }
}
```

## 4. Using Command-Line Arguments

You can also provide input to a Java program when you run it from the command line. These are called command-line arguments. They are stored as an array of strings in the `main` method's parameter.

### Example:

```java
public class CommandLineArguments {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("The command-line arguments are:");
            for (String arg : args) {
                System.out.println(arg);
            }
        } else {
            System.out.println("No command-line arguments found.");
        }
    }
}
```

### How to run with command-line arguments:

1.  Compile the Java file: `javac CommandLineArguments.java`
2.  Run the program with arguments: `java CommandLineArguments arg1 arg2 arg3`

## Summary of Input Methods

| Method | Use Case | Efficiency | Ease of Use |
| :--- | :--- | :--- | :--- |
| **`Scanner`** | General purpose input, easy for beginners. | Less efficient for large inputs. | Very Easy |
| **`BufferedReader`** | Reading large amounts of text, files. | More efficient due to buffering. | Moderate |
| **`System.in.read()`**| Reading a single character. | Low-level, efficient for single byte. | Hard |
| **Command-Line Arguments** | Input at program launch, for configuration. | N/A | Easy |
