package oops.java;

public abstract class Shape_5 {
    // Abstract method to be implemented by subclasses
    public abstract void draw();
}

class Line extends Shape_5 {
    @Override
    public void draw() {
        System.out.println("Drawing a Line");
    }
}

class Rectangle extends Shape_5 {
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

class Cube extends Shape_5 {
    @Override
    public void draw() {
        System.out.println("Drawing a Cube");
    }
}

