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

    public void insertUser(felhasznalok a)
    {
        try
        {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("Select Count(*) From felhasznalok");
            rs.next();
            int id = (rs.getInt(1) + 1);
            st.execute("Insert into felhasznalok Values ("+id+",'"+a.getFelh()+"','"+a.getJelsz()+"','"+a.getEmail()+"',False)");
        }catch (SQLException e)
        {
            System.out.println(e);
        }
    }
    public felhasznalok Login(felhasznalok a)
    {
        try
        {
            Statement st = cn.createStatement();
            ResultSet res = st.executeQuery("Select * from felhasznalok where felh = '"+a.getFelh()+"' and jelsz = '"+a.getJelsz()+"'");
            res.next();
            int id = res.getInt("id");
            String email = res.getString("email");
            boolean amdin = res.getBoolean("admin");
            felhasznalok c = new felhasznalok(id,a.getFelh(),a.getJelsz(),email,amdin);

            return c;
        }
        catch (SQLException e)
        {
            System.out.println(e);
            return null;
        }
    }
    public  ArrayList<osszRendeles> Rendelesek()
    {
        ArrayList<osszRendeles> rend = new ArrayList<>();
        try
        {
            Statement st = cn.createStatement();
            ResultSet res = st.executeQuery("SELECT rendeles.az,rendeles.darab,rendeles.pizzanev,kategoria.nev,pizza.vegetarianus,(kategoria.ar*rendeles.darab) as ar,rendeles.felvetel,rendeles.kiszallitas FROM (rendeles inner join pizza on pizza.nev = rendeles.pizzanev) inner join kategoria on kategoria.nev = pizza.kategorianev;");
            while(res.next())
            {
                int az = res.getInt("az");
                int db = res.getInt("darab");
                String pnev = res.getString("pizzanev");
                String knev = res.getString("nev");
                boolean vega = res.getBoolean("vegetarianus");
                int ar = res.getInt("ar");
                String fel = res.getString("felvetel");
                String ki = res.getString("kiszallitas");
                osszRendeles rendeles =new osszRendeles(az,db,ar,pnev,knev,fel,ki,vega);
                rend.add(rendeles);
            }
            return rend;
        }
        catch (SQLException e)
        {
            System.out.println(e);
            return null;
        }


    }
    public void insertKomm(Komment a) {
        try {
            Statement st = cn.createStatement();
            ResultSet rs = st.executeQuery("Select Count(*) From komment");
            rs.next();
            int id = (rs.getInt(1) + 1);
            st.execute("Insert into komment Values (" + id + ",'" + a.getFelhNev() +"','"+a.getEmail() + "','" + a.getSzoveg() + "','" + a.getDatum() + "')");
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
    public  ArrayList<Komment> getKomments()
    {
        ArrayList<Komment> kommentek = new ArrayList<>();
        try
        {
            Statement st = cn.createStatement();
            ResultSet res = st.executeQuery("SELECT * FROM komment");
            while(res.next())
            {
                int id = res.getInt("id");
                String felhNev = res.getString("felhNev");
                String email = res.getString("email");
                String szoveg = res.getString("szoveg");
                String datum = res.getString("datum");
                Komment komm = new Komment(id,felhNev,email,szoveg,datum);
                kommentek.add(komm);
            }
            return kommentek;
        }
        catch (SQLException e)
        {
            System.out.println(e);
            return null;
        }


    }

}
