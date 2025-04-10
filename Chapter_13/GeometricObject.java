/*
Auther: Damion Shakespear
Date Created: 4/9/2025

This assignment is Like the one from Chapter_11, however GeometricObject is an Abstract Class-
Make a Triangle class that extends from the GeometricObject Class (Abstract)
(Obtained GeometricObject Class from Chapter 13, with toString() changed to toStringGeoObj)
Then write a program to test the Triangle class having a user input data, and having the program display the output.
 */
import java.util.Date;
import System.input;

public abstract class GeometricObject {

String color = "white";
boolean filled;
Date dateCreated;

    protected GeometricObject(){
        dateCreated = new Date();
    }

    protected GeometricObject(String color, boolean filled){
        dateCreated = new Date();
        this.color = color;
        this.filled = filled;
    }

    public String getColor(){
        return color;
    }
    public void setColor(String color){
        this.color = color;
    }
    public boolean isFilled(){
        return filled;
    }
    public void setFilled(boolean filled){
        this.filled = filled;
    }

    public Date getDateCreated(){
        return dateCreated;
    }

    public abstract double getArea();

    public abstract double getPerimeter();

    public abstract String howToColor();

    public String toStringGoeObj(){
        return "\nCreated on: " + dateCreated + "\nThe Color is: " + color + "\nIs filled: " + filled + "\nThe Area is: " + getArea() + "\nThe Perimeter is: " + getPerimeter();
    }
}
