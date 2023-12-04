package school.students;
//  name, id number, age, and grade./Student("Rema", 2, 21, 92.3)
public class Student {
   private int id;
   private String name;
   private int age;
   private double grade;

   public Student (String name, int id, int age, double grade){
    this.name = name;
    this.id = id;
    this.age = age;
    this.grade = grade;
   }
   public void setId(int id){
    this.id = id;
   }
   
   public int getId(){
    return this.id;
   }

   public void setName(String name){
    this.name = name;
   }

   public String getName(){
    return this.name;
   }

   public void setAge(int age){
    this.age = age;
   }

   public int getAge(){
    return this.age;
   }

   public void setGrade(double grade){
    this.grade = grade;
   }

   public double getGrade(){
    return this.grade;
   }

}
