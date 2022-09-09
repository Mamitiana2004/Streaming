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
public final class Connecte {
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
    
    public Connecte()
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

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    public void clientConnecte(String nom) throws SQLException
    {
        String sql="insert into connecte values ("+getClient().getId(nom)+")";
        try {
            getStmt().executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
    }
    
    public boolean hasConnecte() throws SQLException
    {
       boolean val=false;
       String sql="select count(*) as nbrConnecte from connecte";
        try {
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                if(res.getInt("nbrConnecte")>0)
                {
                    val=true;
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        
       return val;
    }
    
    public String getNomClientConnecte() throws SQLException
    {
        String val="";
        String sql="select * from connecte";
        try {
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next()) {
                val=getClient().getNom(res.getInt("idClient"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return val;
    }
    
    public void removeClient(String nom) throws SQLException
    {
        String sql="delete from connecte where idClient="+getClient().getId(nom);
        try {
            getStmt().executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        finally{
            closeConnection(); 
        }
    }
}
