public class method4 {

    static String name ="Rampravesh";
    public static void main(String[] args) {
        // Scope of a variable

        int x = 4; // local scope
        int y = 5;

        if (x == 4) {
            int j = 7;
            System.out.println(j);
        }
        System.out.println(x + "," + y);

        System.out.println(name);

        fun();
    }

    static void fun() {
        int x = 4; // local scope
        int y = 5;
        System.out.println(x + "," + y);
    }
}
