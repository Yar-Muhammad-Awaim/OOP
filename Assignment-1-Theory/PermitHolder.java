public class PermitHolder extends Person {
    private static int counter = 1000;
    private int permitID;

    public PermitHolder(String name) {
        super(name);
        this.permitID = counter++;
    }

    @Override
    public String toString() {
        return "name: " + getName() + ", permit ID: " + permitID;
    }
}
