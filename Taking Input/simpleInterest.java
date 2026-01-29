import java.util.Scanner;

public class simpleInterest {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter priciple: ");
        float p= sc.nextFloat();
        System.out.print("Enter rate of interest: ");
        float r= sc.nextFloat();
        System.out.print("Enter time: ");
        float t= sc.nextFloat();

        float si = (p*r*t)/100;

        System.out.println("princple: "+ p);
        System.out.println("Rate: "+ r);
        System.out.println("Time: "+ t);
        
        System.out.println("simple interst: " + si);
    }
}
