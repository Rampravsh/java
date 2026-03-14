// Inheritance in java 

public class Demo3 {
    public static void main(String[] args) {
        EngineerStudent es = new EngineerStudent();
        es.attendLab();
        es.markAttendance();
    }
}

class Student {
    String name;
    int age;

    void markAttendance() {
        System.out.println("Attendance marked");
    }

}

class EngineerStudent extends Student {
    void attendLab() {
        System.out.println("lab attended");
    }
}