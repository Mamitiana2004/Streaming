/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.admin;

import java.io.IOException;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class Publier extends HttpServlet {


   
    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String nom=request.getParameter("nom");
        Part video=request.getPart("video");
        Part image=request.getPart("image");
        String auteur=request.getParameter("auteur");
        String dateSortie=request.getParameter("dateSortie");
        int cat=Integer.parseInt(request.getParameter("cat"));
        int prix=Integer.parseInt(request.getParameter("prix"));
        PrintWriter out=response.getWriter();
        String[] extensionVideo=video.getContentType().split("/");
        String[] extensionImage=image.getContentType().split("/");
        String nomModif=nom.replaceAll("'", "_");
        boolean formatVideo=false;
        boolean formatImage=false;
        if(extensionVideo[0].compareTo("video")==0)
        {
            formatVideo=true;
            
            
        }
        
        if(extensionImage[0].compareTo("image")==0)
        {
            formatImage=true;
            
        }
        
        
        if(formatImage)
        {
            if(formatVideo)
            {
                video.write(nomModif+".mp4");
                image.write(nomModif+".jpg");
                try {
                    new Service.admin.UploadVideo().stocker(nomModif, cat,prix,auteur,dateSortie);
                } catch (SQLException ex) {
                    Logger.getLogger(Publier.class.getName()).log(Level.SEVERE, null, ex);
                }
                response.sendRedirect("Acceuil.jsp");
            }
            else{
                response.sendRedirect("Publier.jsp?error=Format incompatible (Video)");
            }
        }
        else if(!formatImage){
            response.sendRedirect("Publier.jsp?error=Format incompatible (Image)");
        }
        
        
       
        
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
