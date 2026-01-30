public class logicalOperator {
    public static void main(String[] args) {
        // Logical AND operator (&&)
        int a = 10, b = 20, c = 30;
        System.out.println("Logical AND (&&) operator");
        System.out.println((a < b) && (b < c)); // true && true = true
        System.out.println((a < b) && (b > c)); // true && false = false

        // Logical OR operator (||)
        System.out.println("\nLogical OR (||) operator");
        System.out.println((a > b) || (b < c)); // false || true = true
        System.out.println((a > b) || (b > c)); // false || false = false

        // Logical NOT operator (!)
        System.out.println("\nLogical NOT (!) operator");
        System.out.println(!(a < b)); // !(true) = false
        System.out.println(!(a > b)); // !(false) = true
    }
}
