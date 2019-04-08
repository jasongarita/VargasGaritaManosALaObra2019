
package Interface;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.jar.Attributes;
import javafx.collections.ObservableList;
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
import javax.swing.JOptionPane;

public class InterfaceEmployee {

    //font 
    Font Garamond = new Font("Garamond", 18);

    //Objects Declaration
    TextField tfName = new TextField();
    TextField tFLastName = new TextField();
    TextField tFID = new TextField();
    TextField tFEmployeeCode = new TextField();
    TextField tFSalary = new TextField();
    TextField tFExtra = new TextField();
    TextField tFHours = new TextField();
    Label lb_mensaje = new Label("All spaces are obligatory");

    //Interface Add Employee
    public VBox getmIAddEmployee() {

        VBox vBAddEmployee = new VBox();
        GridPane gPCommand = new GridPane();

        //Buttons
        Button btnAdd = new Button("Save");
        Button btnExit = new Button("Exit");

        //Form
        Label lbForm = new Label("Application Form to insert employee");
        lbForm.setFont(new Font("Garamond", 26));
        lbForm.setStyle("-fx-text-fill: white");
        lbForm.setTranslateX(30);
        lbForm.setTranslateY(10);

        //Name
        Label lBName = new Label("Name");
        lBName.setStyle("-fx-text-fill: white");
        tfName.setPromptText("Insert Name");
        lBName.setFont(Garamond);
        tfName.setMinSize(275, 30);
        tfName.setMaxSize(275, 30);

        //LastName
        Label lBLastName = new Label("LastName");
        lBLastName.setStyle("-fx-text-fill: white");
        tFLastName.setPromptText("Insert your lastname");
        lBLastName.setFont(Garamond);
        tFLastName.setMinSize(275, 30);
        tFLastName.setMaxSize(275, 30);

        //ID
        Label lBID = new Label("ID");
        lBID.setStyle("-fx-text-fill: white");
        tFID.setPromptText("Ejemplo: 000000000");
        lBID.setFont(Garamond);
        tFID.setMinSize(275, 30);
        tFID.setMaxSize(275, 30);

        //Employee Code
        Label lBCode = new Label("Employee Code");
        lBCode.setStyle("-fx-text-fill: white");
        tFEmployeeCode.setPromptText("Ejemplo: 457348");
        lBCode.setFont(Garamond);
        tFEmployeeCode.setMinSize(275, 30);
        tFEmployeeCode.setMaxSize(275, 30);

        //Create a comboBox Qualify for all
        ComboBox quialify = new ComboBox();
        quialify.getItems().addAll("Yes", "No");
        quialify.setMinSize(150, 30);
        quialify.setMaxSize(150, 30);
        quialify.setVisible(false);

        //ExtraHours Janitor
        Label lBHoursE = new Label("ExtraHours");
        lBHoursE.setStyle("-fx-text-fill: white");
        lBHoursE.setFont(Garamond);
        tFExtra.setMinSize(275, 30);
        tFExtra.setMaxSize(275, 30);
        lBHoursE.setVisible(false);
        tFExtra.setVisible(false);
        tFSalary.setVisible(false);

        //Create a comboBox of Driver
        ComboBox scheduleDri = new ComboBox();
        scheduleDri.getItems().addAll("Day", "Night");
        scheduleDri.setMinSize(190, 30);
        scheduleDri.setMaxSize(190, 30);
        scheduleDri.setVisible(false);

        //Create a comboBox Administrator
        ComboBox categoryAdmi = new ComboBox();
        categoryAdmi.getItems().addAll("1", "2");
        categoryAdmi.setMinSize(190, 30);
        categoryAdmi.setMaxSize(190, 30);
        categoryAdmi.setVisible(false);

        //Hours
        Label lBHours = new Label("ExtraHours");
        lBHours.setStyle("-fx-text-fill: white");
        tFHours.setPromptText("Ejemplo: 457348");
        lBHours.setFont(Garamond);
        tFHours.setMinSize(275, 30);
        tFHours.setMaxSize(275, 30);
        lBHours.setVisible(false);
        tFHours.setVisible(false);
        lb_mensaje.setVisible(false);

        //Do a ComboBox
        ComboBox list = new ComboBox();
        list.setPromptText("Select a kind of employee");
        list.getItems().addAll("Janitor", "Administrator", "Driver");
        list.setMinSize(230, 30);
        list.setMaxSize(230, 30);
        list.setOnAction((event) -> {
            String select = list.getSelectionModel().getSelectedItem().toString();
            if (list.getValue().equals("Janitor")) {

                quialify.setPromptText("Is you qualify??");
                quialify.setVisible(true);
                lBHoursE.setVisible(true);
                tFExtra.setVisible(true);
                tFSalary.setVisible(true);
                scheduleDri.setVisible(false);
                categoryAdmi.setVisible(false);
            }

            if (list.getValue().equals("Administrator")) {

                quialify.setPromptText("Is you qualify??");
                quialify.setVisible(true);
                categoryAdmi.setPromptText("Which is your category");
                categoryAdmi.setVisible(true);
                scheduleDri.setVisible(false);
                lBHoursE.setVisible(false);
                tFSalary.setVisible(false);
                tFExtra.setVisible(false);
            }

            if (list.getValue().equals("Driver")) {

                quialify.setPromptText("Is you qualify??");
                quialify.setVisible(true);
                scheduleDri.setPromptText("Which is your schedule");
                scheduleDri.setVisible(true);
                categoryAdmi.setVisible(false);
                lBHoursE.setVisible(false);
                tFSalary.setVisible(false);
                tFExtra.setVisible(false);
            }

        });

        //Add to GridPane
        gPCommand.add(lBName, 0, 0);
        gPCommand.add(tfName, 1, 0);
        gPCommand.add(lBLastName, 0, 1);
        gPCommand.add(tFLastName, 1, 1);
        gPCommand.add(lBID, 0, 2);
        gPCommand.add(tFID, 1, 2);
        gPCommand.add(lBCode, 0, 3);
        gPCommand.add(tFEmployeeCode, 1, 3);
        gPCommand.add(list, 0, 4);
        gPCommand.add(quialify, 1, 5);
        gPCommand.add(scheduleDri, 1, 7);
        gPCommand.add(categoryAdmi, 1, 7);
        gPCommand.add(tFSalary, 1, 6);
        gPCommand.add(lBHoursE, 0, 6);
        gPCommand.add(tFExtra, 1, 6);
        gPCommand.add(btnAdd, 0, 8);
        gPCommand.add(lb_mensaje, 1, 7);
        gPCommand.add(btnExit, 1, 8);

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
        btnExit.setStyle("-fx-text-fill: white; -fx-font-size: 18px;");
        btnAdd.setStyle("-fx-text-fill: White; -fx-font-size: 18px;");

        vBAddEmployee.getChildren().addAll(lbForm, gPCommand);
        return vBAddEmployee;
    }
    
