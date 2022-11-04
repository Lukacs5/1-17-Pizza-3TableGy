package com.example.pizza;

public class Komment {
    private int id;
    private String felhNev,email,szoveg;

    public Komment() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFelhNev() {
        return felhNev;
    }

    public void setFelhNev(String felhNev) {
        this.felhNev = felhNev;
    }

    public String getSzoveg() {
        return szoveg;
    }

    public void setSzoveg(String szoveg) {
        this.szoveg = szoveg;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
