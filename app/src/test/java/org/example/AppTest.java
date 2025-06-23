package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  // You can write your unit tests here.
  @Test
  void appWorks() {
    assertEquals(true, true);
  }
  @Test
  void testSquare() {
    Square s = new Square(4);
    assertEquals(16, s.getArea());
    assertEquals(16, s.getPerimeter());
  }

  @Test
  void testIsoscelesRightTriangle() {
    IsoscelesRightTriangle t = new IsoscelesRightTriangle(5);
    assertEquals(0.5 * 5 * 5, t.getArea());
    assertEquals(5 + 5 + Math.sqrt(5 * 5 + 5 * 5), t.getPerimeter(), 0.001);
  }

  @Test
  void testCircle() {
    Circle c = new Circle(2);
    assertEquals(Math.PI * 4, c.getArea(), 0.001);
    assertEquals(2 * Math.PI * 2, c.getPerimeter(), 0.001);
  }

  @Test
  void testRectangle() {
    Rectangle r = new Rectangle(5, 3);
    assertEquals(15, r.getArea());
    assertEquals(16, r.getPerimeter());
  }

  @Test
  void testRightTriangle() {
    RightTriangle t = new RightTriangle(3, 4);
    assertEquals(6, t.getArea());
    assertEquals(3 + 4 + 5, t.getPerimeter(), 0.001);  // hypotenuse = 5
  }

  @Test
  void testNumberOfSides() {
    Polygon r = new Rectangle(5, 3);
    Polygon s = new Square(4);
    Polygon t = new RightTriangle(3, 4);
    Polygon iso = new IsoscelesRightTriangle(5);

    assertEquals(4, r.numberOfSides());
    assertEquals(4, s.numberOfSides());
    assertEquals(3, t.numberOfSides());
    assertEquals(3, iso.numberOfSides());
  }
}
