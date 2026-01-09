package org.javaturk.ioop.ex.ch16.circle;

public class Circle1 {
    public double calculateArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }

    public double calculateCircumference(double radius) {
        return 2 * Math.PI * radius;
    }
}
