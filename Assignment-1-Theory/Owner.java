public class Owner extends Person {
    private static int counter = 1;
    private String ownerId;

    public Owner(String name) {
        super(name);
        this.ownerId = String.format("O%03d", counter++);
    }

    public String getOwnerId() {
        return ownerId;
    }

    @Override
    public String toString() {
        return "name: " + getName() + ", owner ID: " + ownerId;
    }
}

