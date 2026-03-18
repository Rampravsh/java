public class Demo5 {
    public static void main(String[] args) {
        EngineeringStudent es = new EngineeringStudent();
        es.print();

    }
}

class Student {
    String name;
    int age;
    int rollNo;

    Student() {
    };

    Student(String name, int age, int rollNo) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    void print() {
        System.out.println(name + "," + age + "," + rollNo);
    }
}

class EngineeringStudent extends Student {
    String college;

    EngineeringStudent() {
    }

    EngineeringStudent(String name, int age, int rollNo, String college) {
        super(name, age, rollNo);
        this.college = college;
    }

    void print() {
        // System.out.println(super.name + super.age + super.rollNo);
        super.print();
        System.out.println(college);
    }
}