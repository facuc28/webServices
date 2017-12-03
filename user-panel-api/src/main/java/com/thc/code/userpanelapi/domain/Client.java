package com.thc.code.userpanelapi.domain;

public class Client extends Person {

    private int clientNumber;

    public Client() {super();}

    public Client(int clientNumber, String name, String middleName, String lastName, String phoneNumber, String address, String nick) {
        super(name, middleName,lastName,phoneNumber, address, nick);
        this.clientNumber = clientNumber;
    }

    public int getClientNumber() {
        return clientNumber;
    }

    public void setClientNumber(int clientNumber) {
        this.clientNumber = clientNumber;
    }
}
