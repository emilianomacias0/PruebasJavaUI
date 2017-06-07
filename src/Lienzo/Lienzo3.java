/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lienzo;
 
import java.awt.MultipleGradientPaint.CycleMethod;
import static java.lang.System.gc;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.scene.paint.RadialGradient;
import javafx.scene.paint.Stop;
import javafx.scene.shape.ArcType;
import javafx.scene.text.Font;
import javafx.stage.Stage;
 
public class Lienzo3 extends Application {
 Canvas canvas = new Canvas(300, 250);
    public static void main(String[] args) {
        launch(args);
    }
    private void reset(Canvas canvas, Color color) {
    GraphicsContext gc = canvas.getGraphicsContext2D();
    gc.setFill(color);
    gc.fillRect(0, 0, canvas.getWidth(), canvas.getHeight());
}
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Drawing Operations Test");
        Group root = new Group();
        
        GraphicsContext gc = canvas.getGraphicsContext2D();
        drawCirculo(gc);
        root.getChildren().add(canvas);
        primaryStage.setScene(new Scene(root));
        primaryStage.show();
        
    }

    private void drawShapes(GraphicsContext gc) {
        gc.setFill(Color.GREEN);
        gc.setStroke(Color.BLUE);
        gc.setLineWidth(5);
        gc.strokeLine(40, 10, 10, 40);
        gc.fillOval(10, 60, 30, 30);
        gc.strokeOval(60, 60, 30, 30);
        gc.fillRoundRect(110, 60, 30, 30, 10, 10);
        gc.strokeRoundRect(160, 60, 30, 30, 10, 10);
        gc.fillArc(10, 110, 30, 30, 45, 240, ArcType.OPEN);
        gc.fillArc(60, 110, 30, 30, 45, 240, ArcType.CHORD);
        gc.fillArc(110, 110, 30, 30, 45, 240, ArcType.ROUND);
        gc.strokeArc(10, 160, 30, 30, 45, 240, ArcType.OPEN);
        gc.strokeArc(60, 160, 30, 30, 45, 240, ArcType.CHORD);
        gc.strokeArc(110, 160, 30, 30, 45, 240, ArcType.ROUND);
        gc.fillPolygon(new double[]{10, 40, 10, 40},
                       new double[]{210, 210, 240, 240}, 4);
        gc.strokePolygon(new double[]{60, 90, 60, 90},
                         new double[]{210, 210, 240, 240}, 4);
        gc.strokePolyline(new double[]{110, 140, 110, 140},
                          new double[]{210, 210, 240, 240}, 4);
    }
    
    private void moveCanvas(int x, int y) {
    canvas.setTranslateX(x);
    canvas.setTranslateY(y);
}
    private void drawDShape(GraphicsContext gc) {
    gc.setFill(Color.GREEN);
    gc.setStroke(Color.BLACK);
    gc.beginPath();
    gc.moveTo(50, 50);
    gc.bezierCurveTo(150, 20, 150, 150, 75, 150);
    gc.closePath();
    
}
    private void drawCirculo(GraphicsContext gc) {
        Canvas c = gc.getCanvas();
     double x = c.getWidth() / 2;
     double y = c.getHeight()/ 2;
        System.out.println("Y: "+y);
        System.out.println("X: "+x);
    gc.strokeLine(0, y, c.getWidth(), y);
    gc.strokeLine(x, 0, x, c.getHeight());
    gc.setFont(Font.font(10));
        for (double i = (0-y); i <= c.getHeight(); i+=10) {
             gc.strokeLine(x-5, i, x+5, i);
             gc.fillText(""+i, x + 8, i);
        }
    gc.setFill(Color.GREEN);
    gc.setStroke(Color.BLACK);
    gc.setLineWidth(5);
    gc.fillOval(x-5, y-5, 10, 10);
    
}

    
    
}