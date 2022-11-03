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

}
