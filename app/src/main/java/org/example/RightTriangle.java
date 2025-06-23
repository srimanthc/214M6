package org.example;

public class RightTriangle extends Shape implements Polygon {
    protected double base;
    protected double height;

    public RightTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public double getPerimeter() {
        return base + height + Math.sqrt(base * base + height * height);
    }

    @Override
    public int numberOfSides() {
        return 3;
    }
}
