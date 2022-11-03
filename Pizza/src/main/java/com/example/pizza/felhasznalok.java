package com.example.pizza;


public class felhasznalok {

    private int id;
    private String felh,jelsz,email;
    private boolean admin;


    public felhasznalok(int id, String felh, String jelsz, String email, boolean admin) {
        this.id = id;
        this.felh = felh;
        this.jelsz = jelsz;
        this.email = email;
        this.admin = admin;
    }
    public felhasznalok() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFelh() {
        return felh;
    }

    public void setFelh(String felh) {
        this.felh = felh;
    }

    public String getJelsz() {
        return jelsz;
    }

    public void setJelsz(String jelsz) {
        this.jelsz = jelsz;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }
}
