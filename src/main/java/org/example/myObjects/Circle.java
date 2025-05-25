package org.example.myObjects;

public class Circle {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return 3.14 * (this.radius * this.radius);
    }

    public double calculateCircumference() {
        return 2 * 3.14 * this.radius;
    }
}
