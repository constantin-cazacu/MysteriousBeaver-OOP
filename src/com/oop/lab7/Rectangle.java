package com.oop.lab7;

public class Rectangle extends Figure {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        System.out.println("Creating Rectangle");
        this.length = length;
        this.width = width;
    }

    public double getArea() {
        System.out.println("Area of the Rectangle: " + width * length);
        return width * length;
    }

    public double getPerimeter() {
        System.out.println("Perimeter of the Rectangle: " + 2 * (width * length));
        return 2 * (width * length);
    }

    public String getName() {
        return "Rectangle is the biggest";
    }
}
