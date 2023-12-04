package school.students;
import java.util.List;
import java.util.ArrayList;

public class StudentManagmentSystem{
    private List<Student> students;
    
    public StudentManagmentSystem() {
        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student std){
        this.students.add(std);
    }

    public void remove(Student std){
        this.students.remove(std);
    }

    public double calculateAverageGrade(){
        double sum = 0;
        for (int i = 0; i < this.students.size(); i++){
            sum+= this.students.get(i).getGrade();
        }

        return sum / this.students.size();
    }
}
