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
public final class Commentaire extends BaseModel{
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
    
    public Commentaire()
    {
        try {
            Base base =new Base();
            setStmt(base.getCon().createStatement());
            setCon(base.getCon());
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    private Film film=new Film();

    public Film getFilm() {
        return film;
    }
    
     public int count(int id)
    {
        int val=0;
        try {
            String sql="select count(id) from commentaire where idFilm="+id;
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
    
    
    public String afficheCommentaire(int idFilm) throws SQLException{
        String val="";
        Client client=new Client();
        String sql="select * from commentaire";
        try {
            
            if(count(idFilm)==0)
            {
                val="<p>Aucun commentaire</p>";
            }
            else{
                ResultSet res=getStmt().executeQuery(sql);
                while(res.next())
                {
                    val=val+"<h3>"+client.getNom(res.getInt("idClient"))+"</h3>";
                    val=val+"<p>"+res.getString("commentaire")+"</p><p>Date :"+res.getString("datecommentaire")+"</p></li>";
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return val;
    }
    
    
    
}
