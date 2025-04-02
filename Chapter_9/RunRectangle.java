/*
Auther: Damion Shakespear
Date Creaated: 4/1/2025

This assignment is for a Rectangle class, to get the Area and Perimeter from the given width and hight.
 */
import Rectangle;

public class RunRectangle {

    public static void main(String[] args) {

        Rectangle RectangleResize = new Rectangle(4, 40);
            System.out.printf("Here is a Rectangle with a Hight of %s, and a Width of %s \nThe Area of this Rectangle comes to: %s \nThe Perimeter comes to: %s", RectangleResize.hight, RectangleResize.width , RectangleResize.GetArea(), RectangleResize.GetPerimeter());

            System.out.println();

        Rectangle RectangleRedone = new Rectangle(3.5, 35.9);
            System.out.printf("\nHere is a Rectangle with a Hight of %s, and a Width of %s \nThe Area of this Rectangle comes to: %s \nThe Perimeter comes to: %s", RectangleRedone.hight, RectangleRedone.width , RectangleRedone.GetArea(), RectangleRedone.GetPerimeter());

    }
    
}
