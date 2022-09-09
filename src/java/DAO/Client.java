/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import config.Base;
import config.BaseModel;
import config.Saisie;
import java.sql.*;

/**
 *
 * @author P14A-01-Faneva
 */
public class Client extends BaseModel{
        
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
    
    public Client()
    {
        try {
            Base base =new Base();
            setStmt(base.getCon().createStatement());
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    public Client(String nom)
    {
        try {
            Base base =new Base();
            setStmt(base.getCon().createStatement());
            setNom(nom);
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }
    
    
    //donnee
    private String nom;
    private String password;
    private String genre;
    private String dateNaissance;
    Pays pays =new Pays();
    private String nomPays;
    
    //get

    public String getNom() {
        return nom;
    }

    public String getPassword() {
        return password;
    }
    
    

    public String getGenre() {
        return genre;
    }

    public String getDateNaissance() {
        return dateNaissance;
    }

    public String getNomPays() {
        return nomPays;
    }

   
    
    //set

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setDateNaissance(String dateNaissance) {
        this.dateNaissance = dateNaissance;
    }

    public void setNomPays(String nomPays) {
        this.nomPays = nomPays;
    }

    public int getId(String nom) throws SQLException
    {
        int val=0;
        try {
            String sql="select id from client where nom='"+nom+"'";
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                val=res.getInt("id");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return val;
    }
    
    public String getNom(int id) throws SQLException
    {
        String val="";
        try {
            String sql="select nom from client where id="+id;
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                val=res.getString("nom");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        return val;
    }
    
    

    
    
    
    public boolean exist(String nom) throws SQLException
    {
        boolean val=false;
        try {
            String sql="select nom from client";
            ResultSet res=getStmt().executeQuery(sql);
            String reponse;
            while (res.next())
            {
                reponse = res.getString("nom");
                if(reponse.compareToIgnoreCase(nom)==0)
                {
                    val=true;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        return val;
    }
    
    
    
    //get amin alalan nom
    
    public String getPassword(String nom)
    {
        String val="";
        try {
            String sql="select password from client where nom='"+nom+"'";
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                val=new Saisie().decrypter(res.getString("password"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return val;
    }

    public String getGenre(String nom) throws SQLException
    {
        String val="";
        try {
            String sql="select genre from client where nom='"+nom+"'";
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                val=res.getString("genre");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        return val;
    }

    
    
    public String getDateNaissance(String nom) throws SQLException
    {
        String val="";
        try {
            String sql="select dateNaissance from client where nom='"+nom+"'";
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                val=res.getString("dateNaissance");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        return val;
    }
    
    public String getNomPays(String nom) throws SQLException
    {
        String val="";
        int id=0;
        try {
            String sql="select idPays from client where nom='"+nom+"'";
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                id=res.getInt("idPays");
            }
            val=pays.getNom(id);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
        return val;
    }
    
    public boolean ageAcceptable(String date)
    {
        boolean val=false;
        String[] dateSplit=date.split("-");
        int year=Integer.parseInt(dateSplit[0]);
        int age=2022-year;
        if(age>=16)
        {
            val=true;
        }
        return val;
    }
    
   
   
}
