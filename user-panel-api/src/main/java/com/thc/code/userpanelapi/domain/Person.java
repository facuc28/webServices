package com.thc.code.userpanelapi.domain;

public class Person {

    private String name;
    private String middleName;
    private String lastName;
    private String phoneNumber;
    private String address;
    private String nick;


    @Override
    public String toString() {
        return "Name: "+ name + "Last Name: " + lastName + "Phone Number: " + phoneNumber +
        "Adress: " + address + "Nick: " + nick;
    }

    public Person() {}

    public Person(String name, String middleName, String lastName, String phoneNumber, String address, String nick) {
        this.name = name;
        this.middleName = middleName;
        this.lastName = lastName;
        this.phoneNumber = phoneNumber;
        this.address = address;
        this.nick = nick;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick;
    }

}
