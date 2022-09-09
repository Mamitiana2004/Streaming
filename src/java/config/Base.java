/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author P14A-01-Faneva
 */
public final class Base {
    private Connection con;
    public Connection getCon() {
        return con;
    }
    public void setCon(Connection con) {
        this.con = con;
    }
    
    /** 
     *
     */
    public Base()
    {
        setCon(null);
        try {
            Class.forName("org.postgresql.Driver");
            setCon(DriverManager.getConnection("jdbc:postgresql://localhost:5432/streaming","postgres","pass"));
        } 
        catch (ClassNotFoundException | SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    
}
