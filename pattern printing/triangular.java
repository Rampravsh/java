import java.util.Scanner;

public class triangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row =scanner.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = i; j < row; j++) {
                System.out.print(" ");
            }
            for(int k =0;k<(i*2+1);k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
