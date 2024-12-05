package oop1.ex;

public class RectangleProceduralMain {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5, 8);
        int area = rectangle.calculateArea();
        System.out.println("Area: " + area);
        int perimeter = rectangle.calculatePerimeter();
        System.out.println("Perimeter: " + perimeter);
        boolean square = rectangle.isSquare();
        System.out.println("Square: " + square);
    }
}
