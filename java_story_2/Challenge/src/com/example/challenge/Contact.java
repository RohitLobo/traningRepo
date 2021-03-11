package com.example.challenge;

public class Contact{
    String name;
    String tel;
    String email;

    public Contact(String name, String tel, String email) {
        this.name = name;
        this.tel = tel;
        this.email = email;
    }

    public String getDetails(){
        return ("Name: " + getName()+"\nTel: " + getTel() + "\nEmail: " + getEmail());

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}