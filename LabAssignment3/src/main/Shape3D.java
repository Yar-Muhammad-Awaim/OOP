package main;

public abstract class Shape3D extends Shape implements Drawable{
    public Shape3D(String name) {
        super(name);
    }

    public abstract double volume();

}
