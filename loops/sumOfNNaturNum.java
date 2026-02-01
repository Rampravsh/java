public class sumOfNNaturNum {
    public static void main(String[] args) {
        int n = 10; // You can change this value to compute the sum of first n natural numbers
        int sum = 0;

        // for (int i = 1; i <= n; i++) {
        //     sum += i;
        // }

        int i=0;
        while (i<=n) {
            sum+=i;
            i++;
        }
        System.out.println("The sum of the first " + n + " natural numbers is: " + sum);
    }
}