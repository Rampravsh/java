public class method1 {
    public static void main(String[] args) {
        //function in java

        greet();

        sayHello("rampravesh");

        System.out.println(getNumber());

        System.out.println(multiply(35,344));

    }
    //NO Ip,NO Op
    static void greet(){
        System.out.println("Hello");
        return; // optional
    }
    //Ip,NO Op
    static void sayHello(String name){
        System.out.println("Hello "+name);
        return; // optional
    }
    //NO Ip, Op
    static int getNumber(){
        return 10; 
    }
    //Ip, Op
    static int multiply(int a, int b){
        return a*b; 
    }

}


