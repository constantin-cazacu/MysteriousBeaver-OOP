package com.oop.lab2.basic;

//box: height, width, length

public class box {
    double height = 1.0;
    double width = 1.0;
    double length = 1.0;
    double surfArea = 0.0;
    double volume = 0.0;

    //default constructor
    public box() {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    //constructor w/ distinct values
    public box(double height, double width, double length) {
        this.height = height;
        this.width = width;
        this.length = length;
    }
    //constructor w/ same value
    public box(double height) {
        this.height = height;
        this.width = height;
        this.length = height;
    }

    public double surfaceArea(double height, double width, double length) {
        surfArea = 2 * ((height * width) + (height * length) + (width * length));
        return surfArea;
    }

    public double boxVolume(double height, double width, double length) {
        volume = height * width * length;
        return volume;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getlength() {
        return length;
    }

    public void setlength(double length) {
        this.length = length;
    }
}
