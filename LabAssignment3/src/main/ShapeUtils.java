package main;

public class ShapeUtils {
    public ShapeUtils() {
    }

    public void displayShapes(Shape[] shapes) {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public void increaseRectangleLength(Shape[] shapes, double length) {
        double gotlength;
        for (Shape shape : shapes) {
            if (shape instanceof Rectangle) {
                gotlength = ((Rectangle) shape).getLength();
                if (gotlength < length) {
                    double newLength = gotlength + length;
                    ((Rectangle) shape).setLength(newLength);
                }
            }
        }
    }

    public void drawShapes(Drawable[] drawables) {
        for (Drawable drawable : drawables) {
            drawable.draw();
        }
    }

    public boolean doesIntersect(Rectangle r1, Rectangle r2) {
        Point r1TopLeft = r1.getTopLeftCorner();
        Point r1BottomRight = r1.getBottomRightCorner();
        Point r2TopLeft = r2.getTopLeftCorner();
        Point r2BottomRight = r2.getBottomRightCorner();

        if (r1BottomRight.getX() < r2TopLeft.getX() || r2BottomRight.getX() < r1TopLeft.getX()) {
            return false;
        }

        if (r1TopLeft.getY() < r2BottomRight.getY() || r2TopLeft.getY() < r1BottomRight.getY()) {
            return false;
        }

        return true;
    }
}
