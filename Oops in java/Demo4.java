// Static keyword

public class Demo4 {
    public static void main(String[] args) {
        Student s1 = new Student("rampravesh kumar", 20, 21);
        Student s2 = new Student("Shyam kumar", 17, 1);
        // Student.college = "falna";
        System.out.println(s1.name + " " + Student.college);
        System.out.println(s2.name + " " + Student.college);
    }
}

class Student {
    String name;
    int age;
    int rollNumber;
    static String college;
    static int grade;

    Student(String name, int age, int rollNumber) {
        this.name = name;
        this.age = age;
        this.rollNumber = rollNumber;
    }

    static{
        college ="falna";
        grade = 8;
    }
}
