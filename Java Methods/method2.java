public class method2 {
    public static void main(String[] args) {
        int x = sum(5, 2);
        System.out.println(x);
        int y = sum(4, 5, 6);
        System.out.println(y);
        greet("Rampravesh",20 );
    }

    static int sum(int a, int b) {
        return (a + b);
    }

    static int sum(int a, int b, int c) {
        return (a + b + c);
    }

    static int sum(double a, double b) {
        return (int) (a + b);
    }

    static void greet(String name, int age) {
        System.out.println("Hii " + name + ". Your age is " + age);
    }

    static void greet(int age, String name) {
        System.out.println("Hii " + name + ". Your age is " + age);
    }

}
