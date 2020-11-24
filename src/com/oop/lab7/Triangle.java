package com.oop.lab7;

public class Triangle extends Figure {
    private double firstSide;
    private double secondSide;
    private double thirdSide;

    public Triangle(double first_side, double second_side, double third_side){
        System.out.println("Creating Triangle");
        this.firstSide = first_side;
        this.secondSide = second_side;
        this.thirdSide = third_side;
    }

    public double getArea()
    {
        double trArea = Math.sqrt(getPerimeter()/2 * (getPerimeter()/2 - firstSide) * (getPerimeter()/2 - secondSide) * (getPerimeter()/2 - thirdSide));
        //System.out.println("Area of the Triangle: " + trArea);
        return trArea;
    }

    public double getPerimeter()
    {
        //double trPerimeter = firstSide + secondSide + thirdSide;
        //System.out.println("Perimeter of the Triangle: " + trPerimeter);
        return firstSide + secondSide + thirdSide;
    }

    public String getName()
    {
        return "Triangle is the biggest";
    }
}
