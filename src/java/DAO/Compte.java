/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import config.Base;
import config.BaseModel;
import java.sql.*;

/**
 *
 * @author P14A-01-Faneva
 */
public class Compte extends BaseModel{
     
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
    
    public Compte()
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
    private int prix;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getPrix() {
        return prix;
    }

    public void setPrix(int prix) {
        this.prix = prix;
    }
    
    
    
    public String getNom(int indice) throws SQLException
    {
        String val="";
        try {
            String sql="select nom from compte where id="+indice;
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                val=res.getString("nom");    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return val;
    }
    
    public int getPrix(int indice) throws SQLException
    {
        int val=0;
        try {
            String sql="select prix from compte where id="+indice;
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                val=res.getInt("prix");    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return val;
    }
    
    public int getPrix(String nom) throws SQLException
    {
        int val=0;
        try {
            String sql="select prix from compte where nom='"+nom+"'";
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                val=res.getInt("prix");    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return val;
    }
    
    
    public int count() throws SQLException
    {
        int val=0;
        try {
            String sql="select count(id) from compte";
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                val=res.getInt(1);    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return val;
    }
    
    

    
}

