package be.intecbrussel;

public class Shapes {
    public static void main(String[] args) {

        // maak voor de classen rectangle en circle eigen methodes om de oppervlakte te berekenen.
        // Tot slot maak je objecten aan van deze klassen en gebruik je de methodes om van die objecten de oppervlakte te berekenen.


        Rectangle rectangle = new Rectangle();

        Rectangle rectangle1 = new Rectangle(); //1parameter

        Rectangle rectangle2 = new Rectangle(9, 5);  //alle parameter

        Circle circle = new Circle();


        System.out.println(rectangle.area());
        System.out.println(circle.area());


    }
}
