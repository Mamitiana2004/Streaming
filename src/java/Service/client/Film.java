/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.client;

import DAO.Categorie;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author P14A-01-Faneva
 */
public class Film {
    private DAO.Film film =new DAO.Film();
    private Categorie categorie=new Categorie();
   
    public DAO.Film getFilm() {
        return film;
    }

    public void setFilm(DAO.Film film) {
        this.film = film;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
    
    
    
    public String listeFilm(int cat) throws SQLException
    {
        String val="<div class=\"row\">";
        String link="";
        try {
            String sql="select * from film where idCategorie="+cat;
            ResultSet res =film.getStmt().executeQuery(sql);
            while(res.next())
            {
                val=val+"<div class=\"col-md-5\">";
                link="Regarder.jsp?idFilm="+res.getInt("id");
                val=val+"<div><h3>"+res.getString("nomFilm").replaceAll("_", " ")+"</h3><p>Categorie :"+getCategorie().getNom(cat)+"</p><a href=\""+link+"\"><button>Regarder</button></a></div>";
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        val=val+"</div>";
        return val;
    }
}
