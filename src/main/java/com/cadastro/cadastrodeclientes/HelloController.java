package com.cadastro.cadastrodeclientes;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML private Label welcomeText;
    @FXML private TextField name;
    @FXML private TextField street;
    @FXML private TextField cep;
    @FXML private TextField state;
    @FXML private TextField number;
    @FXML private TextField phone_number;
    @FXML private TextField city;

    private Address address;
    private Clients clients;
    private Buscador buscador;


    @FXML
private void Initialize(){

        //helloApplication = new HelloApplication(); // Ou é address ou clients


}
// ====================TEST=======================
    @FXML
    private void handleData(){
            //Try & Catch
                String textName = clients.getName();
                String textCep = address.getCep();
                String textCity = address.getCity();
                String textState = address.getState();
                String textNumber = address.getNumber();
                String textPhone_Number = clients.getPhone_number();

    }


    }