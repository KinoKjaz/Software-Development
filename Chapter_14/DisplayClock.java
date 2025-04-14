/*
Auther: Damion Shakespear
Date Created: 4/12/2025

This assignment is to Modify the ClockPane class with three new Boolean properties
—hourHandVisible, minuteHandVisible, and secondHandVisible— and their associated accessor and mutator methods.

Then write a test program that displays only the hour and minute hands. The hour and minute values are randomly generated. 
The hour is between 0 and 11, and the minute is either 0 or 30.
*********************************************************
This code was edited and used from the Book in Chapter_14
*********************************************************
*/
import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;

public class DisplayClock extends Application {
  
  @Override // Override the start method in the Application class
  public void start(Stage primaryStage) {
    // Create a clock and a label
    ClockPane clock = new ClockPane((int) (Math.random() * 12), (int) (Math.random() * 30), (int) (Math.random() * 60),true, true, false);
    String timeString = clock.getHour() + ":" + clock.getMinute() 
      + ":" + clock.getSecond();
    Label lblCurrentTime = new Label(timeString);

    // Place clock and label in border pane
    BorderPane pane = new BorderPane();
    pane.setCenter(clock);
    pane.setBottom(lblCurrentTime);
    BorderPane.setAlignment(lblCurrentTime, Pos.TOP_CENTER);

    // Create a scene and place it in the stage
    Scene scene = new Scene(pane, 250, 250);
    primaryStage.setTitle("DisplayClock"); // Set the stage title
    primaryStage.setScene(scene); // Place the scene in the stage
    primaryStage.show(); // Display the stage
  }
  /**
   * The main method is only needed for the IDE with limited
   * JavaFX support. Not needed for running from the command line.
   */
  public static void main(String[] args) {
    launch(args);
  }
}