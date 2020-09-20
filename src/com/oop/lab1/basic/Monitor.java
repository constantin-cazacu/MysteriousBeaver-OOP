package com.oop.lab1.basic;

public class Monitor {
    private String color = "Grey";
    private int resolution = 720;
    private int diagonal = 20;

    public Monitor(String color, int resolution, int diagonal) {
        this.color = color;
        this.resolution = resolution;
        this.diagonal = diagonal;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setResolution(int resolution) {
        this.resolution = resolution;
    }

    public int getResolution() {
        return resolution;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }

    public int getDiagonal() {
        return diagonal;
    }
}
