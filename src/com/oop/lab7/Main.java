package com.oop.lab7;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(3,2);
        Triangle triangle = new Triangle(10,5,6);
        Figure objects[] = new Figure[3];
        objects[0] = square;
        objects[1] = rectangle;
        objects[2] = triangle;

        FigureController figures = new FigureController();
        System.out.println(figures.biggestAreaFigure(objects).getName());
        System.out.println(figures.biggestPerimeterFigure(objects).getName());


    }
}
