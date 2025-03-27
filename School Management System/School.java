public class School {
    private String name;
    private String address;
    private Principal principal;
    private Classroom[] classrooms;
    private int classCount;
    private static final int MAX_CLASSES = 10;
    
    public School(String name, String address, Principal principal) {
        this.name = name;
        this.address = address;
        this.principal = principal;
        this.classrooms = new Classroom[MAX_CLASSES];
        this.classCount = 0;
    }
    
    public boolean addClassroom(Classroom classroom) {
        if (classCount < MAX_CLASSES) {
            classrooms[classCount++] = classroom;
            return true;
        }
        return false;
    }
    
    public String toString() {
        StringBuilder sb = new StringBuilder("School: " + name + "\nAddress: " + address + "\nPrincipal: " + principal.toString() + "\n\nClasses:\n");
        for (int i = 0; i < classCount; i++) {
            sb.append(classrooms[i].toString()).append("\n");
        }
        return sb.toString();
    }
}