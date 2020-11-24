package com.oop.lab7;

public class Main {
    public static void main(String[] args) {
        Figure circle = new Figure() {
            double radius = 7.7;
            @Override
            public double getArea() {
                double cArea = Math.PI * radius * radius;
                //System.out.println("Area of the Circle: ");
                return cArea;
            }

            @Override
            public double getPerimeter() {
                double cPerimeter = 2 * Math.PI * radius;
               // System.out.println("Perimeter of the Circle: ");
                return  cPerimeter;
            }

            @Override
            public String getName() {
                return "Circle is the biggest";
            }
        };

        System.out.println("Area of the Circle: " + circle.getArea());
        System.out.println("Perimeter of the Circle: " + circle.getPerimeter());

        Square square = new Square(7);
        Rectangle rectangle = new Rectangle(3,4);
        Triangle triangle = new Triangle(10,5,7);
        Figure[] objects = new Figure[4];
        objects[0] = square;
        objects[1] = rectangle;
        objects[2] = triangle;
        objects[3] = circle;

        FigureController biggestFigure = new FigureController();
        System.out.println("By area: " + biggestFigure.maxAreaFigure(objects).getName());
        System.out.println("By perimeter: " + biggestFigure.maxPerimeterFigure(objects).getName());

    }
}
