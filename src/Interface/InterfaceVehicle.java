package Interface;

import Domain.Cars;
import java.util.StringTokenizer;
import java.util.jar.Attributes;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;

public class InterfaceVehicle {

    //font 
    Font Garamond = new Font("Garamond", 18);

    //Objects Declaration
    TextField tfName = new TextField();
    TextField tFYear = new TextField();
    TextField tFMileage = new TextField();
    TextField tFSerie = new TextField();

    //Interface Add Vehicle
    public VBox getmIAddVehicle() {

        VBox vBAddVehicle = new VBox();
        GridPane gPCommand = new GridPane();

        //Buttons
        Button btnAdd = new Button("Save");
        Button btnExit = new Button("Exit");

        //Form
        Label lbForm = new Label("Application Form to insert vehicle");
        lbForm.setFont(new Font("Garamond", 26));
        lbForm.setStyle("-fx-text-fill: red;" + "-fx-background-color:white");
        lbForm.setTranslateX(30);
        lbForm.setTranslateY(10);

        //Name
        Label lBName = new Label("Name");
        lBName.setStyle("-fx-text-fill: lightgreen;" + "-fx-background-color:gray ");
        tfName.setPromptText("Insert Name");
        lBName.setFont(Garamond);
        tfName.setMinSize(275, 30);
        tfName.setMaxSize(275, 30);

        //Year
        Label lBYear = new Label("Year");
        lBYear.setStyle("-fx-text-fill: lightgreen;" + "-fx-background-color:gray ");
        tFYear.setPromptText("Insert year");
        lBYear.setFont(Garamond);
        tFYear.setMinSize(275, 30);
        tFYear.setMaxSize(275, 30);

        //Mileage
        Label lbMileage = new Label("Mileage");
        lbMileage.setStyle("-fx-text-fill: lightgreen;" + "-fx-background-color:gray ");
        tFMileage.setPromptText("Example: 0000000");
        lbMileage.setFont(Garamond);
        tFMileage.setMinSize(275, 30);
        tFMileage.setMaxSize(275, 30);

        //Serie
        Label lbSerie = new Label("Serie");
        lbSerie.setStyle("-fx-text-fill: lightgreen;" + "-fx-background-color:gray ");
        tFSerie.setPromptText("Example: 457348");
        lbSerie.setFont(Garamond);
        tFSerie.setMinSize(275, 30);
        tFSerie.setMaxSize(275, 30);

        //Create a comboBox Qualify for all
        ComboBox kind = new ComboBox();
        kind.setPromptText("Which kind is your car");
        kind.getItems().addAll("American", "Other");
        kind.setMinSize(170, 30);
        kind.setMaxSize(170, 30);
        kind.setVisible(true);

        //Add to GridPane
        gPCommand.add(lBName, 0, 0);
        gPCommand.add(tfName, 1, 0);
        gPCommand.add(lBYear, 0, 1);
        gPCommand.add(tFYear, 1, 1);
        gPCommand.add(lbMileage, 0, 2);
        gPCommand.add(tFMileage, 1, 2);
        gPCommand.add(lbSerie, 0, 3);
        gPCommand.add(tFSerie, 1, 3);
        gPCommand.add(kind, 1, 6);
        gPCommand.add(btnAdd, 0, 14);
        gPCommand.add(btnExit, 1, 14);

        //Propiedades de GridPane
        gPCommand.setMaxSize(600, 400);
        gPCommand.setTranslateX(20);
        gPCommand.setHgap(10);
        gPCommand.setVgap(10);
        gPCommand.setTranslateY(20);

        //Propiedades de Botones
        btnExit.setMinSize(110, 40);
        btnExit.setMaxSize(110, 40);
        btnAdd.setMinSize(110, 40);
        btnAdd.setMaxSize(110, 40);
        btnExit.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 18px;");
        btnAdd.setStyle("-fx-text-fill: White; -fx-background-color:  Brown; -fx-font-size: 18px;");

        btnExit.setOnAction((event) -> {
            vBAddVehicle.getChildren().clear();
        });

        vBAddVehicle.getChildren().addAll(lbForm, gPCommand);
        return vBAddVehicle;
    
    btnAdd.setOnAction((event)->{
            
            Cars car = new Cars(tfName.getText(), tFSerie.getText(), tFYear.getText(), tf);
            if (tfName.getLength() == 0 || tFSerie.getLength() == 0 || tFYear == 0)
                lb_mensaje.setVisible(true);
            else{
                Limpiar();
                .getAdd(Contact);
            }
        });
         
        btn_Limpiar.setOnAction((event)->{
            Limpiar();
        });
        
        vB_agregarContacto.getChildren().addAll(lb_Formulario,gP_ordenador);
    return vB_agregarContacto;        
    
    }

