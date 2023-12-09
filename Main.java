public class Main {
    public static void main(String[] args) {
        StudentManagementSystem sms = new StudentManagementSystem();
        /* Adding students */
        Student firstStudent = new Student("Khaled", 1, 20, 85.5);
        sms.addStudent(firstStudent);

        Student secondStudent = new Student("Rema", 2, 21, 92.3);
        sms.addStudent(secondStudent);

        Student thirdStudent = new Student("Noura", 3, 19, 78.9);
        sms.addStudent(thirdStudent);
         }
}
