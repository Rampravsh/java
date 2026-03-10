public class demo2 {
    public static void main(String[] args) {
        Student obj1 = new Student("Rishab", 23, 34, "fjksjdf");

        // obj1.studentName="Rampravesh kumar";
        // obj1.age=28;
        // obj1.rollNo=3;
        // obj1.college="rlsy paliganj";

        System.out.println(obj1.studentName);
        System.out.println(obj1.rollNo);
        System.out.println(obj1.age);
        System.out.println(obj1.college);

        // int x=4; // local variable

    }
}

class Student {
    int rollNo; // information/data/characteristics -->instance variables
    String studentName;
    int age;
    String college;

    Student() { // constructor
        rollNo = 93;
        studentName = "Rampravesh kumar";
        age = 20;
        college = "rlsy paliganh";
    }

    Student(String name, int a, int b, String clName) { // constructor
        rollNo = a;
        studentName = name;
        age = b;
        college = clName;
    }

    void markAttendance() {
        System.out.println("Attendance marked by " + studentName);
    }

    void print() {
        System.out.println(studentName + "," + age + "," + college + "," + rollNo);
    }
}
