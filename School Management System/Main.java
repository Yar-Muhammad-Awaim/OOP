public class Main {
    public static void main(String[] args) {
        School school = new School("Green Valley High", "123 Main St", new Principal("Dr. Smith", 50, 20));
        
        Teacher teacher1 = new Teacher("Mr. John", 35, "Math", "T001");
        Classroom class1 = new Classroom("Grade 10", "G10", teacher1);
        
        class1.addStudent(new Student("Alice", 15, "S101"));
        class1.addStudent(new Student("Bob", 16, "S102"));
        
        school.addClassroom(class1);
        
        System.out.println(school);
    }
}