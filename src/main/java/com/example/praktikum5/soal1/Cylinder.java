package com.example.praktikum5.soal1;

public class Cylinder extends Shape{
    private final double radius;
    private final double height;
    public Cylinder(double radius, double height) {
        super("Cylinder");
        this.radius=radius;
        this.height=height;
    }

    //-----------------------------------------
// Returns the surface area of the Cylinder.
//-----------------------------------------
    public double area() {
        return Math.PI*(radius*radius)*height;
    }

    //-----------------------------------
// Returns the Cylinder as a String.
//-----------------------------------
    public String toString() {
        return super.toString() + " of radius " + radius + " and Height " + height;
    }
}
