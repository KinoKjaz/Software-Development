/*
Auther: Damion Shakespear
Date Created: 4/21/2025

This assignment is to write a GUI program that uses buttons to move a message to the left and right and use radio buttons to change the color for the message displayed. 
The text should not go off the pane.
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.input.KeyCode;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class Exercise16_01 extends Application {

    @Override
    public void start(Stage primaryStage) {

    TextField Monkey = new TextField("No Banana for Scale");
    Monkey.setFont(Font.font("Comic Sans MS", 20));
    Monkey.setEditable(false);
    Monkey.setFocusTraversable(false);
    Monkey.setPadding(new Insets(5, 5, 5, 5));
    Monkey.setStyle(
    "-fx-background-color: transparent; " + 
    "-fx-border-color: transparent;"
    );


    HBox RadioColor = new HBox(20);

    RadioButton rbBlue = new RadioButton("Blue");
    RadioButton rbGreen = new RadioButton("Green");
    RadioButton rbBlack = new RadioButton("Black");
    RadioButton rbOrange = new RadioButton("Orange");
    RadioButton rbPurple = new RadioButton("Purple");
    RadioColor.getChildren().addAll(rbBlue, rbGreen, rbBlack, rbOrange, rbPurple);
    RadioColor.setSpacing(10);
    RadioColor.setAlignment(Pos.CENTER);

    ToggleGroup group = new ToggleGroup(); 
    rbBlue.setToggleGroup(group);
    rbGreen.setToggleGroup(group);
    rbBlack.setToggleGroup(group);
    rbOrange.setToggleGroup(group);
    rbPurple.setToggleGroup(group);

    HBox MoveBtn = new HBox();
    MoveBtn.setSpacing(10);
    MoveBtn.setAlignment(Pos.CENTER);
    Button btLeft = new Button("<=");
    Button btRight = new Button("=>");
    MoveBtn.getChildren().add(btLeft);
    MoveBtn.getChildren().add(btRight);

    Pane Banner = new Pane();
    Banner.getChildren().addAll(Monkey, RadioColor, MoveBtn);

    RadioColor.setLayoutX(50);
    RadioColor.setLayoutY(10);

    MoveBtn.setLayoutX(160);
    MoveBtn.setLayoutY(160);

    Monkey.setLayoutY(80);

    Scene scene = new Scene(Banner, 400, 200);
    primaryStage.setTitle("This is not a Monkey");
    primaryStage.setScene(scene);
    primaryStage.show();
    Banner.requestFocus();

//Here is  the Button Input
    btLeft.setOnAction(e -> {
        double X = Monkey.getLayoutX() - 10;
            if (X >= 0) {
                Monkey.setLayoutX(X);
            }
        Banner.requestFocus();
    });
    
    btRight.setOnAction(e -> {
        double X = Monkey.getLayoutX() + 10;
            if (X + Monkey.getWidth() <= 470) {
                Monkey.setLayoutX(X);
            }
        Banner.requestFocus();

//Here is the RadioButton Input
    });
    rbBlue.setOnAction(e -> {
        if (rbBlue.isSelected()) {
            Monkey.setStyle("-fx-text-fill: blue;" + "-fx-background-color: transparent; " + "-fx-border-color: transparent;");
            Banner.requestFocus();
        }
    });
    rbGreen.setOnAction(e -> {
        if (rbGreen.isSelected()) {
            Monkey.setStyle("-fx-text-fill: green;" + "-fx-background-color: transparent; " + "-fx-border-color: transparent;");
            Banner.requestFocus();
        }
    });
    rbBlack.setOnAction(e -> {
        if (rbBlack.isSelected()) {
            Monkey.setStyle("-fx-text-fill: black;" + "-fx-background-color: transparent; " + "-fx-border-color: transparent;");
            Banner.requestFocus();
        }
    });
    rbOrange.setOnAction(e -> {
        if (rbOrange.isSelected()) {
            Monkey.setStyle("-fx-text-fill: orange;" + "-fx-background-color: transparent; " + "-fx-border-color: transparent;");
            Banner.requestFocus();
        }
    });
    rbPurple.setOnAction(e -> {
        if (rbPurple.isSelected()) {
            Monkey.setStyle("-fx-text-fill: purple;" + "-fx-background-color: transparent; " + "-fx-border-color: transparent;");
            Banner.requestFocus();
        }
    });

//Here is the Key Input
    scene.setOnKeyPressed(e -> {
        if (e.getCode() == KeyCode.LEFT) {
            double X = Monkey.getLayoutX() - 10;
            if (X >= 0) {
                Monkey.setLayoutX(X);
            }
        }
        else if (e.getCode() == KeyCode.RIGHT) {
            double X = Monkey.getLayoutX() + 10;
            if (X + Monkey.getWidth() <= 470) {
                Monkey.setLayoutX(X);
            }
        }
    });
    }
    
    public static void main(String[] args) {
        launch(args);
    }
}