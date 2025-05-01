public class Supervisor extends Person {
    private int yearsOfExperience;

    public Supervisor(String name, int yearsOfExperience) {
        super(name);
        this.yearsOfExperience = yearsOfExperience;
    }

    public int getYearsOfExperience() {
        return yearsOfExperience;
    }

    @Override
    public String toString() {
        return "Name: " + getName() + ", Experience: " + yearsOfExperience + " years";
    }
}