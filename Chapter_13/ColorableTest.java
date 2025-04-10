/*
Auther: Damion Shakespear
Date Created: 4/9/2025

This assignment is to make the Instance (Colorable) and have it be implemented by TriangleAbs. 
Then write a test program that creates an array of five GeometricObjects. For each object in the array, display its area and invoke its howToColor method if it is colorable.
 */
import Triangle;
import GeometricObject;

public class ColorableTest {

    public static void main(String[] args){

    GeometricObject[] BunchesofOats = new GeometricObject[5];

        for (int i = 0; i < BunchesofOats.length; i++){
            BunchesofOats[i] = new Triangle(Math.random() * 9, Math.random() * 9, Math.random() * 9);
        }
        for (int i = 0; i < BunchesofOats.length; i++){
        System.out.printf("\n\nArea is: %s \nHow to Color: %s", BunchesofOats[i].getArea(), ((Colorable)BunchesofOats[i]).howToColor());
        }
    }
}
