/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.admin;

import DAO.Categorie;
import DAO.Film;
import java.sql.SQLException;

/**
 *
 * @author P14A-01-Faneva
 */
public class UploadVideo {
    
    public void stocker(String nom,int idcategorie,int prix,String auteur,String dateSortie) throws SQLException
    {
        String sql="insert into film(nomFilm,idCategorie,prix,note) values ('"+nom+"',"+idcategorie+","+prix+",0)";
        Film film=new Film();
        try {
            new Categorie().getStmt().executeQuery(sql);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        
         String sql2="insert into film_info(idFilm,auteur,dateSortie) values ("+film.getId(nom)+",'"+auteur+"','"+dateSortie+"')";
         try {
            new Categorie().getStmt().executeQuery(sql2);
            
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
