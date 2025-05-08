package main;

import org.w3c.dom.css.Rect;

import java.awt.*;

public class Main {
    public static void main(String[] args) {
        Shape shape;
        Shape3D shape3D;
        Circle circle = new Circle("Circle");
        circle.setRadius(3.4);
        System.out.println("Area of circle: " + circle.area());

        Rectangle rectangle = new Rectangle("Rectangle" );
        rectangle.setLength(4);
        rectangle.setWidth(5);
        rectangle.setTopLeftCorner(new Point(0,0));
        System.out.println("Area of rectangle: " + rectangle.area());

        Sphere sphere = new Sphere("Sphere");
        sphere.setRadius(5);
        System.out.println("Area of sphere: " + sphere.area());
        System.out.println("Volume of sphere: " + sphere.volume());

        Cube cube = new Cube("Cube");
        cube.setSide(7);
        System.out.println("Area of cube: " + cube.area());
        System.out.println("Volume of cube: " + cube.volume());

        Shape[] shapes = new Shape[20];
        shapes[0] = circle;
        shapes[1] = rectangle;
        shapes[2] = sphere;
        shapes[3] = cube;
        shapes[4] = sphere;
        shapes[5] = cube;
        shapes[6] = circle;
        shapes[7] = cube;
        shapes[8] = sphere;
        shapes[9] = rectangle;
        shapes[10] = cube;
        shapes[11] = rectangle;
        shapes[12] = cube;
        shapes[13] = circle;
        shapes[14] = cube;
        shapes[15] = rectangle;
        shapes[16] = cube;
        shapes[17] = rectangle;
        shapes[18] = cube;
        shapes[19] = circle;

        ShapeUtils shapeUtils = new ShapeUtils();
        shapeUtils.displayShapes(shapes);
        shapeUtils.increaseRectangleLength(shapes, 5);
        System.out.println("After increaseRectangleLength");
        shapeUtils.displayShapes(shapes);

        shapeUtils.drawShapes(shapes);

        Rectangle r1 = new Rectangle("Rectangle");
        r1.setLength(5);
        r1.setWidth(6);
        r1.setTopLeftCorner(new Point(0,0));

        Rectangle r2 = new Rectangle("Rectangle");
        r2.setLength(5);
        r2.setWidth(6);
        r2.setTopLeftCorner(new Point(0,0));

        if(shapeUtils.doesIntersect(r1, r2)) {
            System.out.println("Intersect");
        }
        else {
            System.out.println("Not intersect");
        }

        r2.setTopLeftCorner(new Point(20,20));

        if(shapeUtils.doesIntersect(r1, r2)) {
            System.out.println("Intersect");
        }
        else {
            System.out.println("Not intersect");
        }
    }
}
