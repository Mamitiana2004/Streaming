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
public class InfoFilm extends BaseModel{
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
    
    public InfoFilm()
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

    public void setFilm(Film film) {
        this.film = film;
    }
    
    private String auteur;

    public String getAuteur() {
        return auteur;
    }

    public void setAuteur(String auteur) {
        this.auteur = auteur;
    }
    
    
    public String getAuteur(int idFilm) throws SQLException
    {
        String val="";
        try {
            String sql="select auteur from film_info where idFilm="+idFilm;
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                val=res.getString("auteur");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return val;
    }
    
    
}
