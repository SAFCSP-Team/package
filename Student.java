package school;

class Student{
    private int id;
    private int age;
    private float grade;
    private String name;

    public Student(int id, int age, float grade, String name) {
        this.id = id;
        this.age = age;
        this.grade = grade;
        this.name = name;
    }

    public Student setAge(int age) {
        this.age = age;
        return this;
    }

    public Student setGrade(float grade) {
        this.grade = grade;
        return this;
    }

    public Student setName(String name) {
        this.name = name;
        return this;
    }

    public int getId() {
        return this.id;
    }

    public int getAge() {
        return this.age;
    }

    public float getGrade() {
        return this.grade;
    }

    public String getName() {
        return this.name;
    }
}