    public VBox getModificar(){
        VBox v_Contain = new VBox();
        Label lb_Modify = new Label("Choose the employee that you want modify");
        Label lb_NewName = new Label("Enter the new name or skip to save the current \n nnumbe");
        Label lb_NewEmployeeCode = new Label("Enter the new Employee Code or skip to save the current");

        ComboBox cb_ShowName = new ComboBox();
        cb_ShowName.setPromptText("Choose the employee");
        cb_ShowName.setMinSize(170, 30);
        cb_ShowName.setMaxSize(170, 30);
        TextField tf_Name = new TextField();
        GridPane gp_Modify = new GridPane();
        TextField tf_EmploCode = new TextField();
        Button btn_Modificar = new Button("Modify");
        Font Garamond2 = new Font("Garamond",22);
        Font Arial = new Font("ArialBlack",22);
        Button btn_Exit  = new Button("Exit");
        
        //Objects Property
        gp_Modify.setVgap(10);
        gp_Modify.setHgap(10);
        gp_Modify.setTranslateX(30);
        gp_Modify.setTranslateY(20);
        lb_Modify.setStyle("-fx-text-fill: white");
        lb_Modify.setFont(Garamond2);
        lb_NewName.setStyle("-fx-text-fill: white");
        lb_NewName.setFont(Garamond);
        lb_NewEmployeeCode.setStyle("-fx-text-fill: black;"+"-fx-background-color:gray");
        lb_NewEmployeeCode.setFont(Garamond);
        btn_Exit.setTranslateX(150);
        btn_Modificar.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 16px;");
        btn_Exit.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 16px;");
        btn_Modificar.setMinSize(100,50);
        btn_Modificar.setMaxSize(100,50);
        btn_Exit.setMinSize(100,50);
        btn_Exit.setMaxSize(100,50);
        
        //Agregar objeto a GridPane
        gp_Modify.add(lb_Modify,0,0);
        gp_Modify.add(cb_ShowName,0,1);
        gp_Modify.add(lb_NewName,0,2);
        gp_Modify.add(tf_Name,0,3);
        gp_Modify.add(lb_NewEmployeeCode,0,4);
        gp_Modify.add(tf_EmploCode,0,5);
        gp_Modify.add(btn_Modificar,0,8);
        gp_Modify.add(btn_Exit,0,8);
        
        cb_ShowName.setOnAction((event)->{
            String select = cb_ShowName.getSelectionModel().getSelectedItem().toString();
            StringTokenizer info = new StringTokenizer(select,".");
            String nam = info.nextToken();
//            tf_Telefono.setText(m[0]);
//            tf_direccion.setText(m[1]);
//            tf_email.setText(m[2]);
        });
        
        btn_Modificar.setOnAction((event)->{
            String select = cb_ShowName.getSelectionModel().getSelectedItem().toString();
            StringTokenizer info = new StringTokenizer(select,".");
            String nam = info.nextToken();
            int i =Integer.parseInt(nam);
//            mc.getModificarInformacionContacto(i, tf_Telefono.getText(), tf_direccion.getText(), tf_email.getText());
//            tf_Telefono.setText(""); 
//            tf_direccion.setText(""); 
//            tf_email.setText(""); 
        });
        
        btn_Exit.setOnAction((event)->{
            v_Contain.getChildren().clear();
        });
       
        v_Contain.getChildren().addAll(gp_Modify);
    return v_Contain;
    }
    
