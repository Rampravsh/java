class Algebra {
    int add(int a, int b){
        int ans = a+b;
        return ans;
    }
    
}

public class Main {
    static int sum(int a , int b){
        return a+b;
    }
    public static void main(String[] args) {
        Algebra obj = new Algebra();
        System.out.println(obj.add(10, 15));
        System.out.println(sum(4,5));
    }    
}
 