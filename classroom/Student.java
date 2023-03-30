package classroom;

public class Student {

    public String name;
    public String age;
    public String letterGrade;

    public void printStudentInfo(){
        System.out.println("This students name is " + this.name + ", he is " + this.age + " years old, and he has a " + this.letterGrade + " in this class.");
    }
}