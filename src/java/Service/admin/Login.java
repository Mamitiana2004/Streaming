/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.admin;

import DAO.Admin;

/**
 *
 * @author P14A-01-Faneva
 */

import jakarta.servlet.http.*;
import java.io.IOException;
import java.sql.SQLException;
public class Login {
    
    public void Verification(HttpServletResponse response, String nom,String password) throws IOException, SQLException
    {
        Admin admin=new Admin();
        if(nom.compareTo(admin.getNom())==0)
        {
            if(password.compareTo(admin.getPassword())==0)
            {
                response.sendRedirect("Acceuil.jsp");
            }
            else{
                response.sendRedirect("Login.jsp?error=Mot de passe incorrect");
            }
        }
        else{
            response.sendRedirect("Login.jsp?error=Connection refuse");
        }
    }
}
