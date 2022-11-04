 package com.example.pizza;

public class rendeles {
    private int id,db;
    private String pizzaNev,fel,ki;

    public rendeles(int id, int db, String pizzaNev, String fel, String ki) {
        this.id = id;
        this.db = db;
        this.pizzaNev = pizzaNev;
        this.fel = fel;
        this.ki = ki;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getDb() {
        return db;
    }

    public void setDb(int db) {
        this.db = db;
    }

    public String getPizzaNev() {
        return pizzaNev;
    }

    public void setPizzaNev(String pizzaNev) {
        this.pizzaNev = pizzaNev;
    }

    public String getFel() {
        return fel;
    }

    public void setFel(String fel) {
        this.fel = fel;
    }

    public String getKi() {
        return ki;
    }

    public void setKi(String ki) {
        this.ki = ki;
    }

    @Override
    public String toString() {
        return "rendeles{" +
                "id=" + id +
                ", db=" + db +
                ", pizzaNev='" + pizzaNev + '\'' +
                ", fel='" + fel + '\'' +
                ", ki='" + ki + '\'' +
                '}';
    }
}
