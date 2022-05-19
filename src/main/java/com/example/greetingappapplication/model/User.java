package com.example.greetingappapplication.model;

public class User {
    private String firstName;
    private String lastName;

    public User() {

    }
    public User(User user) {
        this.firstName = user.firstName;
        this.lastName = user.lastName;
    }
    public String getfirstName() {
        return firstName;
    }

    public void setfirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getlastName() {
        return lastName;
    }

    public void setlastName(String lastName) {
        this.lastName = lastName;
    }
}


