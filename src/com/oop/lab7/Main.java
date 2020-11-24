package com.oop.lab7;

public class Main {
    public static void main(String[] args) {
        Square square = new Square(5);
        Rectangle rectangle = new Rectangle(3,2);
        Triangle triangle = new Triangle(10,5,6);
        Figure[] objects = new Figure[3];
        objects[0] = square;
        objects[1] = rectangle;
        objects[2] = triangle;

        FigureController biggestFigure = new FigureController();
        System.out.println(biggestFigure.maxAreaFigure(objects).getName());
        System.out.println(biggestFigure.maxPerimeterFigure(objects).getName());


       /* class Circle {
            double radius;
            public void createClass() {
                Figure circle = new Figure() {
                    @Override
                    public double getArea() {
                        System.out.println("Area of the Circle");
                        System.out.println(Math.PI * radius * radius);
                        return Math.PI * radius * radius;
                    }

                    @Override
                    public double getPerimeter() {
                        System.out.println("Perimeter of the Circle");
                        System.out.println(2 * Math.PI * radius);
                        return 2 * Math.PI * radius;
                    }

                    @Override
                    public String getName() {
                        return "Circle is the biggest";
                    }
                };
            }
        }
        System.out.println(circle.getArea());*/
    }
}
