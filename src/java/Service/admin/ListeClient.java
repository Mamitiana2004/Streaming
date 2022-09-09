/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.admin;

import DAO.Abonnement;
import DAO.Client;
import config.Genre;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author P14A-01-Faneva
 */
public class ListeClient {
    
    private Abonnement abonnement=new Abonnement();
    private Client client=new Client();

    public Abonnement getAbonnement() {
        return abonnement;
    }

    public Client getClient() {
        return client;
    }
    
    
    
    
    public String listeGratuit() throws SQLException
    {
        String val;
        val="<div class=\"table-responsive\">\n" +
"        <table class=\"table table-striped table-sm\">\n" +
"          <thead>\n<tr>"+
"              <th scope=\"col\">Nom du client</th>\n" +
"              <th scope=\"col\">Genre</th>\n" +
"              <th scope=\"col\">Nombre de mois (abonnement)</th>\n" +
"              <th scope=\"col\">Date de paiement(abonnement)</th>\n" +
"              <th scope=\"col\"> </th>\n" +
"            </tr>\n          </thead><tbody>";
        try {
            String sql="select * from abonnement where idCompte=1";
            ResultSet res=abonnement.getStmt().executeQuery(sql);
            while(res.next())
            {
                val=val+"<tr><td>"+getClient().getNom(res.getInt("idClient"))+"</td>";
                val=val+"<td>"+new Genre().fullName(getClient().getGenre(getClient().getNom(res.getInt("idClient"))))+"</td>";
                val=val+"<td>"+res.getString("nbrMois")+"</td>";
                val=val+"<td>"+res.getString("datepaiement")+"</td><td><a href=\"ListeClient.jsp\"><button class=\"supp btn btn-primary btn-lg\" type=\"button\">Banir</button></a></td></tr>";
            }
            val=val+"</table>";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return val;
    }
    
    public String listePrenium() throws SQLException
    {
        String val;
        val="<div class=\"table-responsive\">\n" +
"        <table class=\"table table-striped table-sm\">\n" +
"          <thead>\n<tr>"+
"              <th scope=\"col\">Nom du client</th>\n" +
"              <th scope=\"col\">Genre</th>\n" +
"              <th scope=\"col\">Nombre de mois (abonnement)</th>\n" +
"              <th scope=\"col\">Date de paiement(abonnement)</th>\n" +
"              <th scope=\"col\"> </th>\n" +
"            </tr>\n          </thead><tbody>";
        try {
            String sql="select * from abonnement where idCompte=2";
            ResultSet res=abonnement.getStmt().executeQuery(sql);
            while(res.next())
            {
                val=val+"<tr><td>"+getClient().getNom(res.getInt("idClient"))+"</td>";
                val=val+"<td>"+new Genre().fullName(getClient().getGenre(getClient().getNom(res.getInt("idClient"))))+"</td>";
                val=val+"<td>"+res.getString("nbrMois")+"</td>";
                val=val+"<td>"+res.getString("datepaiement")+"</td><td><a href=\"ListeClient.jsp\"><button class=\"supp btn btn-primary btn-lg\" type=\"button\">Banir</button></a></td></tr>";
            }
            val=val+"</tbody></table>";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return val;
    }
    
    public String listeVIP() throws SQLException
    {
        String val;
        val="<div class=\"table-responsive\">\n" +
"        <table class=\"table table-striped table-sm\">\n" +
"          <thead>\n<tr>"+
"              <th scope=\"col\">Nom du client</th>\n" +
"              <th scope=\"col\">Genre</th>\n" +
"              <th scope=\"col\">Nombre de mois (abonnement)</th>\n" +
"              <th scope=\"col\">Date de paiement(abonnement)</th>\n" +
"              <th scope=\"col\"> </th>\n" +
"            </tr>\n          </thead><tbody>";
        try {
            String sql="select * from abonnement where idCompte=3";
            ResultSet res=abonnement.getStmt().executeQuery(sql);
            while(res.next())
            {
                val=val+"<tr><td>"+getClient().getNom(res.getInt("idClient"))+"</td>";
                val=val+"<td>"+new Genre().fullName(getClient().getGenre(getClient().getNom(res.getInt("idClient"))))+"</td>";
                val=val+"<td>"+res.getString("nbrMois")+"</td>";
                val=val+"<td>"+res.getString("datepaiement")+"</td><td><a href=\"ListeClient.jsp\"><button class=\"supp btn btn-primary btn-lg\" type=\"button\">Banir</button></a></td></tr>";
            }
            val=val+"</table>";
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return val;
    }

    private void closeConnection() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
 
    
}
