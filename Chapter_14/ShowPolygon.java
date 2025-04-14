/*
Auther: Damion Shakespear
Date Created: 4/11/2025

This assignment is to use the given code (ShowPolygon) and make it into a Stop Sign.
 */
import javafx.application.Application;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import javafx.scene.shape.Polygon;
import javafx.scene.text.*;
import javafx.scene.control.*;

public class ShowPolygon extends Application {
	@Override // Override the start method in the Application class
	public void start(Stage primaryStage) {   

		MyPolygon Octagon = new MyPolygon();

		Label stop = new Label("STOP");
        stop.setFont(Font.font("Highway Gothic", FontWeight.BOLD, 100));
		stop.setTextFill(Color.WHITE);

        StackPane Sign =  new StackPane();
        Sign.getChildren().addAll(Octagon, stop);

		// Create a scene and place it in the stage
		Scene scene = new Scene(Sign, 400, 400); //(new MyPolygon(), 400, 400);
		primaryStage.setTitle("StopSign"); // Set the stage title
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

class MyPolygon extends Pane {

	private void paint() {
		// Create a polygon and place polygon to pane
		Polygon polygon = new Polygon();
		polygon.setFill(Color.RED);
		polygon.setStroke(Color.WHITE);
		ObservableList<Double> list = polygon.getPoints();
		
		double centerX = getWidth() / 2, centerY = getHeight() / 2;
		double radius = Math.min(getWidth(), getHeight()) * 0.4;

		// s represents the number of sides of the shape
		// Make sure to update this number when necessary
		int s = 8;
		// Add points to the polygon list
		for (int i = 0; i < s; i++) {
			list.add(centerX + radius * Math.cos(2 * i * Math.PI / s)); 
			list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
		}
        polygon.setRotate(22.5);
		
		getChildren().clear();
		getChildren().add(polygon); 
	}
	
	@Override
	public void setWidth(double width) {
		super.setWidth(width);
		paint();
	}
	
	@Override
	public void setHeight(double height) {
		super.setHeight(height);
		paint();
	}
}