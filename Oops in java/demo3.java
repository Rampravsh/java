public class demo3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("rampravesh kumar");
        Student s3 = new Student("shyam kumar", 19);
        Student s4 = new Student("rohit kumar", 20, 21);
        Student s5 = new Student("pankesh kumar", 22, 23, "falna college");
        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name);
        System.out.println(s4.name);
        System.out.println(s5.name);
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
        // this.name="unknown";
        // this.age=0;
        // this.rollNumber=0;
        // this.college="unknown";

        this("unknown", 0, 0, "unknown");

    }

    Student(String name) {
        // this.name = name;
        this(name, 0, 0, "unknown");
    }

    Student(String name, int age) {
        // this.name = name;
        // this.age = age;

        this(name, age, 0, "unknown");
    }

    Student(String name, int age, int rollNumber) {
        // this.name = name;
        // this.age = age;
        // this.rollNumber = rollNumber;

        this(name, age, rollNumber, "unknown");
    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

}