/*
Auther: Damion Shakespear
Date Created: 4/1/2025

This assignment is for a Rectangle class, to get the Area and Perimeter from the given width and hight.
 */
class Rectangle {

    double width = 1;
    double hight = 1;

    Rectangle(){}

    Rectangle(double newWidth, double newHight){
        width = newWidth;
        hight = newHight;
    }

    double GetArea(){
       return hight * width;
    }

    double GetPerimeter(){
        return 2 * (hight + width);
    }
}
