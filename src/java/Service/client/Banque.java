/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.client;

import jakarta.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author P14A-01-Faneva
 */
public class Banque {
    
    DAO.Banque banque=new DAO.Banque();
    
    public boolean assezCash(String nom,int prix) throws SQLException{
        boolean val=false;
        if(banque.getCash(nom)>=prix)
        {
            val=true;
        }
        return val;
    }
    
    public boolean numeroExist(String nom,String numero) throws SQLException
    {
        boolean val=false;
        if(banque.getNumero(nom).compareTo(numero)==0)
        {
            val=true;
        }
        return val;
    }
    
    public void payerAbonnement(HttpServletResponse response,String nom,int compte,String numero,String code,int nbrMois,int prix) throws IOException, SQLException
    {
        int prixPayer=prix*nbrMois;
        if(!assezCash(nom, prixPayer))
        {
            response.sendRedirect("Payement.jsp?error=Vous avez pas assez d'argent dans votre compte bancaire");
        }
        else if(!numeroExist(nom, numero)) 
        {
            response.sendRedirect("Payement.jsp?error=Desolé ce compte bancaire n'existe pas ou n'est pas le votre");
        }
        else{
            if(banque.getCode(nom).compareTo(code)!=0)
            {
                response.sendRedirect("Payement.jsp?error=Code incorrect");
            }
            else{
                PrintWriter out=response.getWriter();
                banque.payement(nom, prixPayer);
                new Service.client.Abonne().abonnementPayer(response, nom,compte,nbrMois);
            }
        }
        
    }
    
    
    
    
}
