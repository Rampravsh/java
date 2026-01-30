public class assignmentOperator {
    public static void main(String[] args) {
        // Simple Assignment (=)
        int a = 10;
        int b = a;
        System.out.println("Simple Assignment (=): b = " + b); // b = 10

        // Add and Assign (+=)
        b += a; // b = b + a = 10 + 10 = 20
        System.out.println("Add and Assign (+=): b = " + b); // b = 20

        // Subtract and Assign (-=)
        b -= a; // b = b - a = 20 - 10 = 10
        System.out.println("Subtract and Assign (-=): b = " + b); // b = 10

        // Multiply and Assign (*=)
        b *= a; // b = b * a = 10 * 10 = 100
        System.out.println("Multiply and Assign (*=): b = " + b); // b = 100

        // Divide and Assign (/=)
        b /= a; // b = b / a = 100 / 10 = 10
        System.out.println("Divide and Assign (/=): b = " + b); // b = 10

        // Modulus and Assign (%=)
        b %= 3; // b = b % 3 = 10 % 3 = 1
        System.out.println("Modulus and Assign (%=): b = " + b); // b = 1
    }
}
