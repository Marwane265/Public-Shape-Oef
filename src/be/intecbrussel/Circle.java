package be.intecbrussel;

import java.util.Scanner;

public class Circle {


    // maak voor de classen de toString() aan.
    // maak voor de classen rectangle en circle eigen methodes om de oppervlakte te berekenen.
    // Tot slot maak je objecten aan van deze klassen en gebruik je de methodes om van die objecten de oppervlakte te berekenen.


    private double radius;

    //getters and setters


    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    //constructor

    public Circle() {

    }


    public Circle(double radius) {
        this.radius = radius;
    }


    public double area() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, enter a radius and i will give you the area.");
        this.radius = scanner.nextDouble();
        return (radius * radius) * Math.PI;


    }



}
