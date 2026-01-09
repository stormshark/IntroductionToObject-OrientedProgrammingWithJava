package org.javaturk.ioop.ex.ch16.circle;

public class Circle3 {
    double radius;
    double area;
    double circumference;
    boolean areaCalculated;
    boolean circumferenceCalculated;
    public double calculateArea() {
        if(areaCalculated)
            return area;
        else {
            area = Math.PI * Math.pow(radius, 2);
            areaCalculated = true;
            return area;
        }
    }

    public double calculateCircumference() {
        if(circumferenceCalculated)
            return circumference;
        else {
            circumference = 2 * Math.PI * radius;
            circumferenceCalculated = true;
            return circumference;
        }
    }

    public double getRadius() {
        return radius;
    }

    public double getArea() {
        if(areaCalculated)
            return area;
         return calculateArea();
    }

    public double getCircumference() {
        if(circumferenceCalculated)
            return circumference;
        else return calculateCircumference();
    }
}
