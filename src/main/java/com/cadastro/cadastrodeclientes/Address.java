package com.cadastro.cadastrodeclientes;

public class Address {
    private String cep;
    private String street;
    private String number;
    private String city;
    private String state;

    private Buscador buscador;

    // Construtor vazio
    public Address() {
    }

    // Construtor completo
    public Address(String cep, String street, String number, String city, String state) {
        this.cep = cep;
        this.street = street;
        this.number = number;
        this.city = city;
        this.state = state;
    }

    // ====================CEP=======================
    public String getCep() {
        return cep;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }

    // ====================RUA=======================
    public String getStreet() {
        return street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    // ====================NUMERO=======================
    public String getNumber() {
        return number;
    }
    public void setNumber(String number) {
        this.number = number;
    }

    // ====================CIDADE=======================
    public String getCity() {
        return city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    // ====================ESTADO=======================
    public String getState() {
        return state;
    }
    public void setState(String state) {
        this.state = state;
    }
}