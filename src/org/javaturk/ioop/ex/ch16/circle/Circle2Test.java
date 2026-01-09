package org.javaturk.ioop.ex.ch16.circle;

public class Circle2Test {

    public static void main(String[] args) {
        Circle2 c1 = new Circle2();
        c1.radius = 10;
        double area = c1.calculateArea();
        System.out.println(area);
        double circumference = c1.calculateCircumference();
        System.out.println(circumference);
    }
}
