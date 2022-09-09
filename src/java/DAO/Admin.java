/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import config.Base;
import config.Saisie;
import java.sql.*;

/**
 *
 * @author P14A-01-Faneva
 */
public final class Admin {
    private Statement stmt;
	private Connection con;
	public void setCon(Connection connection)
	{
		this.con=connection;
	}
	public Connection getCon()
	{
		return con;
	}
	public Statement getStmt() {
        return stmt;
    }
    public void setStmt(Statement stmt) {
        this.stmt = stmt;
    }
    public void closeConnection()throws SQLException{
    	getCon().close();
    }
    
    public Admin()
    {
        try {
            Base base =new Base();
            setStmt(base.getCon().createStatement());
            setCon(base.getCon());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    //donnee
    private String nom;
    private String password;

    public String getNom() throws SQLException
    {
        try {
            String sql="select nom from admin where id=1";
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                nom=res.getString("nom");    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return nom;
    }

    public String getPassword() throws SQLException {
        try {
            String sql="select password from admin where id=1";
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                password=res.getString("password");    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return password;
    }
    

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    
    
}
