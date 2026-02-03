import java.util.Scanner;

public class firstNFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n=scanner.nextInt();
        int ans=1;
        while (n>1) {
            ans*=n;
            n--;
        }
        System.out.println(ans);
    }
}