    public VBox getModifyVehicle() {
        VBox v_Cont = new VBox();
        Label lbModify = new Label("Search the vehicle that you want modify");
        Label lbNewName = new Label("Enter the new name or skip to save the current");
        Label lbNewYear = new Label("Enter the new year or skip to save the current");
        
        //Show name ComboBox
        ComboBox cb_ShowName = new ComboBox();
        cb_ShowName.setPromptText("Choose the Vehicle");
        cb_ShowName.setMinSize(170, 30);
        cb_ShowName.setMaxSize(170, 30);
        
        //kind ComboBox
        ComboBox cb_Showkind = new ComboBox();
        cb_Showkind.setPromptText("Choose the kind to change");
        cb_Showkind.getItems().addAll("American", "Other");
        cb_Showkind.setMinSize(190, 30);
        cb_Showkind.setMaxSize(190, 30);
        
        TextField tf_Name = new TextField();
        GridPane gp_Modify = new GridPane();
        TextField tf_Year = new TextField();
        Button btn_Modificar = new Button("Modify");
        Font Garamond2 = new Font("Garamond", 22);
        Font Arial = new Font("ArialBlack", 22);
        Button btn_Exit = new Button("Exit");

        //Objects Property
        gp_Modify.setVgap(10);
        gp_Modify.setHgap(10);
        gp_Modify.setTranslateX(30);
        gp_Modify.setTranslateY(20);
        lbModify.setStyle("-fx-text-fill: lightgreen;" + "-fx-background-color:gray");
        lbModify.setFont(Garamond2);
        lbNewName.setStyle("-fx-text-fill: black;" + "-fx-background-color:gray");
        lbNewName.setFont(Garamond);
        lbNewYear.setStyle("-fx-text-fill: black;" + "-fx-background-color:gray");
        lbNewYear.setFont(Garamond);
        btn_Exit.setTranslateX(150);
        btn_Modificar.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 16px;");
        btn_Exit.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 16px;");
        btn_Modificar.setMinSize(100, 50);
        btn_Modificar.setMaxSize(100, 50);
        btn_Exit.setMinSize(100, 50);
        btn_Exit.setMaxSize(100, 50);

        //Agregar objeto a GridPane
        gp_Modify.add(lbModify, 0, 0);
        gp_Modify.add(cb_ShowName, 0, 1);
        gp_Modify.add(cb_Showkind,0, 10);
        gp_Modify.add(lbNewName, 0, 4);
        gp_Modify.add(tf_Name, 0, 5);
        gp_Modify.add(lbNewYear, 0, 7);
        gp_Modify.add(tf_Year, 0, 8);
        gp_Modify.add(btn_Modificar, 0, 16);
        gp_Modify.add(btn_Exit, 0, 16);

        cb_ShowName.setOnAction((event) -> {
            String select = cb_ShowName.getSelectionModel().getSelectedItem().toString();
            StringTokenizer info = new StringTokenizer(select, ".");
            String nam = info.nextToken();
        });

        btn_Modificar.setOnAction((event) -> {
            String select = cb_ShowName.getSelectionModel().getSelectedItem().toString();
            StringTokenizer info = new StringTokenizer(select, ".");
            String nam = info.nextToken();
            int i = Integer.parseInt(nam);
        });

        btn_Exit.setOnAction((event) -> {
            v_Cont.getChildren().clear();
        });

        v_Cont.getChildren().addAll(gp_Modify);
        return v_Cont;
    }

    public VBox getDeleteVehicle() {

        VBox v_Conta = new VBox();
        ComboBox cb_list = new ComboBox();
        GridPane gp_Delete = new GridPane();
        cb_list.setMinSize(250, 30);
        cb_list.setMaxSize(250, 30);
        cb_list.setTranslateY(-15);
        gp_Delete.setVgap(20);
        gp_Delete.setHgap(20);
        Button btn_Delete = new Button("Delete");
        btn_Delete.setDisable(true);
        gp_Delete.setTranslateX(20);
        gp_Delete.setTranslateY(135);
        cb_list.setOnAction((event) -> {
            String select = cb_list.getSelectionModel().getSelectedItem().toString();
        });
        Button btn_Exit = new Button("Exit");
        btn_Exit.setOnAction((event) -> {
            v_Conta.getChildren().clear();
        });
        Label lb_Delete = new Label("Choose a vehicle to delete");
        lb_Delete.setTranslateY(-16);
        Label lb_confirmDelete = new Label("The vehicle was delete");
        lb_confirmDelete.setStyle("-fx-text-fill: yellow;" + "-fx-background-color:gray ");
        lb_confirmDelete.setFont(new Font("Times New Roman", 20));
        lb_confirmDelete.setVisible(false);
        lb_Delete.setStyle("-fx-text-fill: yellow;" + "-fx-background-color:gray ");
        lb_Delete.setFont(new Font("Times New Roman", 20));

        btn_Delete.setMinSize(110, 50);
        btn_Delete.setMaxSize(110, 50);
        btn_Delete.setTranslateX(320);
        btn_Exit.setMinSize(110, 50);
        btn_Exit.setMaxSize(110, 50);
        btn_Exit.setTranslateX(320);

        btn_Exit.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 22px;");
        btn_Delete.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 22px;");
        btn_Delete.setOnAction((event) -> {
            String select = cb_list.getSelectionModel().getSelectedItem().toString();
            StringTokenizer info = new StringTokenizer(select, ".");
            String nam = info.nextToken();
            int i = Integer.parseInt(nam);
            //mc.EliminaContacto(i); 
            lb_confirmDelete.setVisible(true);
        });

        gp_Delete.add(lb_Delete, 0, 0);
        gp_Delete.add(btn_Delete, 0, 1);
        gp_Delete.add(cb_list, 0, 1);
        gp_Delete.add(lb_confirmDelete, 0, 1);
        gp_Delete.add(btn_Exit, 0, 2);

        v_Conta.getChildren().addAll(gp_Delete);
        return v_Conta;
    }
    
