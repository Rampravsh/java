import java.util.Scanner;

public class borderofrectangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int row=scanner.nextInt();
        int col = scanner.nextInt();
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if(i==0 || j==0 ||i==row-1 ||j==col-1){
                    System.out.print('*');
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
