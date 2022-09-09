/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.client;

import DAO.Commentaire;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 *
 * @author P14A-01-Faneva
 */
public class Commenter {
    
    
    public void commentaire(HttpServletResponse response,int idFilm,int idClient,String date,String commentaire) throws IOException, SQLException
    {
        Commentaire coms=new Commentaire();
        String sql="insert into commentaire(idFilm,idClient,dateCommentaire,commentaire) values ("+idFilm+","+idClient+",'"+date+"','"+commentaire+"')";
        try {
            coms.getStmt().executeQuery(sql);
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        response.sendRedirect("Regarder.jsp?idFilm="+idFilm);
    }
    
}
