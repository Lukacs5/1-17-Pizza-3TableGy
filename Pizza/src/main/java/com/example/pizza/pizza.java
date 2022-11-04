package com.example.pizza;

public class pizza {
    private String nev,knev;
    private Boolean vega;

    public pizza(String nev, String knev, Boolean vega) {
        this.nev = nev;
        this.knev = knev;
        this.vega = vega;
    }

    public String getNev() {
        return nev;
    }

    public void setNev(String nev) {
        this.nev = nev;
    }

    public String getKnev() {
        return knev;
    }

    public void setKnev(String knev) {
        this.knev = knev;
    }

    public Boolean getVega() {
        return vega;
    }

    public void setVega(Boolean vega) {
        this.vega = vega;
    }

    @Override
    public String toString() {
        return "pizza{" +
                "nev='" + nev + '\'' +
                ", knev='" + knev + '\'' +
                ", vega=" + vega +
                '}';
    }
}
