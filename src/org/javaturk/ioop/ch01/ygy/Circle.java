package org.javaturk.ioop.ch01.ygy;

public class Circle {
    double radius;
    String color;

    public double calculateArea(double radius) {
        double mathPi= 3.14d;
        return  mathPi*mathPi*radius;
    }

    public double calculatePerimeter(double radius) {
        double mathPi= 3.14d;
        return  2*mathPi*radius;
    }

    public String getCircleInfo() {

      double   calculatedPerimeter=  calculatePerimeter(radius);
      double   calculatedArea=  calculateArea(radius);

      return "Area of circle is:" + calculatedPerimeter +  " Perimeter of circle is:" + calculatedArea +  " Color : " + color;
    }


}
