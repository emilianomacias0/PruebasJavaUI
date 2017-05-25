/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fx;

import javafx.application.*;
import javafx.scene.*;
import javafx.scene.control.*;
import javafx.scene.layout.*;

import javafx.stage.*;


 public class Display extends Application{

public static void main(String[] args){
    launch(args);
}

@Override
public void start(Stage stage) throws Exception{


    HBox root = new HBox(); 

    Button button = new Button("button");
    Label  label = new Label("Label");

    root.getChildren().addAll(button, label);

    Scene scene = new Scene(root, 700,300);
    scene.getStylesheets().add("Style.css");
    stage.setScene(scene);

    stage.setTitle("Title");

    stage.show();
  }
}