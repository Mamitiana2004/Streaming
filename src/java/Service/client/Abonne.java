/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.client;
import jakarta.servlet.http.*;
import java.io.IOException;
import DAO.Abonnement;
import DAO.Connecte;
import config.DateTime;
import java.sql.SQLException;
import java.util.Date;
public class Abonne {
    
    public void abonnement(HttpServletResponse response,String nom,int idCompte) throws SQLException
    {
        String sql=" ";
        Abonnement abonnement=new Abonnement();
        Connecte connecte=new Connecte();
        try {
            if(idCompte==1)
            {
                sql="insert into abonnement(idClient,idCompte,datePaiement,nbrMois) values ("+abonnement.getClient().getId(nom)+","+idCompte+",'"+new DateTime().convert(new Date())+"',2)";
                try {
                    abonnement.getStmt().executeQuery(sql);
                } 
                catch (SQLException ex) {
                     System.out.println(ex.getMessage());
                }
                connecte.clientConnecte(nom);
                response.sendRedirect("Acceuil.jsp");
            }
            else{
                response.sendRedirect("Payement.jsp?compte="+idCompte);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    public void abonnementPayer(HttpServletResponse response,String nom,int idCompte,int nbrMois) throws SQLException 
    {
        String sql=" ";
        Abonnement abonnement=new Abonnement();
        Connecte connecte=new Connecte();
        sql="insert into abonnement(idClient,idCompte,datePaiement,nbrMois) values ("+abonnement.getClient().getId(nom)+","+idCompte+",'"+new DateTime().convert(new Date())+"',"+nbrMois+")";
        try {
            abonnement.getStmt().executeQuery(sql);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            abonnement.closeConnection();
        }
        connecte.clientConnecte(nom);
        try {
            response.sendRedirect("Acceuil.jsp");
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        finally{
            abonnement.closeConnection();
        }
    }
    
    
}
