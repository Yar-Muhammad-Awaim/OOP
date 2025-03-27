public class Classroom {
    private String className;
    private String classCode;
    private Teacher teacher;
    private Student[] students;
    private int studentCount;
    private static final int MAX_STUDENTS = 5;
    
    public Classroom(String className, String classCode, Teacher teacher) {
        this.className = className;
        this.classCode = classCode;
        this.teacher = teacher;
        this.students = new Student[MAX_STUDENTS];
        this.studentCount = 0;
    }
    
    public boolean addStudent(Student student) {
        if (studentCount < MAX_STUDENTS) {
            students[studentCount++] = student;
            return true;
        } else {
            System.out.println("Class is full. Cannot add " + student.getName());
            return false;
        }
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("Class: " + className + " (" + classCode + ")\n");
        sb.append("Teacher: ").append(teacher.toString()).append("\nStudents:\n");
        for (int i = 0; i < studentCount; i++) {
            sb.append(students[i].toString()).append("\n");
        }
        return sb.toString();
    }
}