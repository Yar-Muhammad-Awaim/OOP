package main;

public abstract class Shape implements Drawable {
    private final String name;
    public Shape(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "name='" + name + '\'' +
                '}';
    }

    public abstract double area();
}
