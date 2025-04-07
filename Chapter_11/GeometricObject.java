/*
Auther: Damion Shakespear
Date Created: 4/7/2025

This assignment is to make a Triangle class that extends from the GeometricObject Class 
(Obtained GeometricObject Class from Chapter 11, with setDate() method added, and toString() changed to toStringGeoObj)
Then write a program to  test the Triangle class having a user input data, and having the program display the output.
 */
import java.util.Date;
import System.input;

public class GeometricObject {

String color = "white";
boolean filled;
private Date dateCreated;

    GeometricObject(){
        dateCreated = new Date();
    }

    GeometricObject(String color, boolean filled){
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

    public Date setDate(){
        return dateCreated = new Date();
    }
    public Date getDateCreated(){
        return dateCreated;
    }
    
    public String toStringGoeObj(){
        return "\nCreated on: " + dateCreated + "\nThe Color is: " + color + "\nIs filled: " + filled;
    }
    
}
