/*
Auther: Damion Shakespear
Date Created: 4/9/2025

This assignment is to create an Octagon Class that extends GeometricObject
Then write a test program that creates an Octagon object. Clone the first octagon into a second, then use the .compareTo method to compare the two objects.
 */
public class Octagon extends GeometricObject implements Cloneable, Comparable<Octagon> {

    double side;
    private double area;

    Octagon(){}

    Octagon(double side){
        this.side = side;
        getArea();
    }

    //@Override
    public double getArea(){
        return area = (2 * side * side) * (1 + Math.sqrt(2));
    }

    @Override
    public Object clone(){
        try {
            return super.clone();
        }
        catch (CloneNotSupportedException ex){
            return null;
        }
    }
    @Override
    public int compareTo(Octagon o){

        if (area > o.area){
            return 1;
        }
        else if (area < o.area){
            return -1;
        }
        else{
            return 0;
        }
    }
}
