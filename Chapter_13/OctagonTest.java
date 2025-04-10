/*
Auther: Damion Shakespear
Date Created: 4/9/2025

This assignment is to create an Octagon Class that extends GeometricObject
Then write a test program that creates an Octagon object. Clone the first octagon into a second, then use the .compareTo method to compare the two objects.
 */
public class OctagonTest {
    
    public static void main(String[] args){

        Octagon Trooper = new Octagon(3);

        Octagon CloneTrooper = (Octagon)Trooper.clone();

        System.out.print(Trooper.compareTo(CloneTrooper));

    }
}
