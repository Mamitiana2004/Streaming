<%-- 
    Document   : Login.jsp
    Created on : 16 mai 2022, 22:26:26
    Author     : P14A-01-Faneva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.*" %>
<%
    Connecte connecte=new Connecte();
    if(connecte.hasConnecte())
    {
        response.sendRedirect("Acceuil.jsp");
    }
    else{
        
    }
%>
<%
    String errorCompte="";
    String errorPassword="";
    if(request.getParameter("error")!=null)
    {
        if(Integer.parseInt(request.getParameter("type"))==1)
        {
            errorCompte="! "+request.getParameter("error");
        }
        else{
            errorPassword="! "+request.getParameter("error");
        }
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - Client</title>
        
        <link rel="stylesheet" href="/Servlet/assets/css/client/form-validation.css">
        <link rel="stylesheet" href="/Servlet/assets/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="/Servlet/assets/css/client/Login.css">
        <meta charset="utf-8">
    </head>
    <body>
        <div  class="loginClient col-md-5 col-lg-6">
            <img src="/Servlet/assets/img/client/default.png">
            <hr class="tirer mb-4">
            <form class="needs-validation" method="post" action="Login" novalidate="">
               <div class="col-6">
                   <input type="text" class="form-control" placeholder="Name" name="nom" id="nom" required>
                    <div class="errorValid invalid-feedback">
                        Nom du client non valide
                    </div>
                </div>
                <span class="error"> <% out.println(errorCompte);%></span>
              
                <div class="col-6">
                    <input type="password" class="form-control" name="pass" placeholder="Password" id="password" required>
                    <div class="errorValid invalid-feedback">
                        Mot de passe s'il vous plait.
                    </div>
                </div>
                <span class="error"> <% out.println(errorPassword);%></span>
                
                <p><button class="submit"  type="submit">Se connecter</button></p>
            </form>
                <br>
                <div class="link col-6">
                     <p>Pas encore de compte ?<a href="Inscription.jsp">S'inscire</a></p>
                    <p><a href="../Welcome.jsp">← Retour</a></p>
                </div>
        </div>
                
                
    <script src="/Servlet/assets/dist/js/bootstrap.bundle.min.js"></script>
         <script src="/Servlet/assets/js/client/form-validation.js"></script>
    </body>
</html>