    public VBox getDelete(){
    
        VBox v_Conta = new VBox();
        ComboBox cb_list =new ComboBox();
        GridPane gp_Delete = new GridPane();
        cb_list.setMinSize(250, 30);
        cb_list.setMaxSize(250,30);
        cb_list.setTranslateY(-15);
        gp_Delete.setVgap(20);
        gp_Delete.setHgap(20);
        Button btn_Delete = new Button("Delete");
        btn_Delete.setDisable(true);
        gp_Delete.setTranslateX(20);
        gp_Delete.setTranslateY(135);
        cb_list.setOnAction((event)->{
            String select = cb_list.getSelectionModel().getSelectedItem().toString();
//            if(!select.equals("")){
//                btn_Eliminar.setDisable(false);  
//                StringTokenizer info = new StringTokenizer(select,".");
//                String nam = info.nextToken();
//                String m[] = mc.getTextField(Integer.parseInt(nam));
//            }
        });
        Button btn_Exit = new Button("Exit"); 
        btn_Exit.setOnAction((event)->{ v_Conta.getChildren().clear();});
        Label lb_Delete = new Label("Choose an employee to delete");
        lb_Delete.setTranslateY(-16);
        Label lb_confirmDelete = new Label("The employee was delete");
        lb_confirmDelete.setStyle("-fx-text-fill: yellow;"+"-fx-background-color:gray ");
        lb_confirmDelete.setFont(new Font("Times New Roman",20));
        lb_confirmDelete.setVisible(false);
        lb_Delete.setStyle("-fx-text-fill: yellow;"+"-fx-background-color:gray ");
        lb_Delete.setFont(new Font("Times New Roman",20));
        
        btn_Delete.setMinSize(110, 50);
        btn_Delete.setMaxSize(110, 50);
        btn_Delete.setTranslateX(320);
        btn_Exit.setMinSize(110, 50);
        btn_Exit.setMaxSize(110, 50);
        btn_Exit.setTranslateX(320);
        
        btn_Exit.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 22px;");
        btn_Delete.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 22px;");
        btn_Delete.setOnAction((event)->{
            String select = cb_list.getSelectionModel().getSelectedItem().toString();
            StringTokenizer info = new StringTokenizer(select,".");
            String nam = info.nextToken();
            int i = Integer.parseInt(nam);
            //mc.EliminaContacto(i); 
            lb_confirmDelete.setVisible(true);
        });
        
        gp_Delete.add(lb_Delete, 0, 0);
        gp_Delete.add(btn_Delete, 0, 1);
        gp_Delete.add(cb_list, 0, 1);
        gp_Delete.add(lb_confirmDelete,0,1);
        gp_Delete.add(btn_Exit,0,2);
        
        v_Conta.getChildren().addAll(gp_Delete);
    return v_Conta;
    }
    
