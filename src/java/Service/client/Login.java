/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.client;

/**
 *
 * @author P14A-01-Faneva
 */

import DAO.Client;
import DAO.Connecte;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

public class Login {
    
    public void verification(HttpServletResponse response,String nom,String mdp) throws IOException, SQLException
    {
        Client client=new Client();
        Connecte connecte=new Connecte();
        if(client.exist(nom))
        {
            if(client.getPassword(nom).compareTo(mdp)==0)
            {
                connecte.clientConnecte(nom);
                response.sendRedirect("Acceuil.jsp");
            }
            else{
                response.sendRedirect("Login.jsp?error=Mot de passe incorrect&type=2");
            }
        }
        else{
            response.sendRedirect("Login.jsp?error=Compte inexistant&type=1");
        }
    }
    
}
