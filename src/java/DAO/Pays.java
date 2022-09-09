/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import config.Base;
import java.sql.*;

/**
 *
 * @author P14A-01-Faneva
 */
public class Pays {
    
    ///donnee
    private String nom;

    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    
    private String code;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }
    
    
    
    
    
    
    
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
    
    public Pays()
    {
        try {
            Base base =new Base();
            setStmt(base.getCon().createStatement());
            setCon(base.getCon());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    public String getNom(int indice) throws SQLException
    {
        String val="";
        try {
            String sql="select nom from pays where id="+indice;
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
    
    public String getNom(String code) throws SQLException
    {
        String val="";
        try {
            String sql="select nom from pays where code='"+code+"'";
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
    
    
    public String getCode(int indice) throws SQLException
    {
        String val="";
        try {
            String sql="select code from pays where id="+indice;
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                val=res.getString("code");    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        
        return val;
    }
    
    public String getCode(String nom) throws SQLException
    {
        String val="";
        try {
            String sql="select code from pays where nom='"+nom+"'";
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                val=res.getString("code");    
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
            String sql="select count(id) from pays";
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
