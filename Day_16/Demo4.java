/* Types of inheritance
Simple inheritance
multi-level inheritance
hierarchial inheritace
multiple inheritance */

public class Demo4 {
    public static void main(String[] args) {
        CSEEngineerStudent cse = new CSEEngineerStudent();
        cse.markAttendance();
        cse.attendLab();
        cse.attendWorkshop();

        medicalStudent med = new medicalStudent();
        med.markAttendance();
        med.attendPractical();
    }

}

class Student { // parent
    String name;
    int age;

    void markAttendance() {
        System.out.println("Attendance marked");
    }

}

class EngineerStudent extends Student { // child
    void attendLab() {
        System.out.println("lab attended");
    }
}

class medicalStudent extends Student { // child
    void attendPractical() {
        System.out.println("Practical attended");
    }
}

class CSEEngineerStudent extends EngineerStudent { // grandchild
    void attendWorkshop() {
        System.out.println("Workshop attended");
    }
}