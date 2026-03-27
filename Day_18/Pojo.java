public class Pojo {
    public static void main(String[] args) {
        // Using the POJO class
        Employee emp = new Employee();
        emp.setName("John Doe");
        emp.setSalary(50000.0);
        
        System.out.println("Employee: " + emp.getName() + ", Salary: " + emp.getSalary());
    }
}

// A POJO (Plain Old Java Object) is a simple class with no special restrictions
// other than those forced by the Java Language Specification.
class Employee {
    // 1. Private fields
    private String name;
    private double salary;

    // 2. Public default constructor
    public Employee() {}

    // 3. Getter and Setter methods
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}