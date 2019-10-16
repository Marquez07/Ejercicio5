/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anonymousinnerclass;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author Usuario
 */
public class AnonymousInnerClass extends Application {
    @Override
    public void start(Stage primaryStage){
        HBox hBox = new HBox();
        Button nuevo = new Button("nuevo");
        Button abrir = new Button("abrir");
        Button guardar=new Button("guardar");
        Button imprimir=new Button("imprimir");
        hBox.getChildren().add(nuevo);
        hBox.getChildren().add(abrir);
        hBox.getChildren().add(guardar);
        hBox.getChildren().add(imprimir);
        
        nuevo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Crea nuevo archivo");
            }
        });
        
        abrir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Abre un archivo");
            }
        });
        
        guardar.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Guarda un archivo");
            }
        });
        
        imprimir.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                System.out.println("Imprime un archivo");
            }
        });
        
        StackPane menu=new StackPane();
        menu.getChildren().add(hBox);
        hBox.setAlignment(Pos.CENTER);
        hBox.setSpacing(10);
        
        Scene scene = new Scene(menu, 300, 50);
        primaryStage.setTitle("Anonymous Inner Class");
        primaryStage.setScene(scene); 
        primaryStage.show();
    }
    
    
    public static void main(String[] args) {
        launch(args);
    }

    
    
}
