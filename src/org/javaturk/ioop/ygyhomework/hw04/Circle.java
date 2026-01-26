package org.javaturk.ioop.ygyhomework.hw04;

public class Circle {
    double radius;
    String color;

    Circle() {
        radius= 10;
        color="no color assigned";
    }

    Circle(double newRadius, String newColor) {
        radius= newRadius;
        color = newColor;
    }

    Circle(double newRadius) {
        radius= newRadius;
        color = "no color assigned";
    }

    public double calculateArea(double radius) {
        double mathPi= 3.14d;
        return  mathPi*mathPi*radius;
    }

    public double calculatePerimeter(double radius) {
        double mathPi= 3.14d;
        return  2*mathPi*radius;
    }

    void getCircleInfo() {

      double   calculatedPerimeter=  calculatePerimeter(radius);
      double   calculatedArea=  calculateArea(radius);

      IO.println( "Area of circle is:" + calculatedPerimeter +  ", Perimeter of circle is:" + calculatedArea +  ", Color : " + color);
    }


}
