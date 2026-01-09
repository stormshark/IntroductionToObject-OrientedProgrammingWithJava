package org.javaturk.ioop.ex.ch16.circle;

public class Circle1Test {

    public static void main(String[] args) {
        Circle1 c1 = new Circle1();
        double area = c1.calculateArea(10);
        System.out.println(area);
        double circumference = c1.calculateCircumference(20);
        System.out.println(circumference);
    }
}
