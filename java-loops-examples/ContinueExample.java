
public class ContinueExample {
    public static void main(String[] args) {
        System.out.println("Printing odd numbers from 1 to 10:");

        for (int i = 1; i <= 10; i++) {
            // Check if the number is even
            if (i % 2 == 0) {
                continue; // Skip this iteration and go to the next one
            }
            System.out.println(i);
        }
    }
}
