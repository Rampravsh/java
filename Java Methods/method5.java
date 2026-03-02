public class method5 {
    
    public static void main(String[] args) {
        //Recursion
        int i=0;

        a(i);
    }

    static void a(int i){
        //base case
        if (i>5) {
            return;
        }
        System.out.println(i++);
        a(i);
    }
}
