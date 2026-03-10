public class demo3 {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("rampravesh kumar");
        Student s3 = new Student("shyam kumar", 19);
        Student s4 = new Student("rohit kumar", 20, 21);
        Student s5 = new Student("pankesh kumar", 22, 23, "falna college");

    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    String college;

    Student() {
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    Student(String name, int age, int rollNumber, String college) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
        this.college = college;
    }

}