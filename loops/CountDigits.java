import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your number:");
        int number=sc.nextInt();
        int digit=0;
        while(number>0){
            System.out.print(number+" ");
            number/=10;
            digit++;
        }
        System.out.println("\n"+digit);
    }
}
