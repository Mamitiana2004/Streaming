<%-- 
    Document   : Login
    Created on : 17 mai 2022, 09:14:15
    Author     : P14A-01-Faneva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String error="";
    if(request.getParameter("error")!=null)
    {
        error="! "+request.getParameter("error");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login - Admin</title>
        <meta charset="utf-8">
        
        <link rel="stylesheet" href="/Servlet/assets/css/client/form-validation.css">
        <link rel="stylesheet" href="/Servlet/assets/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="/Servlet/assets/css/admin/Login.css">
    </head>
    <body>
        <div  class="loginAdmin col-md-5 col-lg-6">
            <img src="/Servlet/assets/img/admin/default.png">
            <hr class="tirer mb-4">
            <form class="needs-validation" method="post" action="Admin_Login" novalidate="">
               <div class="col-9">
                   <input type="text" class="form-control" placeholder="Name" name="nom" id="nom" required>
                    <div class="errorValid invalid-feedback">
                        Nom de l'administrateur non valide
                    </div>
                </div>
                <br>
                <div class="col-9">
                    <input type="password" class="form-control" name="pass" placeholder="Password" id="password" required>
                    <div class="errorValid invalid-feedback">
                        Mot de passe s'il vous plait.
                    </div>
                </div>
                <br>
                <p class="error"> <% out.println(error);%></p>
                <p><button class="submit"  type="submit">Se connecter</button></p>
            </form>
                <br>
                <p><a class="link" href="../Welcome.jsp">← Retour</a></p>
        </div>
                
               
    <script src="/Servlet/assets/dist/js/bootstrap.bundle.min.js"></script>
         <script src="/Servlet/assets/js/client/form-validation.js"></script>
    </body>
</html>
