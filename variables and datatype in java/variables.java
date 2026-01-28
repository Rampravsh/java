
public class variables {

    public static void main(String[] args) {

        // Primitive Data Types

        // byte: 8-bit signed integer
        byte byteVariable = 100;
        System.out.println("byte: " + byteVariable);

        // short: 16-bit signed integer
        short shortVariable = 30000;
        System.out.println("short: " + shortVariable);

        // int: 32-bit signed integer (most commonly used for integers)
        int integerVariable = 2000000000;
        System.out.println("int: " + integerVariable);

        // long: 64-bit signed integer (use for very large numbers)
        long longVariable = 9000000000000000000L; // Note the 'L' suffix
        System.out.println("long: " + longVariable);

        // float: 32-bit single-precision floating point
        float floatVariable = 3.14f; // Note the 'f' suffix
        System.out.println("float: " + floatVariable);

        // double: 64-bit double-precision floating point (most commonly used for decimals)
        double doubleVariable = 3.14159265359;
        System.out.println("double: " + doubleVariable);

        // boolean: true or false
        boolean booleanVariable = true;
        System.out.println("boolean: " + booleanVariable);

        // char: 16-bit Unicode character
        char charVariable = 'A';
        System.out.println("char: " + charVariable);


        // Reference Data Types (Examples)

        // String: a sequence of characters
        String stringVariable = "Hello, Java!";
        System.out.println("String: " + stringVariable);

        // Array
        int[] integerArray = {1, 2, 3, 4, 5};
        System.out.println("Array element: " + integerArray[0]);


        // Naming Conventions (camelCase for variables)
        int numberOfStudents = 25;
        String firstName = "John";
        double accountBalance = 1050.75;
        boolean isActive = false;

        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("First Name: " + firstName);
        System.out.println("Account Balance: " + accountBalance);
        System.out.println("Is Active: " + isActive);


        // Identifiers
        // Identifiers are names given to variables, methods, classes, etc.
        // They must start with a letter, $, or _
        // Subsequent characters can be letters, digits, $, or _
        // They are case-sensitive and cannot be a reserved keyword.

        // Valid identifiers
        // int a;
        // int _myVariable;
        // int $anotherVariable;
        // int variable123;

        // Invalid identifiers (uncomment to see compiler errors)
        // int 123variable;  // Cannot start with a digit
        // int my-variable; // Hyphens are not allowed
        // int new;         // 'new' is a reserved keyword
    }
}
