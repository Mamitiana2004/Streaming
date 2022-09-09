/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.client;

import DAO.Client;
import DAO.Connecte;
import config.DateTime;
import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import java.sql.SQLException;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author P14A-01-Faneva
 */
public class Commenter extends HttpServlet {


    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        int idFilm=Integer.parseInt(request.getParameter("idFilm"));
        String commentaire=request.getParameter("commentaire");
        Connecte connecte=new Connecte();
        String dateNow=new DateTime().convert(new Date());
        int idClient = 0;
        try {
            idClient = new Client().getId(connecte.getNomClientConnecte());
        } catch (SQLException ex) {
            Logger.getLogger(Commenter.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            new Service.client.Commenter().commentaire(response, idFilm, idClient, dateNow, commentaire);
        } catch (SQLException ex) {
            Logger.getLogger(Commenter.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

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
