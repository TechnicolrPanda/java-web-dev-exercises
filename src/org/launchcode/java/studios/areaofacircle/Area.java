package org.launchcode.java.studios.areaofacircle;

import java.util.Scanner;

public class Area {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("What is the radius of your circle?");
        Double radius = input.nextDouble();
        input.close();

        Double area = Circle.getArea(radius) * 1000;
        area = Math.floor(area)/1000;

        System.out.println("The area of a circle of radius " + radius +" is: " + area);
    }
}
