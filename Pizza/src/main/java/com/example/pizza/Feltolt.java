package com.example.pizza;

import java.sql.*;
import java.util.ArrayList;

public class Feltolt {
    private Connection cn;

    public Feltolt(String url) {
        try {
            cn = DriverManager.getConnection(url);
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

    public ArrayList<pizza> getAllPizza()
    {
        ArrayList<pizza> list = new ArrayList<pizza>();
        try
        {
            Statement st = cn.createStatement();
            ResultSet res = st.executeQuery("Select * from pizza");
            while(res.next())
            {
                String nev = res.getString("nev");
                String knev = res.getString("kategorianev");
                Boolean vega = res.getBoolean("vegetarianus");
                pizza c = new pizza(nev,knev,vega);
                list.add(c);
            }
            return list;
        }
        catch (SQLException e)
        {
            System.out.println(e);
            return list;
        }
    }
    public ArrayList<kategoria> getAllKategoria()
    {
        ArrayList<kategoria> list = new ArrayList<kategoria>();
        try
        {
            Statement st = cn.createStatement();
            ResultSet res = st.executeQuery("Select * from kategoria");
            while(res.next())
            {
                String nev = res.getString("nev");
                int ar = res.getInt("ar");
                kategoria c = new kategoria(nev,ar);
                list.add(c);
            }
            return list;
        }
        catch (SQLException e)
        {
            System.out.println(e);
            return list;
        }
    }
    public ArrayList<rendeles> getAllRendeles()
    {
        ArrayList<rendeles> list = new ArrayList<rendeles>();
        try
        {
            Statement st = cn.createStatement();
            ResultSet res = st.executeQuery("Select * from rendeles");
            while(res.next())
            {
                int id = res.getInt("az");
                String nev = res.getString("pizzanev");
                String fel = res.getString("felvetel");
                String ki = res.getString("kiszallitas");
                int db = res.getInt("darab");
                rendeles c = new rendeles(id,db,nev,fel,ki);
                list.add(c);
            }
            return list;
        }
        catch (SQLException e)
        {
            System.out.println(e);
            return list;
        }
    }


}
