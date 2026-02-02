
public class BreakExample {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50, 60};
        int numberToFind = 40;
        boolean found = false;

        System.out.println("Searching for " + numberToFind + " in the array.");

        for (int number : numbers) {
            System.out.println("Checking: " + number);
            if (number == numberToFind) {
                found = true;
                break; // Exit the loop immediately
            }
        }

        if (found) {
            System.out.println("Number found!");
        } else {
            System.out.println("Number not found.");
        }
    }
}
