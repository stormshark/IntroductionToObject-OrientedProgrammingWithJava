package org.javaturk.ioop.ex.ch16.circle;

public class Circle2 {
    double radius;
    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}
