package com.mycompany.main;

abstract class Shape {
    protected String name;
    protected double length;
    protected double width;
    
    public Shape(String na, double len, double wd) {
        this.name = na;
        this.length = len;
        this.width = wd;
    }
    public abstract double calculateArea();
    
    public void display() {
        System.out.println("Shape's Name : "+name);
        System.out.println("Shape's Length : "+length);
        System.out.println("Shape's Width : "+width);
    }
}
