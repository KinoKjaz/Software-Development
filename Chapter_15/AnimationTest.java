/*
Auther: Damion Shakespear
Date Created: 4/16/2025

This assignment is to write a program that animates a rectangle moving along the outline of a pentagon.
Enable the user to resume/pause the animation with a click on the left/right mouse button. The rectangle's opacity should change as it moves around the pentagon.
*/
import javafx.animation.FadeTransition;
import javafx.animation.Interpolator;
import javafx.animation.PathTransition;
import javafx.animation.Timeline;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.shape.Polygon;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.collections.ObservableList;

public class AnimationTest extends Application {

  public static void main(String[] args) {
      launch(args);
  }

  @Override
  public void start(Stage primaryStage) {
      Pane pane = new Pane();

      Rectangle Train = new Rectangle(0, 0, 30, 10);
      Train.setFill(Color.PURPLE);

      Pentagon Railway = new Pentagon();
      Railway.setLayoutX(50);
      Railway.setLayoutY(50);
      Railway.setDimensions(200, 200);

      pane.getChildren().add(Railway);
      pane.getChildren().add(Train);

      PathTransition pt = new PathTransition();
      pt.setDuration(Duration.millis(5000));
      pt.setPath(Railway);
      pt.setNode(Train);
      pt.setOrientation(
      PathTransition.OrientationType.ORTHOGONAL_TO_TANGENT);
      pt.setInterpolator(Interpolator.LINEAR);
      pt.setCycleCount(Timeline.INDEFINITE);
      pt.play();

      Railway.setOnMousePressed(e -> pt.pause());
      Railway.setOnMouseReleased(e -> pt.play());

      FadeTransition ft = new FadeTransition(Duration.millis(1000), Train);
      ft.setFromValue(1.0);
      ft.setToValue(0.3);
      ft.setAutoReverse(true);
      ft.setCycleCount(Timeline.INDEFINITE);
      ft.play();

      Scene scene = new Scene(pane, 300, 300);
      primaryStage.setTitle("AnimationTest");
      primaryStage.setScene(scene);
      primaryStage.show();
  }
}

class Pentagon extends Polygon {

  private double width = 200;
  private double height = 200;

  public Pentagon() {
      setFill(Color.WHITE);
      setStroke(Color.BLACK);
      paint();
  }

  public void setDimensions(double width, double height) {
      this.width = width;
      this.height = height;
      paint();
  }

  private void paint() {
      ObservableList<Double> list = getPoints();
      list.clear();

      double centerX = width / 2;
      double centerY = height / 2;
      double radius = Math.min(width, height) * 0.4;

      int s = 5;
      for (int i = 0; i < s; i++) {
          list.add(centerX + radius * Math.cos(2 * i * Math.PI / s));
          list.add(centerY - radius * Math.sin(2 * i * Math.PI / s));
      }
      setRotate(270);
  }
}