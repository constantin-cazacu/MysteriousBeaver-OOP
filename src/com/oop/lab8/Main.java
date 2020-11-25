package com.oop.lab8;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Cube cube = new Cube(7);
        Parallelepiped parallelepiped = new Parallelepiped(5, 4.5, 6.3);
        Sphere sphere = new Sphere(7.7);
        ArrayList<GeometricBody> GeoBodies = new ArrayList<>();
        GeoBodies.add(0, cube);
        GeoBodies.add(1, parallelepiped);
        GeoBodies.add(2, sphere);

        GeometricBodyController largestBody = new GeometricBodyController();
        System.out.println("Largest by surface: " + largestBody.maxSurface(GeoBodies).getName());
        System.out.println("Largest by volume: " + largestBody.maxVolume(GeoBodies).getName());
    }
}
