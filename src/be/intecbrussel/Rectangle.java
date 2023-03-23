package be.intecbrussel;

import java.util.Scanner;

public class Rectangle {


    // maak voor de classen rectangle en circle eigen methodes om de oppervlakte te berekenen.
    // Tot slot maak je objecten aan van deze klassen en gebruik je de methodes om van die objecten de oppervlakte te berekenen.

    //properties
    private double width;
    private double length;


    //constructor

    public Rectangle() {

    }

    public Rectangle(String width) {
        this.width = getWidth();
        System.out.println("only width");
    }

    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
        System.out.println("All-args constructor");
    }


    //getters and setters

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }


    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    //Eigen methodes

    public double area() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Hello, enter a width and a length and i will give you the area");
        this.width = scanner.nextDouble();
        this.length = scanner.nextDouble();
        return length * width;


    }


    @Override
    public String toString() {
        return "Rectangle { Width: " + width + " Length: " + length + "}";

    }


}
