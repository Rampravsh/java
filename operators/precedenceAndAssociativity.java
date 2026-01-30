public class precedenceAndAssociativity {
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2, d = 8;

        // --- Operator Precedence ---
        // Multiplication (*) has higher precedence than addition (+).
        // So, b * c is evaluated first.
        System.out.println("--- Operator Precedence ---");
        int result1 = a + b * c; // is equivalent to a + (b * c)
        System.out.println("a + b * c = " + result1); // 10 + 5 * 2 = 10 + 10 = 20

        // Using parentheses to change precedence
        // The expression inside the parentheses is evaluated first.
        int result2 = (a + b) * c; // is equivalent to (10 + 5) * 2
        System.out.println("(a + b) * c = " + result2); // (10 + 5) * 2 = 15 * 2 = 30
        System.out.println();


        // --- Operator Associativity ---
        System.out.println("--- Operator Associativity ---");
        // Most binary operators in Java have left-to-right associativity.
        // For operators with the same precedence (* and /), evaluation happens from left to right.
        int result3 = d / c * a; // is equivalent to (d / c) * a
        System.out.println("d / c * a = " + result3); // (8 / 2) * 10 = 4 * 10 = 40

        // Assignment operators (=, +=, -= etc.) have right-to-left associativity.
        int x, y, z;
        System.out.println("\n--- Right-to-Left Associativity for Assignment ---");
        // The expression is evaluated as x = (y = (z = 100))
        x = y = z = 100;
        System.out.println("x = y = z = 100;");
        System.out.println("Value of x: " + x); // 100
        System.out.println("Value of y: " + y); // 100
        System.out.println("Value of z: " + z); // 100
        
        // --- Comprehensive Example Exploration ---
        System.out.println("\n--- Comprehensive Example Exploring More Operators ---");

        int i = 5;
        boolean flag = false;

        // This complex expression demonstrates precedence among different operator types.
        // Let's break down the evaluation of the expression: 10 + i++ > 15 && flag ? 50 : 100
        //
        // 1. Unary (postfix) 'i++': 'i' is used as 5 in the expression, and then 'i' becomes 6.
        //    Expression becomes: 10 + 5 > 15 && flag ? 50 : 100
        //
        // 2. Additive '+': 10 + 5 = 15.
        //    Expression becomes: 15 > 15 && flag ? 50 : 100
        //
        // 3. Relational '>': 15 > 15 is false.
        //    Expression becomes: false && flag ? 50 : 100
        //
        // 4. Logical AND '&&': Because the left operand is 'false', the '&&' operator short-circuits
        //    and the entire boolean expression evaluates to 'false' without checking the value of 'flag'.
        //    Expression becomes: false ? 50 : 100
        //
        // 5. Ternary operator '?:': Since the condition is 'false', the third operand is chosen.
        //    Final result: 100

        int finalResult = 10 + i++ > 15 && flag ? 50 : 100;

        System.out.println("The result of the complex expression is: " + finalResult);
        System.out.println("The final value of 'i' after the postfix increment is: " + i);
    }
}
