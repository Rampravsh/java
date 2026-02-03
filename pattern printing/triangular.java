import java.util.Scanner;

public class triangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row =scanner.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
