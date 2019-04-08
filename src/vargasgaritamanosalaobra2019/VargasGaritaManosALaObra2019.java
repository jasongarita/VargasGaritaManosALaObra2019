/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vargasgaritamanosalaobra2019;

import Interface.InterfaceMenu;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class VargasGaritaManosALaObra2019 extends Application {
    
    @Override
    public void start(Stage primaryStage) {
        InterfaceMenu menu = new InterfaceMenu();
        
        primaryStage.setResizable(false);
        primaryStage.getIcons().add(new Image("fondo4.png"));
        primaryStage.setTitle("NJProject");
        primaryStage.setScene(menu.Interfaz());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
