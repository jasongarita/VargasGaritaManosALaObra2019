package Interface;

import javafx.application.Platform;
import javafx.scene.Scene;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.MenuItem;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.VBox;

public class InterfaceMenu {

    public Scene Interfaz() {
        //Principal  Scene
        VBox vBPrincipal = new VBox();
        InterfaceEmployee inface = new InterfaceEmployee();
        InterfaceVehicle inteface = new InterfaceVehicle();
        
        vBPrincipal.setStyle("-fx-background-image:url(FondoPrincipal.jpg);"
                + "-fx-background-repeat:no-repeat;"
                + "-fx-background-position: center;"
                + "-fx-background-size:558 495;");

        Scene scene = new Scene(vBPrincipal, 550, 490);
        VBox vBWindows = new VBox();

        //Menu Bar
        MenuBar principalMenu = new MenuBar();

        //Menu
        Menu mEmployee = new Menu("Employee");
        Menu mVehicle = new Menu("Vehicle");
        Menu mAbout = new Menu("About");

        //EmployeeSubmenus
        MenuItem mIAddEmployee = new MenuItem("Add Employee", new ImageView(new Image("add.png")));
        MenuItem mIDeletedEmployee = new MenuItem("Delete Employee", new ImageView(new Image("delete.png")));
        MenuItem mIModifyEmployee = new MenuItem("Modify Employee", new ImageView(new Image("edit.png")));
        MenuItem mISearchEmployee = new MenuItem("Search Employee", new ImageView(new Image("search.png")));
        MenuItem mISeeAll = new MenuItem("See All Employee", new ImageView(new Image("show.png")));
        
        //VehicleSubmenus
        MenuItem mIAddVehicle = new MenuItem("Add Vehicle", new ImageView(new Image("add.png")));
        MenuItem mIDeletedVehicle = new MenuItem("Delete Vehicle", new ImageView(new Image("delete.png")));
        MenuItem mIModifyVehicle = new MenuItem("Modify Vehicle", new ImageView(new Image("edit.png")));
        MenuItem mISeeAllVehicle = new MenuItem("See All Vehicle", new ImageView(new Image("show.png")));

        // Employee Button
        mIAddEmployee.setOnAction((event) -> {
            vBWindows.getChildren().clear();
           vBWindows.getChildren().addAll(inface.getmIAddEmployee());
        });
        mIModifyEmployee.setOnAction((event) -> {
            vBWindows.getChildren().clear();
            vBWindows.getChildren().addAll(inface.getModificar());
        });
        mISearchEmployee.setOnAction((event) -> {
            vBWindows.getChildren().clear();
            vBWindows.getChildren().addAll(inface.getSearchEmployee());
        });
        mIDeletedEmployee.setOnAction((event) -> {
            vBWindows.getChildren().clear();
            vBWindows.getChildren().addAll(inface.getDelete());

        });
        mISeeAll.setOnAction((event) -> {
            vBWindows.getChildren().clear();
            vBWindows.getChildren().addAll(inface.getSeeAll());
        });

        //Vehicle Button
        mIAddVehicle.setOnAction((event) -> {
            vBWindows.getChildren().clear();
            vBWindows.getChildren().addAll(inteface.getmIAddVehicle());
        });
        mIModifyVehicle.setOnAction((event) -> {
            vBWindows.getChildren().clear();
            vBWindows.getChildren().addAll(inteface.getModifyVehicle());
        });
        mIDeletedVehicle.setOnAction((event) -> {
            vBWindows.getChildren().clear();
            vBWindows.getChildren().addAll(inteface.getDeleteVehicle());

        });
         mISeeAllVehicle.setOnAction((event) -> {
            vBWindows.getChildren().clear();
            vBWindows.getChildren().addAll(inteface.getSeeAllVehicle());
        });
        
        //About submenus
        MenuItem mIAbout = new  MenuItem("About", new ImageView(new Image("info.png")));
        MenuItem mICredits = new  MenuItem("Credits", new ImageView(new Image("credits.png")));
        MenuItem mIExit = new MenuItem ("Exit", new ImageView(new Image("quit.png")));
        
        //About Button  
        mIAbout.setOnAction((event)->{
            vBWindows.getChildren().clear();
            vBWindows.getChildren().addAll(inface.AcerceDe());
        });
        mICredits.setOnAction((event)->{
            vBWindows.getChildren().clear();
            vBWindows.getChildren().addAll(inface.Creditos());
        });
        mIExit.setOnAction((event)->{
            Platform.exit();
        });
        //HotKeysEmployee
        mIAddEmployee.setAccelerator(KeyCombination.keyCombination("CTRL+A"));
        mIDeletedEmployee.setAccelerator(KeyCombination.keyCombination("CTRL+E"));
        mIModifyEmployee.setAccelerator(KeyCombination.keyCombination("CTRL+M"));
        mISearchEmployee.setAccelerator(KeyCombination.keyCombination("CTRL+B"));
        mISeeAll.setAccelerator(KeyCombination.keyCombination("CTRL+H"));
        
        //HotKeyVehicle
        mIAddVehicle.setAccelerator(KeyCombination.keyCombination("CTRL+F"));
        mIModifyVehicle.setAccelerator(KeyCombination.keyCombination("CTRL+Z"));
        mIDeletedVehicle.setAccelerator(KeyCombination.keyCombination("CTRL+L"));
        mISeeAllVehicle.setAccelerator(KeyCombination.keyCombination("CTRL+U"));
        
        //Encapsulation
        mEmployee.getItems().addAll(mIAddEmployee, mIDeletedEmployee, mIModifyEmployee,mISearchEmployee, mISeeAll);
        mVehicle.getItems().addAll(mIAddVehicle, mIModifyVehicle, mIDeletedVehicle, mISeeAllVehicle);
        mAbout.getItems().addAll(mIAbout, mICredits, mIExit);
        principalMenu.getMenus().addAll(mEmployee, mVehicle, mAbout);
        ((VBox)scene.getRoot()).getChildren().addAll(principalMenu,vBWindows);
        
        return scene;
    }
}
