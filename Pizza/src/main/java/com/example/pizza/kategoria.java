package com.example.pizza;

public class kategoria {
    private String nev;
    private int ar;

    public kategoria(String nev, int ar) {
        this.nev = nev;
        this.ar = ar;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    @Override
    public String toString() {
        return "kategoria{" +
                "nev='" + nev + '\'' +
                ", ar=" + ar +
                '}';
    }
}
