package com.oop.lab8;

public class Parallelepiped implements GeometricBody{
    private double length;
    private double width;
    private double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public double getSurface(){
        return (2 * length * width) + (2 * width * height) + (2 * length * height);
    }

    public double getVolume() {
        return length * width * height;
    }

    public String getName() {
        return "Parallelepiped is the largest";
    }
}
