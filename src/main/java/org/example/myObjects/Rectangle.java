package org.example.myObjects;

public class Rectangle {
    private int width;
    private int height;

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getWidth() {return this.width;}
    public int getHeight() {return this.height;}

    public void setWidth(int width) {this.width = width;}

    public int calculateArea() {
        return width * height;
    }
}