    // Search the employee
    public VBox getSearchEmployee(){
    
        VBox v_Contenedor = new VBox();
        GridPane gp_Mostrar = new GridPane();
        Button btn_Buscar = new Button("Search");
        Button btn_Salir = new Button("Exit");     
        Label lb_buscar = new Label("Insert the name of employee that you need");
        
        //Agregar a GridPane
        gp_Mostrar.add(lb_buscar,0,0);
        gp_Mostrar.add(tfName,0 , 1);
        gp_Mostrar.add(btn_Buscar,0,4);
        gp_Mostrar.add(btn_Salir,0,4);
        
        //Propiedades de Objetos
        gp_Mostrar.setTranslateX(10);
        gp_Mostrar.setTranslateY(10);
        tfName.setMinSize(500,25);
        tfName.setMaxSize(500,25);
        gp_Mostrar.setVgap(5);
        lb_buscar.setStyle("-fx-text-fill: lightgreen;"+"-fx-background-color:gray");;
        lb_buscar.setFont(new Font("Garamond",22));
        btn_Salir.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 17px;");
        btn_Buscar.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 17px;");
        btn_Buscar.setMinSize(100,40);
        btn_Buscar.setMaxSize(100,40);
        btn_Salir.setMinSize(100,40);
        btn_Salir.setMaxSize(100,40);
        btn_Salir.setTranslateX(440);
        lb_buscar.setTranslateX(62);
       
        TableView<Attributes.Name> tv_List = new TableView();
        //Propiedades de Table view
        tv_List.setTranslateX(30);
        tv_List.setTranslateY(20);
        tv_List.setMinSize(500,330);
        tv_List.setMaxSize(500,330);
        
        //Crea columnas
        TableColumn tc_Name = new TableColumn("Name"); 
        TableColumn tc_LastName = new TableColumn("Lastname");
        TableColumn tc_ID = new TableColumn("ID");
        TableColumn tc_EmpCode = new TableColumn("Employee code"); 
        
        //Columnas con su respectiva informacion
        tc_Name.setCellValueFactory(new PropertyValueFactory("Name"));
        tc_LastName.setCellValueFactory(new PropertyValueFactory("LastName"));
        tc_ID.setCellValueFactory(new PropertyValueFactory("ID"));
        tc_EmpCode.setCellValueFactory(new PropertyValueFactory("Employee code"));
        
        tv_List.getColumns().addAll(tc_Name,tc_LastName,tc_ID,tc_EmpCode);
       btn_Buscar.setOnAction((event)->{
//            tv_Lista.setItems();
        });
        
       btn_Salir.setOnAction((event)->{
            v_Contenedor.getChildren().clear();
        });
        v_Contenedor.getChildren().addAll(gp_Mostrar, tv_List);
    return v_Contenedor;    
    }
    
