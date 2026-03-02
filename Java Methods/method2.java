public class method2 {
    public static void main(String[] args) {
        int x=sum(5, 2);
        System.out.println(x);
        int y=sum(4,5,6);
        System.out.println(y);
    }

    static int sum(int a, int b) {
        return (a + b);
    }

    static int sum(int a, int b, int c) {
        return (a + b + c);
    }
}
