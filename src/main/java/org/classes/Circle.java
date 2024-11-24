package org.classes;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Circle {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        double area = PI * pow(radius, 2);
        System.out.println(area);
        return area;
    }

    public double getCircumference() {
        double circumference = PI * radius * 2;
        System.out.println(circumference);
        return circumference;
    }
}
