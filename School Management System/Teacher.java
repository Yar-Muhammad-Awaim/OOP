public class Teacher extends Person {
    private String subject;
    private String teacherId;
    
    public Teacher(String name, int age, String subject, String teacherId) {
        super(name, age);
        this.subject = subject;
        this.teacherId = teacherId;
    }
    
    public String getSubject() {
        return subject;
    }
    
    public String getTeacherId() {
        return teacherId;
    }
    
    public boolean equals(Teacher other) {
        return this.teacherId.equals(other.teacherId);
    }
    
    public String toString() {
        return super.toString() + ", Subject: " + subject + ", ID: " + teacherId;
    }
}