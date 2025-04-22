/*
Auther: Damion Shakespear
Date Created: 4/21/2025

This assignment is to write a program that allows the user to enter time in seconds in the text field and press the Enter key to count down the seconds.
When the seconds are expired, the program starts to play music continuously.
*/
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.layout.Pane;
import javafx.scene.text.Font;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;

public class Stopwatch extends Application{

    private static final String findMusic = "https://liveexample.pearsoncmg.com/common/audio/anthem/anthem0.mp3";
    

    int countdown;

    @Override
    public void start(Stage primaryStage) {

        Media music = new Media(findMusic);
        MediaPlayer playMusic = new MediaPlayer(music);

        TextField UserTime = new TextField("0");
        UserTime.setFont(Font.font("Comic Sans MS", 20));
        UserTime.setPadding(new Insets(5, 5, 5, 5));
        UserTime.setStyle(
        "-fx-background-color: transparent; " + 
        "-fx-border-color: transparent;"
        );

        Pane DigiWatch = new Pane();
        DigiWatch.getChildren().add(UserTime);
        DigiWatch.setLayoutX(35);
        DigiWatch.setStyle(
        "-fx-background-color: transparent; " + 
        "-fx-border-color: transparent;"
        );

        Scene scene = new Scene(DigiWatch, 100, 50);
        primaryStage.setTitle("Stopwatch");
        primaryStage.setScene(scene);
        primaryStage.show();

//Key Event to initiate Countdown
        scene.setOnKeyPressed(e -> {
            if (e.getCode() == KeyCode.ENTER) {
                
                try { 
                    countdown = Integer.parseInt(UserTime.getText());
                    Timeline timeCount = new Timeline(new KeyFrame(Duration.millis(1000), event -> {

                        System.out.println(countdown);
                        if (countdown > 0) {
                            countdown--;
                            UserTime.setText(String.valueOf(countdown));
                        }
                        if (countdown == 0){
                            playMusic.play();
                        }
                    }));
                    timeCount.setCycleCount(countdown);
                    timeCount.play();
                } 
                catch (NumberFormatException ex) {
                    UserTime.setText("Invalid input!");
                }
            }
        });
    }

    public static void main(String[] args) {
        launch(args);
    }
}