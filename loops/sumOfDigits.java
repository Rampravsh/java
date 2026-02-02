import java.util.Scanner;

public class sumOfDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter your number:");
        int num=scanner.nextInt();
        int res=0;
        while (num>0) {
            int lastDigit=num%10;
            res+=lastDigit;
            num/=10;
        }
        System.out.println("sum of all ditit: "+res);

    }
}
