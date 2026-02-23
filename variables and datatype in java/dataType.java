public class dataType {
    public static void main(String[] args) {
        // Data Types in Java

        // Primitive Data Types
        byte byteVariable = 127; // 8-bit signed integer
        short shortVariable = 32767; // 16-bit signed integer
        int intVariable = 2147483647; // 32-bit signed integer
        long longVariable = 9223372036854775807L; // 64-bit signed integer (note the 'L' suffix)
        float floatVariable = 3.14f; // 32-bit single-precision floating point (note the 'f' suffix)
        double doubleVariable = 3.14159265359; // 64-bit double-precision floating point
        boolean booleanVariable = true; // true or false
        char charVariable = 'A'; // 16-bit Unicode character

        System.out.println("Primitive Data Types:"); 
        System.out.println("byte: " + byteVariable);
        System.out.println("short: " + shortVariable);
        System.out.println("int: " + intVariable);
        System.out.println("long: " + longVariable);
        System.out.println("float: " + floatVariable);
        System.out.println("double: " + doubleVariable);
        System.out.println("boolean: " + booleanVariable);
        System.out.println("char: " + charVariable);

        // Reference Data Types (Examples)
        String stringVariable = "Hello, Java!"; // String is a reference type
        int[] integerArray = {1, 2, 3, 4, 5}; // Array is a reference type

        System.out.println("\nReference Data Types:");
        System.out.println("String: " + stringVariable);
        System.out.println("Array element: " + integerArray[0]);
    }
}
