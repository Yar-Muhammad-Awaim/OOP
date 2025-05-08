package main;

public class Sphere extends Shape3D implements Drawable{
    private double radius;
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public Sphere(String name) {
        super(name);
    }

    @Override
    public String toString() {
        return "Sphere{" +
                "radius=" + radius +
                '}';
    }

    @Override
    public double volume() {
        return (double) 4 /3 * Math.PI * Math.pow(radius, 3);
    }

    @Override
    public double area() {
        return (double) 4 * Math.PI * Math.pow(radius, 2);
    }

    @Override
    public void draw() {
        System.out.println("Draw Method of Sphere.");
    }
}
