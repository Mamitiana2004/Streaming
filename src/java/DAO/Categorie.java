/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import config.*;
import java.sql.*;

/**
 *
 * @author P14A-01-Faneva
 */
public class Categorie extends BaseModel{
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
    
    public Categorie()
    {
        try {
            Base base =new Base();
            setStmt(base.getCon().createStatement());
            setCon(base.getCon());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    private String nom;

    public String getNom(int id) throws SQLException {
        String val="";
        try {
            String sql="select nom from categorie where id="+id;
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
    
     public int count() throws SQLException
    {
        int val=0;
        try {
            String sql="select count(id) from categorie";
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
