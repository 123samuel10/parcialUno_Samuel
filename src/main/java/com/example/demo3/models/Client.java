package com.example.demo3.models;

public class Client extends Person{
    private int password;
    private String mail;

    public Client(String name, String age,String  mail,int password) {
        super(name, age);
        this.mail=mail;
        this.password=password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
