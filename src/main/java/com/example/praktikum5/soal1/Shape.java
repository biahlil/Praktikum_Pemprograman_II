package com.example.praktikum5.soal1;


abstract class Shape {
//  Abstract Class
    protected String shapeName;

    public Shape(String shapeName) {
    this.shapeName = shapeName;
    }

    protected double area(){
        return 0;
    }
    public String toString() {
        return shapeName;
    }
}

