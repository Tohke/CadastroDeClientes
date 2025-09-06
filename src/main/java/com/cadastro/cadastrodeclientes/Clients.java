package com.cadastro.cadastrodeclientes;

public class Clients {
    private static int counter = 1;
    private final Integer id;
    private String name;
    private Address address;
    private String phone_number;

    // Construtor vazio
    public Clients() {
        this.id = counter++;
    }

    // Construtor Cheio
    public Clients(String name, Address address, String phone_number) {
        this.id = counter++;
        this.name = name;
        this.address = address;
        this.phone_number = phone_number;
    }

    // ====================CÓDIGO=======================
    public Integer getId() {
        return id;
    }


    // ====================NOME=======================
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // ====================ENDEREÇO=======================
    public Address getEndereco() {
        return address;
    }

    public void setEndereco(Address address) {
        this.address = address;
    }

    // ====================TELEFONE=======================
    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }
}