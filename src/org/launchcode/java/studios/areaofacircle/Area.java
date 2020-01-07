package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args)
    {
        int radius;
        double pi = 3.14;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter radius of circle:");
        radius = s.nextInt();
        double area = Circle.getArea(radius);
        System.out.println("Area of a circle: "+ area);
    }

}
