package classroom;

public class AboutStudents {

    public static void main(String[] args) {
        Student student1 = new Student();
        student1.name = "Angel";
        student1.age = "18";
        student1.letterGrade = "B";
        student1.printStudentInfo();

        Student student2 = new Student();
        student2.name = "Jerry";
        student2.age = "24";
        student2.letterGrade = "C";
        student2.printStudentInfo();
    }
}