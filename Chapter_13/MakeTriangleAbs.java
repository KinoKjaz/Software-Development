/*
Auther: Damion Shakespear
Date Created: 4/9/2025

This assignment is Like the one from Chapter_11, however GeometricObject is an Abstract Class-
Make a Triangle class that extends from the GeometricObject Class (Abstract)
(Obtained GeometricObject Class from Chapter 13, with toString() changed to toStringGeoObj)
Then write a program to test the Triangle class having a user input data, and having the program display the output.
 */
import java.util.Scanner;
import Triangle;
import GeometricObject;

public class MakeTriangleAbs {

    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

        System.out.printf("\nPlaese enter a length for side 1: ");
        double side1 = input.nextDouble();
        System.out.printf("\nPlease enter a length for side 2: ");
        double side2 = input.nextDouble();
        System.out.printf("\nPlease enter a length for side 3: ");
        double side3 = input.nextDouble();
        input.nextLine();

        System.out.printf("\nType out what color you want the Triangle to be: ");
        String color = input.nextLine();
        System.out.printf("\nDo you want the triangle to be filled? Enter 'True' for yes and 'False' for no: ");
        boolean filled = input.nextBoolean();

        GeometricObject MadeTriangle = new Triangle(side1, side2, side3, color, filled);

        System.out.printf(MadeTriangle.toStringGoeObj());
    }
}