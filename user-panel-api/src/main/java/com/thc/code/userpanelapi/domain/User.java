package com.thc.code.userpanelapi.domain;

public class User extends Person {

    private int userNumber;

    public User() { super(); }
    public User(int userNumber, String name, String middleName, String lastName, String phoneNumber, String address, String nick) {
        super(name, middleName,lastName,phoneNumber, address, nick);
        this.userNumber = userNumber;
    }


    public int getUserNumber() {
        return userNumber;
    }

    public void setUserNumber(int userNumber) {
        this.userNumber = userNumber;
    }

    @Override
    public String toString() {
        return "User{" +
                "userNumber=" + userNumber +
                '}';
    }
}
