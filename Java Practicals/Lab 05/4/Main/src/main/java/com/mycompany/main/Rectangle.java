package com.mycompany.main;

public class Rectangle extends Shape {

    public Rectangle(String na, double len, double wd) {
        super(na, len, wd);
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
}