    //Muestra la lista de contactos
    public VBox getSeeAll(){
        
        VBox v_Cont = new VBox();
        
        //Propiedades de Label Muestra lista
        Label lb_ShowList = new Label("Employee stored");
        lb_ShowList.setFont(new Font("Garamond",26));
        lb_ShowList.setStyle("-fx-text-fill: White");
        lb_ShowList.setTranslateX(160);
        lb_ShowList.setTranslateY(5);
        
        TableView<Attributes.Name> tv_Lista = new TableView();
                
        //Propiedades de Table view
        tv_Lista.setTranslateX(3);
        tv_Lista.setTranslateY(10);
        tv_Lista.setMinSize(554,395);
        tv_Lista.setMaxSize(554,395);
        
        //Crea columnas
        TableColumn tc_Name = new TableColumn("Name"); 
        TableColumn tc_LastName = new TableColumn("LastName");
        TableColumn tc_ID = new TableColumn("ID");
        TableColumn tc_EmpCode = new TableColumn("Emplo Code"); 
        
        //Columnas con su respectiva informacion
        tc_Name.setCellValueFactory(new PropertyValueFactory("Name"));
        tc_LastName.setCellValueFactory(new PropertyValueFactory("LastName"));
        tc_ID.setCellValueFactory(new PropertyValueFactory("ID"));
        tc_EmpCode.setCellValueFactory(new PropertyValueFactory("Employee Code"));
       
        tv_Lista.getColumns().addAll(tc_Name,tc_LastName,tc_ID,tc_EmpCode);
        
        //ObservableList<Contacto> datos = getlist();
        //tv_Lista.setItems(datos);
        //BufferedReader br = mc.getBufferedReader();
         Button btn_Salir = new Button("Exit");
        btn_Salir.setTranslateX(250);
        btn_Salir.setTranslateY(10);
        btn_Salir.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 17px;");
        btn_Salir.setOnAction((event)->{
        v_Cont.getChildren().clear();
        });
//        try{
//        String registroActual =br.readLine();
//        
//        if(registroActual == null){
//            v_Contenedor.getChildren().clear();
//            v_Contenedor.getChildren().addAll(ListaVacia());
//        }
//        else
//            v_Contenedor.getChildren().addAll(lb_MustraLista,tv_Lista,btn_Salir);
//        }
//        catch(IOException ieo){
//            JOptionPane.showMessageDialog(null, "Problemas con el archivo");  
//        }

       v_Cont.getChildren().addAll(lb_ShowList, tv_Lista);
    return v_Cont;
    }
    
    //Acerca de
    public VBox AcerceDe(){
    
        VBox v_Contenedor = new VBox();
        TextArea ta_Acercade = new TextArea("APP NJP Contact\nDid in netbeans 8.2\nLanguaje Java\nVersion 1.0\nYear 2019");
        ta_Acercade.setStyle("-fx-text-fill: green");
        ta_Acercade.setFont(new Font("Times New Roman",25));
        ta_Acercade.setMinSize(555, 420);
        ta_Acercade.setMaxSize(555, 420);
        ta_Acercade.setTranslateX(2);
        Button btn_Salir = new Button("Exit");
        btn_Salir.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 16px;");
        btn_Salir.setMinSize(100, 50);
        btn_Salir.setMaxSize(100, 50);
        btn_Salir.setTranslateX(230);
        ta_Acercade.setEditable(false);
        btn_Salir.setOnAction((event)->{
            v_Contenedor.getChildren().clear();
        });
        v_Contenedor.getChildren().addAll(ta_Acercade,btn_Salir);
    return v_Contenedor;    
    }
    
// Creditos    
    public VBox Creditos(){
    
        VBox v_Contenedor = new VBox();
        TextArea ta_Creditos = new TextArea("Did by: \nNeytan Vargas Espinoza \nJason Garita Ulloa \n\nFrist Program Project \nneytanvargas400@gmial.com\n ");
        ta_Creditos.setStyle("-fx-text-fill: green");
        ta_Creditos.setMinSize(555, 420);
        ta_Creditos.setMaxSize(555, 420);
        ta_Creditos.setTranslateX(2);
        ta_Creditos.setFont(new Font("Times New Roman",25));
        Button btn_Salir = new Button("Salir");
        btn_Salir.setStyle("-fx-text-fill: White; -fx-background-color: Brown; -fx-font-size: 16px;");
        btn_Salir.setMinSize(100, 50);
        btn_Salir.setMaxSize(100, 50);
        btn_Salir.setTranslateX(230);
        ta_Creditos.setEditable(false);
        btn_Salir.setOnAction((event)->{
            v_Contenedor.getChildren().clear();
        });
        
        v_Contenedor.getChildren().addAll(ta_Creditos,btn_Salir);
    return v_Contenedor;    
    }

    //Clean all textField
    public void Limpiar() {

        tfName.setText("");
        tFLastName.setText("");
        tFID.setText("");
        lb_mensaje.setVisible(false);
    }
}
