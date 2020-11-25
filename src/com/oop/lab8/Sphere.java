package com.oop.lab8;

public class Sphere implements GeometricBody{
    private double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    public double getSurface(){
        return 4 * Math.PI * radius * radius;
    }

    public double getVolume() {
        return (4 / 3) * Math.PI * radius * radius * radius;
    }

    public String getName() {
        return "Sphere is the largest";
    }
}
