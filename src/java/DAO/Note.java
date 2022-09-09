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
public final class Note {
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
    
    public Note()
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
    
    private Client client =new Client();

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
    
    private int note;

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }
    
    
    public int getNoteMax(int idFilm) throws SQLException
    {
        int val=0;
        String sql="select max(note) as note_max from note where idFilm="+idFilm;
        try {
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                val=res.getInt("note_max");
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        return val;
    }
    
    public boolean hasNote(int idFilm,int idClient) throws SQLException
    {
        boolean val=false;
        int count=0;
        String sql="select count(*) as nbr from note where idClient="+idClient+" and idFilm="+idFilm;
        try {
            ResultSet res=getStmt().executeQuery(sql);
            while(res.next())
            {
                count=res.getInt("nbr");
            }
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
        if(count>0)
        {
            val=true;
        }
        return val;
    }
    
    
    
    
}
