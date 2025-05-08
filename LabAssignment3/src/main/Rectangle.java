package main;

public class Rectangle extends Shape implements Drawable {
    private double length;
    private double width;

    public void setTopLeftCorner(Point topLeftCorner) {
        this.topLeftCorner = topLeftCorner;
    }

    private Point topLeftCorner;

    public Rectangle(String name) {
        super(name);
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public Point getTopLeftCorner() {
        return topLeftCorner;
    }

    public Point getBottomRightCorner() {
        return new Point(topLeftCorner.getX() + (int) length, topLeftCorner.getY() - (int) width);
    }

    @Override
    public void draw() {
        System.out.println("Drawing rectangle at " + topLeftCorner.getX() + "," + topLeftCorner.getY());
    }

    @Override
    public String toString() {
        return "Rectangle[length=" + length + ", width=" + width + ", topLeft=" + topLeftCorner.getX() + "," + topLeftCorner.getY() + "]";
    }

    @Override
    public double area() {
        return width * length;
    }
}
