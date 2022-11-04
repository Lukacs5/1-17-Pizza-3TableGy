package com.example.pizza;

public class osszRendeles {
    private int az,darab,ar;
    private String pizzanev,kategorianev,felvetel,kiszallitas;
    boolean vega;

    public osszRendeles(int az, int darab, int ar, String pizzanev, String kategorianev, String felvetel, String kiszallitas, boolean vega) {
        this.az = az;
        this.darab = darab;
        this.ar = ar;
        this.pizzanev = pizzanev;
        this.kategorianev = kategorianev;
        this.felvetel = felvetel;
        this.kiszallitas = kiszallitas;
        this.vega = vega;
    }

    public int getAz() {
        return az;
    }

    public void setAz(int az) {
        this.az = az;
    }

    public int getDarab() {
        return darab;
    }

    public void setDarab(int darab) {
        this.darab = darab;
    }

    public int getAr() {
        return ar;
    }

    public void setAr(int ar) {
        this.ar = ar;
    }

    public String getPizzanev() {
        return pizzanev;
    }

    public void setPizzanev(String pizzanev) {
        this.pizzanev = pizzanev;
    }

    public String getKategorianev() {
        return kategorianev;
    }

    public void setKategorianev(String kategorianev) {
        this.kategorianev = kategorianev;
    }

    public String getFelvetel() {
        return felvetel;
    }

    public void setFelvetel(String felvetel) {
        this.felvetel = felvetel;
    }

    public String getKiszallitas() {
        return kiszallitas;
    }

    public void setKiszallitas(String kiszallitas) {
        this.kiszallitas = kiszallitas;
    }

    public boolean isVega() {
        return vega;
    }

    public void setVega(boolean vega) {
        this.vega = vega;
    }
}
