/*
Auther: Damion Shakespear
Date Created: 4/15/2025

This assignment is to write a program that moves a ball in a pane with methods for moving the ball left, right, up, and down, while keeping it withing the boundary.
*/
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.layout.BorderPane;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class MoveBall extends Application {
    public Ball ball = new Ball();

    @Override
    public void start(Stage primaryStage) {

    HBox GoWhere = new HBox();
    GoWhere.setSpacing(10);
    GoWhere.setAlignment(Pos.CENTER);
    Button btUp = new Button("Up");
    Button btDown = new Button("Down");
    Button btLeft = new Button("Left");
    Button btRight = new Button("Right");
    GoWhere.getChildren().add(btUp);
    GoWhere.getChildren().add(btDown);
    GoWhere.getChildren().add(btLeft);
    GoWhere.getChildren().add(btRight);


    BorderPane BallCourt = new BorderPane();
    BallCourt.setCenter(ball);
    BallCourt.setBottom(GoWhere);
    BallCourt.setAlignment(GoWhere, Pos.CENTER);

    Scene scene = new Scene(BallCourt, 400, 400);
    primaryStage.setTitle("MoveBall");
    primaryStage.setScene(scene);
    BallCourt.requestFocus();
    primaryStage.show();

    btUp.setOnAction(e -> { ball.moveUp(); BallCourt.requestFocus();});
    btDown.setOnAction(e -> { ball.moveDown(); BallCourt.requestFocus();});
    btLeft.setOnAction(e -> { ball.moveLeft(); BallCourt.requestFocus();});
    btRight.setOnAction(e -> { ball.moveRight(); BallCourt.requestFocus();});

    scene.setOnKeyPressed(e -> {
        if (e.getCode() == KeyCode.UP) {
            ball.moveUp();
        }
        else if (e.getCode() == KeyCode.DOWN) {
            ball.moveDown();
        }
        else if (e.getCode() == KeyCode.LEFT) {
            ball.moveLeft();
        }
        else if (e.getCode() == KeyCode.RIGHT) {
            ball.moveRight();
        }
    });
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}