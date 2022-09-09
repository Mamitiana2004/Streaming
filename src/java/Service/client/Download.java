/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service.client;

import DAO.Abonnement;
import DAO.Connecte;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.SQLException;

/**
 *
 * @author P14A-01-Faneva
 */
public class Download {
    
    /**
     *
     * @param request
     * @param response
     * @param nom
     */
    public void download(HttpServletRequest request, HttpServletResponse response,String nom)
    {
        try {
            InputStream is;
            is = new  FileInputStream("C:\\Program Files (x86)\\Apache Software Foundation\\Tomcat 10.0\\webapps\\ROOT\\Servlet\\video\\"+nom+".mp4");
            OutputStream os;
            os = response.getOutputStream();
            
            response.setContentType("text/plain");
            response.setHeader("Content-Disposition","attachement;filename="+nom+".mp4");
            
            int count;
            byte buf[]=new byte[4096];
            while((count=is.read(buf))>-1)
            {
                os.write(buf,0,count);
            }
            is.close();
            os.close();
            
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void verification(HttpServletRequest request, HttpServletResponse response,String nom) throws IOException, SQLException{
        Connecte connecte=new Connecte();
        String nomClient=connecte.getNomClientConnecte();
        Abonnement abonnement=new Abonnement();
        int compte=abonnement.getAbonnementPlayer(nomClient);
        switch (compte) {
            case 1:
                response.sendRedirect("Abonnement.jsp");
                break;
            case 2:
                response.sendRedirect("AchatFilm.jsp");
                break;
            default:
                download(request, response, nom);
                break;
        }
    }
    
}
