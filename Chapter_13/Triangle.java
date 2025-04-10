/*
Auther: Damion Shakespear
Date Created: 4/9/2025

This assignment is Like the one from Chapter_11, however GeometricObject is an Abstract Class-
Make a Triangle class that extends from the GeometricObject Class (Abstract)
(Obtained GeometricObject Class from Chapter 13, with toString() changed to toStringGeoObj)
Then write a program to test the Triangle class having a user input data, and having the program display the output.

This also implements the Instance Colorable.
 */
public class Triangle extends GeometricObject implements Colorable {

    private double side1 = 1;
    private double side2 = 1;
    private double side3 = 1;

    Triangle(){}

    Triangle(double side1, double side2, double side3){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    Triangle(double side1, double side2, double side3, String color, boolean filled){
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
        setColor(color);
        setFilled(filled);
    }

    public double getSide1(){
        return side1;
    }
    public double getSide2(){
        return side2;
    }
    public double getSide3(){
        return  side3;
    }

    public String toString(){
        return "\nThe area comes to: " + getArea() + "\nThe Perimeter is: " + getPerimeter() + toStringGoeObj();
    }
//Here is for the Abstract GeometricObject
    @Override
    public double getArea(){
        double s = getPerimeter() / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }
    @Override
    public double getPerimeter(){
        return side1 + side2 + side3;
    }
//Here is Colorable Implementation
    @Override
    public String howToColor(){
        return "Color all three sides";
    }
}