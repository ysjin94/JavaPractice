package oop1.ex;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    int calculateArea() {
        return this.width * this.height;
    }

    int calculatePerimeter() {
        return 2 * (this.width + this.height);
    }

    boolean isSquare() {
        return this.width == this.height;
    }

}
