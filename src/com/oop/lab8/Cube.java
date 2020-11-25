package com.oop.lab8;

public class Cube implements GeometricBody{
    private double side;

    public Cube(double side) {
        this.side = side;
    }

    public double getSurface(){
        return 6 * side * side;
    }

    public double getVolume() {
        return side * side * side;
    }

    public String getName() {
        return "Cube is the largest";
    }
}

