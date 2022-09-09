    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.client;


import DAO.Client;
import config.Saisie;
import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;

public class Sign {
    
    public void inscritpion(HttpServletResponse response,HttpSession session,String nom,String mdp,String genre,String dateN,int paysId,String numero,String code) throws IOException, SQLException
    {
        Client client=new Client();
        String sql="";
        if(client.exist(nom))
        {
            response.sendRedirect("Inscription.jsp?error=Ce compte existe deja&type=nom");
        }
        else if(!client.ageAcceptable(dateN))
        {
            response.sendRedirect("Inscription.jsp?error=Age minimum requis : +16 ans&type=age");
        }
        else{
            sql="insert into client(nom,password,genre,dateNaissance,idPays) values ('"+nom+"','"+new Saisie().crypter(mdp)+"','"+genre+"','"+dateN+"',"+paysId+")";
            try {
               client.getStmt().executeQuery(sql);
            } 
            catch (SQLException e) {
                System.out.println(e.getMessage());
            }
            session.setAttribute("nom",nom);
            new DAO.Banque().inscription(nom, numero, code);
            response.sendRedirect("Abonnement.jsp");
        }
            
    }
    
}
