package com.oop.lab7;

public class FigureController {
    public Figure maxAreaFigure(Figure[] objects) {
        Figure max = null;
        for (Figure figure : objects) {
            if (max == null) {
                max = figure;
            } else if (figure.getArea() > max.getArea()) {
                max = figure;
            }
        }
        return max;
    }

    public Figure maxPerimeterFigure(Figure[] objects) {
        Figure max = null;
        for (Figure figure : objects) {
            if (max == null) {
                max = figure;
            } else if (figure.getPerimeter() > max.getPerimeter()) {
                max = figure;
            }
        }
        return max;
    }
}
