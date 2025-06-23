package org.example;

public class App {
    public static void main(String[] args) {
        // Circle
        Shape circle = new Circle(2);
        System.out.println("=== Circle ===");
        System.out.println("Area: " + circle.getArea());
        System.out.println("Perimeter: " + circle.getPerimeter());

        // Rectangle
        Shape rect = new Rectangle(5, 3);
        System.out.println("\n=== Rectangle ===");
        System.out.println("Area: " + rect.getArea());
        System.out.println("Perimeter: " + rect.getPerimeter());

        // Right Triangle
        Shape tri = new RightTriangle(3, 4);
        System.out.println("\n=== Right Triangle ===");
        System.out.println("Area: " + tri.getArea());
        System.out.println("Perimeter: " + tri.getPerimeter());

        // Square
        Shape square = new Square(4);
        System.out.println("\n=== Square ===");
        System.out.println("Area: " + square.getArea());
        System.out.println("Perimeter: " + square.getPerimeter());

        // Isosceles Right Triangle
        Shape isoTri = new IsoscelesRightTriangle(5);
        System.out.println("\n=== Isosceles Right Triangle ===");
        System.out.println("Area: " + isoTri.getArea());
        System.out.println("Perimeter: " + isoTri.getPerimeter());

        Polygon p = new Square(6);
        System.out.println("\nSquare Sides: " + p.numberOfSides());

    }
}
