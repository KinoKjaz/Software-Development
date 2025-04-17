/*
Auther: Damion Shakespear
Date Created: 4/15/2025

This assignment is to write a program that moves a ball in a pane with methods for moving the ball left, right, up, and down, while keeping it withing the boundary.
*/
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Ball extends Pane {

    public final double radius = 20;
    private double x = radius, y = radius;
    private Circle ball = new Circle(x, y, radius);

    public Ball() {
        getChildren().add(ball);
        ball.setStroke(Color.ORANGE);
        ball.setFill(Color.PURPLE);
    }
    public void moveUp(){
        if (y - 10 > radius){ 
            y -= 10; 
            ball.setCenterY(y);
        }
    }
    public void moveDown(){
        if (y + 10 < 400 - radius){
            y += 10;
            ball.setCenterY(y);
        }
    }
    public void moveRight(){
        if (x + 10 < 400 - radius){
            x += 10;
            ball.setCenterX(x);
        }
    }
    public void moveLeft(){
        if (x - 10 > radius){
            x -= 10;
            ball.setCenterX(x);
        }
    }
}