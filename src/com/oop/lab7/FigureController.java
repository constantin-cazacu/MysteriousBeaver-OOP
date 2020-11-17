package com.oop.lab7;

public class FigureController {
    public Figure biggestAreaFigure(Figure objects[]) {
        int n;
        int i;
        int biggestIndex = 0;
        double biggestArea = 0;
        n = objects.length;
        for (i = 0; i < n; i++) {
            if (objects[i].getArea() > biggestArea) {
                biggestArea = objects[i].getArea();
                biggestIndex = i;
            }
        }
        return objects[biggestIndex];
    }

    public Figure biggestPerimeterFigure(Figure objects[]) {
        int n;
        int i;
        int biggestIndex = 0;
        double biggestPerimeter = 0;
        n = objects.length;
        for (i = 0; i < n; i++) {
            if (objects[i].getPerimeter() > biggestPerimeter) {
                biggestPerimeter = objects[i].getPerimeter();
                biggestIndex = i;
            }
        }
        return objects[biggestIndex];
    }
}
