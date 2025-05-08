package main;

public abstract class Shape2D extends Shape implements Drawable{
    public boolean isFilled;
    public Shape2D(String name) {
        super(name);
    }
}
