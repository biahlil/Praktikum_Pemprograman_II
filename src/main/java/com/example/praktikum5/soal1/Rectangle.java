package com.example.praktikum5.soal1;

public class Rectangle extends Shape{
    private final double length;
    private final double width;
    public Rectangle(double length, double width) {
        super("Rectangle");
        this.length = length;
        this.width = width;
    }

    //-----------------------------------------
// Returns the surface area of the Rectangle.
//-----------------------------------------
    public double area() {
        return length*width;
    }

    //-----------------------------------
// Returns the Rectangle as a String.
//-----------------------------------
    public String toString() {
        return super.toString() + " of Length " + length + " and Width " + width;
    }
}
