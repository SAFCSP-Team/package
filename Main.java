import school.students.Student;
import school.students.StudentManagmentSystem;
public class Main {

    public static void main(String[] args) {
        StudentManagmentSystem sms = new StudentManagmentSystem();
        /* Adding students */
        Student student1 = new Student("Khaled", 1, 20, 85.5);
        sms.addStudent(student1);

        Student student2 = new Student("Rema", 2, 21, 92.3);
        sms.addStudent(student2);

        Student student3 = new Student("Noura", 3, 19, 78.9);
        sms.addStudent(student3);
         }
}
