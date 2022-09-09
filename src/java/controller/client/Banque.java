/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.client;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P14A-01-Faneva
 */
public class Banque extends HttpServlet {

   

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     * @throws java.sql.SQLException
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        int prix=Integer.parseInt(request.getParameter("prix"));
        int nbrMois=Integer.parseInt(request.getParameter("nbrMois"));
        String numero=request.getParameter("numero");
        String code=request.getParameter("code");
        HttpSession session=request.getSession();
        try {
            new Service.client.Banque().payerAbonnement(response,(String)session.getAttribute("nom"),(int)session.getAttribute("compte"), numero, code, nbrMois, prix);
        } catch (SQLException ex) {
            Logger.getLogger(Banque.class.getName()).log(Level.SEVERE, null, ex);
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
