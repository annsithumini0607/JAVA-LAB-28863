package com.mycompany.main;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter Rectangle name: ");
        String recName = sc.nextLine();
        
        System.out.println("Enter Rectangle Length: ");
        double recLen = sc.nextDouble();
        
        System.out.println("Enter Rectangle width: ");
        double recWd = sc.nextDouble();
        
        Rectangle rec = new Rectangle(recName, recLen, recWd);
        
        System.out.println("Enter Circle Name: ");
        String clName = sc.nextLine();
        
        System.out.println("Enter radious Circle: ");
        double clRad = sc.nextDouble();
        
        Circle cl=new Circle(clName, clRad);
        
        System.out.println("Area of Rectangle: "+rec.calculateArea());
        System.out.println("Area of Circle : "+cl.calculateArea());
    }
}