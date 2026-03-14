public class Demo1 {
    public static void main(String[] args) {
        BankAccount b1 = new BankAccount();
        System.out.println(b1.balance);

    }
}

class BankAccount {

    double balance;

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

}

class Student {
    private String name;
    // private int age;
    // private int rollNo;
    // private String college;

    Student(String name, int age, int rollNo, String college) {
        this.name = name;
        // this.age = age;
        // this.rollNo = rollNo;
        // this.college = college;
    }

    Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}