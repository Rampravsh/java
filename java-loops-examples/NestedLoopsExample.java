
public class NestedLoopsExample {
    public static void main(String[] args) {
        int rows = 5;
        int columns = 5;

        System.out.println("Printing a 5x5 rectangle:");

        // Outer loop for rows
        for (int i = 1; i <= rows; i++) {
            // Inner loop for columns
            for (int j = 1; j <= columns; j++) {
                System.out.print("* ");
            }
            // Move to the next line after each row is printed
            System.out.println();
        }
    }
}
