public class Student extends Person {
    private String rollNumber;
    
    public Student(String name, int age, String rollNumber) {
        super(name, age);
        this.rollNumber = rollNumber;
    }
    
    public String getRollNumber() {
        return rollNumber;
    }
    
    public boolean equals(Student other) {
        return this.rollNumber.equals(other.rollNumber);
    }
    
    public String toString() {
        return super.toString() + ", Roll No: " + rollNumber;
    }
}