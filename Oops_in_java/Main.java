class Student {
    int rollNo;
    String studentName;
    int age;
    String college;

    void markAttendance() {
        System.out.println("Attendance marked by " + studentName);
    }

    void print() {
        System.out.println(studentName + "," + age + "," + college + "," + rollNo);
    }
}

public class Main {
    public static void main(String[] args) {
        Student obj1 = new Student();
        obj1.rollNo = 1;
        obj1.studentName = "rampravesh";
        obj1.markAttendance();
        obj1.print();

        Student obj2 = new Student();
        obj2.rollNo = 5;

    }
}