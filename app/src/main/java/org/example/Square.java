package org.example;

public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public int numberOfSides() {
        return 4;
    }
}