    //Show all Vehicle
    public VBox getSeeAllVehicle() {

        VBox v_Cont = new VBox();

        //Propiedades de Label Muestra lista
        Label lb_ShowList = new Label("Vehicle stored");
        lb_ShowList.setFont(new Font("Garamond", 26));
        lb_ShowList.setStyle("-fx-text-fill: White");
        lb_ShowList.setTranslateX(160);
        lb_ShowList.setTranslateY(5);

        TableView<Attributes.Name> tv_Lista = new TableView();

        //Propiedades de Table view
        tv_Lista.setTranslateX(3);
        tv_Lista.setTranslateY(10);
        tv_Lista.setMinSize(554, 395);
        tv_Lista.setMaxSize(554, 395);

        //Crea columnas
        TableColumn tc_Name = new TableColumn("Name");
        TableColumn tc_Year = new TableColumn("Year");
        TableColumn tc_Mileage = new TableColumn("Mileage");
        TableColumn tc_Kind = new TableColumn("Kind");
        TableColumn tc_Serie = new TableColumn("Serie");

        //Columnas con su respectiva informacion
        tc_Name.setCellValueFactory(new PropertyValueFactory("Name"));
        tc_Year.setCellValueFactory(new PropertyValueFactory("Year"));
        tc_Mileage.setCellValueFactory(new PropertyValueFactory("Mileage"));
        tc_Kind.setCellValueFactory(new PropertyValueFactory("kind"));
        tc_Serie.setCellFactory(new PropertyValueFactory("Serie"));

        tv_Lista.getColumns().addAll(tc_Name, tc_Year, tc_Mileage, tc_Kind, tc_Serie);

        Button btn_Salir = new Button("Exit");
        btn_Salir.setTranslateX(250);
        btn_Salir.setTranslateY(10);
        btn_Salir.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 17px;");
        btn_Salir.setOnAction((event) -> {
            v_Cont.getChildren().clear();
        });


        v_Cont.getChildren().addAll(lb_ShowList, tv_Lista);
        return v_Cont;
    }
    
    

    //Acerca de
    public VBox AcerceDe() {

        VBox v_Contenedor = new VBox();
        TextArea ta_Acercade = new TextArea("APP NJP Contact\nDid in netbeans 8.2\nLanguaje Java\nVersion 1.0\nYear 2019");
        ta_Acercade.setStyle("-fx-text-fill: green");
        ta_Acercade.setFont(new Font("Times New Roman", 25));
        ta_Acercade.setMinSize(555, 420);
        ta_Acercade.setMaxSize(555, 420);
        ta_Acercade.setTranslateX(2);
        Button btn_Salir = new Button("Exit");
        btn_Salir.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 16px;");
        btn_Salir.setMinSize(100, 50);
        btn_Salir.setMaxSize(100, 50);
        btn_Salir.setTranslateX(230);
        ta_Acercade.setEditable(false);
        btn_Salir.setOnAction((event) -> {
            v_Contenedor.getChildren().clear();
        });
        v_Contenedor.getChildren().addAll(ta_Acercade, btn_Salir);
        return v_Contenedor;
    }

// Creditos    
    public VBox Creditos() {

        VBox v_Contenedor = new VBox();
        TextArea ta_Creditos = new TextArea("Did by: \nNeytan Vargas Espinoza \nJason Garita Ulloa \n\nFirst Program Project \nneytanvargas400@gmial.com\n ");
        ta_Creditos.setStyle("-fx-text-fill: green");
        ta_Creditos.setMinSize(555, 420);
        ta_Creditos.setMaxSize(555, 420);
        ta_Creditos.setTranslateX(2);
        ta_Creditos.setFont(new Font("Times New Roman", 25));
        Button btn_Salir = new Button("Salir");
        btn_Salir.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 16px;");
        btn_Salir.setMinSize(100, 50);
        btn_Salir.setMaxSize(100, 50);
        btn_Salir.setTranslateX(230);
        ta_Creditos.setEditable(false);
        btn_Salir.setOnAction((event) -> {
            v_Contenedor.getChildren().clear();
        });

        v_Contenedor.getChildren().addAll(ta_Creditos, btn_Salir);
        return v_Contenedor;
    }

    //Clean all textField
    public void Limpiar() {

        tfName.setText("");
        tFYear.setText("");
        tFMileage.setText("");
    }
}
