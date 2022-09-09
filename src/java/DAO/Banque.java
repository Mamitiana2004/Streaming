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
public final class Banque extends BaseModel{
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
    
    public Banque()
    {
        try {
            Base base =new Base();
            setStmt(base.getCon().createStatement());
            setCon(base.getCon());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    
   private Client client=new Client();
   private  String numero;
   private String code;
   private int cash;

    public Client getClient() {
        return client;
    }

    public String getNumero() {
        return numero;
    }
    
    public String getNumero(String nom) throws SQLException
    {
        String val="";
        try {
            String sql="select numero from banque where idClient="+getClient().getId(nom);
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                val=res.getString("numero");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return val;
    }

    public String getCode() {
        return code;
    }
    
    public String getCode(String nom) throws SQLException
    {
        String val="";
        try {
            String sql="select code from banque where idClient="+getClient().getId(nom);
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                val=new Saisie().decrypter(res.getString("code"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return val;
    }
    

    public int getCash() {
        return cash;
    }
    
    
    public int getCash(String nom) throws SQLException
    {
        int val=0;
        try {
            String sql="select cash from banque where idClient="+getClient().getId(nom);
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                val=res.getInt("cash");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return val;
    }
   
    public void inscription(String nom,String numero,String code) throws SQLException{
        int idClient=getClient().getId(nom);
        String sql="insert into banque(idClient,numero,code,cash) values ("+idClient+",'"+numero+"','"+new Saisie().crypter(code)+"',100000)";
        try {
            getStmt().executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void payement(String nom,int prix) throws SQLException
    {
        int reste=getCash(nom)-prix;
        String sql="update banque set cash="+reste+" where idClient="+getClient().getId(nom);
        getStmt().executeQuery(sql);
    }
    
  
   
    
}
