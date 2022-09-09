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
public final class Film extends BaseModel{
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
    
    public Film()
    {
        try {
            Base base =new Base();
            setStmt(base.getCon().createStatement());
            setCon(base.getCon());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    private Categorie categorie=new Categorie();
    
    private String nom;

    

    public String getNom() {
        return nom;
    }
    
    public String getNom(int indice) throws SQLException
    {
        String val="";
        try {
            String sql="select nomFilm from film where id="+indice;
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                val=res.getString("nomFilm");    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }finally{
            closeConnection();
        }
        return val;
    }

    public Categorie getCategorie() {
        return categorie;
    }
    
    
    
    public int getCategorie(String nom) throws SQLException
    {
        int val=0;
        try {
            String sql="select idCategorie from film where nomFilm='"+nom+"'";
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                val=res.getInt("idCategorie");    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        finally{
            closeConnection();
        }
        return val;
    }
    
    
    
     public int count() throws SQLException
    {
        int val=0;
        try {
            String sql="select count(id) from film";
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                val=res.getInt(1);    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        finally{
            closeConnection();
        }
        return val;
    }
     
     public int max() throws SQLException
    {
        int val=0;
        try {
            String sql="select max(id) from film";
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                val=res.getInt(1);    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        finally{
            closeConnection();
        }
        return val;
    }
     
     
    public int getId(String nom) throws SQLException
    {
        int val=0;
        try {
            String sql="select id from film where nomFilm='"+nom+"'";
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                val=res.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
         
            closeConnection();
        }
        return val;
    }
    
    
    private int note;

    public int getNote(int id) throws SQLException {
        int val=0;
        try {
            String sql="select note from film where id="+id;
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next())
            {
                val=res.getInt("note");    
            }
        } 
        catch (SQLException e) {
            System.err.println(e.getMessage());
        }
        finally{
            closeConnection();
        }
        return val;
    }
   
   
    
    
    
}
