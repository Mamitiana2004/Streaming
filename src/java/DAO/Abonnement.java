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
public final class Abonnement {
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
    
    public Abonnement()
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
    private Compte compte=new Compte();

    public Client getClient() {
        return client;
    }

    public Compte getCompte() {
        return compte;
    }

    
    public void setClient(Client client) {
        this.client = client;
    }

    public void setCompte(Compte compte) {
        this.compte = compte;
    }
    
    
    
    public int getAbonnementPlayer(String nom) throws SQLException
    {
        int val=0;
        String sql="select * from abonnement where idClient="+getClient().getId(nom);
        try {
            ResultSet res=getStmt().executeQuery(sql);
            while (res.next()) {
                val=res.getInt("idCompte");
            }
        } catch (SQLException e) 
        {
            
        }
        
        return val;
    }
    
    
    
    
}
