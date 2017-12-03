package com.thc.code.userpanelapi.domain;

public class User extends Person {

    private int userNumber;

    public User() { super(); }
    public User(int userNumber) {
        super();
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
