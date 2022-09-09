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
public class Sign extends HttpServlet {

    

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
        String pass=request.getParameter("pass");
        String genre=request.getParameter("genre");
        String dateNaissance =request.getParameter("dateN");
        String pays=request.getParameter("pays");
        String numero=request.getParameter("numero");
        String code=request.getParameter("code");
        HttpSession session =request.getSession();
        
        int paysId=Integer.parseInt(pays);
        try {
            new Service.client.Sign().inscritpion(response,session, nom, pass, genre, dateNaissance,paysId,numero,code);
        } catch (SQLException ex) {
            Logger.getLogger(Sign.class.getName()).log(Level.SEVERE, null, ex);
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
