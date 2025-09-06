package com.cadastro.cadastrodeclientes;

import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.scene.control.*;

import java.io.IOException;

import javafx.scene.control.cell.PropertyValueFactory;
import org.controlsfx.control.tableview2.filter.filtereditor.SouthFilter;

import java.io.IOException;
import java.util.ArrayList;

public class HelloController {
    //@FXML private Label welcomeText;
    @FXML private TextField name;
    @FXML private TextField street;
    @FXML private TextField cep;
    @FXML private TextField state;
    @FXML private TextField number;
    @FXML private TextField phone_number;
    @FXML private TextField city;
    // ====================Table=======================
    @FXML private TableView<Clients> clientsTableView;
    @FXML private TableColumn<Clients, Integer> codeColumn;
    @FXML private TableColumn<Clients, String> nameColumn;
    @FXML private TableColumn<Clients, String> cityColumn;
    @FXML private TableColumn<Clients, String> stateColumn;
    @FXML private TableColumn<Clients, String> phone_NumberColumn;

    private Buscador buscador;
    private ArrayList<Clients> clientsList;


    @FXML
private void initialize(){
        this.buscador = new Buscador();
        this.clientsList = new ArrayList<>();
        clientsList = new ArrayList<>();// Sem o <> ?
        codeColumn.setCellValueFactory(new PropertyValueFactory<>("id"));
        nameColumn.setCellValueFactory(new PropertyValueFactory<>("name"));
        phone_NumberColumn.setCellValueFactory(new PropertyValueFactory<>("phone_number"));

        cityColumn.setCellValueFactory(cid -> {
            return new SimpleStringProperty(cid.getValue().getEndereco().getCity());
        });



}
// ====================CheckCep=======================
    @FXML
private void checkCep(){
        String cepText = cep.getText();
        try {
            Address foundAddress = buscador.buscar(cepText);

            street.setText(foundAddress.getStreet());
            city.setText(foundAddress.getCity());
            state.setText(foundAddress.getState());
        }
        /*catch (IllegalAccessException e){
            System.out.println("Cep incorreto!");
        }*/
        catch (IOException e){
            System.err.println("Cep incorreto");
        }
}
// ====================RegisterClient=======================
    @FXML
    private void registerClient(){
        if (name.getText().isEmpty()) {
            return;
        }

        Address newAddress = new Address(
                cep.getText(),
                street.getText(),
                number.getText(),
                city.getText(),
                state.getText()
        );
        Clients newClient = new Clients(
                name.getText(),
                newAddress,
                phone_number.getText()
        );
        clientsList.add(newClient);
        clientsTableView.setItems(FXCollections.observableArrayList(clientsList));
    }

    }