package org.javaturk.ioop.ex.ch16.circle;

public class Circle3Test {

    public static void main(String[] args) {
        Circle3 c = new Circle3();
        c.radius = 10;
//        double area = c.calculateArea();
//        System.out.println(area);
//        double circumference = c.calculateCircumference();
//        System.out.println(circumference);


        System.out.println(c.getRadius());
        System.out.println(c.getArea());
    }
}
