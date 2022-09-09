/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.client;

import DAO.Client;
import DAO.Connecte;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P14A-01-Faneva
 */
public class Noter {
    
    public void noter( HttpServletResponse response,int idFilm,int note) throws IOException, SQLException
    {
        Connecte connecte=new Connecte();
        int idClient=new Client().getId(connecte.getNomClientConnecte());
        String sql="insert into note(idFilm,idClient,note) values("+idFilm+","+idClient+","+note+")";
        
        try {
            connecte.getStmt().executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
            
        }
        getMaxNote(idFilm, note);
        response.sendRedirect("Regarder.jsp?idFilm="+idFilm);
    }
    
    public void getMaxNote(int idFilm,int note) throws SQLException
    {
        String sql="update film set note="+note+" where id="+idFilm;
        DAO.Film film=new DAO.Film();
        if(film.getNote(idFilm)<note)
        {
            try {
                film.getStmt().executeQuery(sql);
            } catch (SQLException ex) {
                Logger.getLogger(Noter.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
