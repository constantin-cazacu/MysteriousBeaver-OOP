package com.oop.lab7;

public class Square extends Figure {
    private double sideLength;

    public Square(double sideLength){
        System.out.println("Creating Square");
        this.sideLength = sideLength;
    }

    public double getArea()
    {
        System.out.println("Area of the Square: " + sideLength * sideLength);
        return sideLength * sideLength;
    }

    public double getPerimeter()
    {
        System.out.println("Perimeter of the Square: " + 4 * sideLength);
        return 4 * sideLength;
    }

    public String getName()
    {
        return "Square is the biggest";
    }
}
