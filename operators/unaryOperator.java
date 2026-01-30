public class unaryOperator {

    public static void main(String[] args) {
        int a = 10;
        boolean c = true;

        // Unary Plus operator (+) - indicates positive value
        System.out.println("Unary Plus (+): " + (+a)); // 10

        // Unary Minus operator (-) - negates an expression
        System.out.println("Unary Minus (-): " + (-a)); // -10

        // Increment operator (++) - increments value by 1
        // Post-increment (a++)
        System.out.println("\nPost-increment (a++):");
        System.out.println("Initial value of a: " + a); // 10
        System.out.println("Value of a++: " + (a++)); // 10 (value is used first, then incremented)
        System.out.println("Value of a after a++: " + a); // 11

        // Pre-increment (++a)
        System.out.println("\nPre-increment (++a):");
        // Reset a to 10 for a clear example
        a = 10;
        System.out.println("Initial value of a: " + a); // 10
        System.out.println("Value of ++a: " + (++a)); // 11 (value is incremented first, then used)
        System.out.println("Value of a after ++a: " + a); // 11

        // Decrement operator (--) - decrements value by 1
        // Post-decrement (a--)
        System.out.println("\nPost-decrement (a--):");
        // Reset a to 10 for a clear example
        a = 10;
        System.out.println("Initial value of a: " + a); // 10
        System.out.println("Value of a--: " + (a--)); // 10 (value is used first, then decremented)
        System.out.println("Value of a after a--: " + a); // 9

        // Pre-decrement (--a)
        System.out.println("\nPre-decrement (--a):");
        // Reset a to 10 for a clear example
        a = 10;
        System.out.println("Initial value of a: " + a); // 10
        System.out.println("Value of --a: " + (--a)); // 9 (value is decremented first, then used)
        System.out.println("Value of a after --a: " + a); // 9

        // Logical NOT operator (!) - inverts a boolean value
        System.out.println("\nLogical NOT (!):");
        System.out.println("Initial value of c: " + c);      // true
        System.out.println("Value of !c: " + (!c));        // false
    }
}