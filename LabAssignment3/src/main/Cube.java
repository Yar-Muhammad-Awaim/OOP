package main;

public class Cube extends Shape3D implements Drawable {
    private double side;

    public Cube(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Cube{" +
                "side=" + side +
                '}';
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double volume() {
        return Math.pow(side, 3);
    }

    @Override
    public double area() {
        return 6 * Math.pow(side, 2);
    }

    @Override
    public void draw() {
        System.out.println("Draw Method of Cube.");
    }
}
