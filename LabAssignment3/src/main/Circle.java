package main;

public class Circle extends Shape2D implements Drawable{
    public double radius;

    public Point center = new Point(0,0);

    public Circle(String name) {
        super(name);

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Draw Method of Circle.");
    }
}
