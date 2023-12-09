// 2. Create `Student` class within the package, with attributes name, id number, age, and grade.
package school;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class StudentManagementSystem{
    private  List<Student> student;
     public StudentManagementSystem(){
         this.student =new ArrayList<Student>();
    }
    public void addStudent(Student student){
        this.student.add(student);

    }

    public void removeStudent(Student studentName){
        this.student.remove(studentName);
    }

    public float calculateAverageGrade(){
        float val = 0;
        for (int i = 0; i < this.student.size(); i++){
            val+= this.student.get(i).getGrade();
        }

        return val / this.student.size();
    }
}   
 