import java.util.Scanner;

public class rectangular {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row=scanner.nextInt();
        int col=scanner.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print('*');
            }
            System.out.println();
        }
    }    
}
