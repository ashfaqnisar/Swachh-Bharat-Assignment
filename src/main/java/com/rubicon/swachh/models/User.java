package com.rubicon.swachh.models;

public class User {
    private String name;
    private String email;
    private Long number;
    private String address;

    public User() {
    }

    User(String email, Long number) {
        this.email = email;
        this.number = number;
    }

    User(String name, String email, String address, long number) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "\nUser Information: " + "\n\t" +
                "Name: " + getName() + "\n\t\t" +
                getAddress() + "\n\t\t" +
                getEmail() + "\n\t\t" +
                getNumber();
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
