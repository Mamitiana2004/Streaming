<%-- 
    Document   : Inscription
    Created on : 16 mai 2022, 22:36:51
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
    String errorAge="";
     if(request.getParameter("error")!=null){
        if(request.getParameter("type").compareTo("nom")==0)
        {
            errorCompte=request.getParameter("error");
        }
        else{
            errorAge=request.getParameter("error");
        }
     }
%>
<% 
    Pays p=new Pays();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inscription</title>
        <meta charset="UTF-8">  
        <link rel="stylesheet" href="/Servlet/assets/css/client/form-validation.css">
        <link rel="stylesheet" href="/Servlet/assets/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="/Servlet/assets/css/client/Inscription.css">
    </head>
    <body>
      
                
        <center><div class="col-md-7 col-lg-8">
        <h2 class="mb-3">Sign in</h2>
        
        <center>
            <form class="needs-validation" method="post" action="Inscription" novalidate>
            <div class="row g-3">
              
                <div class="col-md-6">
                    <label for="username" class="form-label">Username</label>
                    <div class="input-group has-validation">
                        <span class="input-group-text">@</span>
                        <input type="text" class="form-control" id="username" name="nom" placeholder="Username" required>
                        <div class="invalid-feedback">
                            Veuillez ecire un pseudo.
                        </div>
                    </div>
                </div>


                <div class="col-md-6">
                    <label for="password" class="form-label">Password</label>
                    <input type="password" class="form-control" name="pass" id="password" required>
                    <div class="invalid-feedback">
                        Mot de passe s'il vous plait.
                    </div>
                </div>
                
                <div class="col-12">
                    <label for="date" class="form-label">Date de naissance</label>
                    <input type="date" name="dateN" class="form-control" id="date" required>
                    <div class="invalid-feedback">
                        Date de naissance.
                    </div>
                </div>
                
                <div class="col-12">
                    <label for="genre" class="form-label">Genre</label>
                    <select name="genre" class="form-select" id="genre" required>
                        <option value="">Choose...</option>
                        <option value='h'>Homme</option>
                        <option value='f'>Femme</option>
                    </select>
                    <div class="invalid-feedback">
                        Votre genre s'il vous plait
                    </div>
                </div>
            

                <div class="col-md-12">
                    <label for="country" class="form-label">Country</label>
                    <select name="pays" class="form-select" id="country" required>
                        <option value="">Choose...</option>
                        <% 
                                for(int i=1;i<=p.count();i++)
                                {
                                    out.println("<option value="+i+">"+p.getNom(i)+"</option>");
                                }
                        %>
                    </select>
                    <div class="invalid-feedback">
                        Selectionner un pays.
                    </div>
                </div>            
            <hr class="my-4">

          

            <h3 class="mb-3">Compte bancaire</h3>

          

                <div class="row gy-3">
                    <div class="col-md-6">
                        <label for="cc-number" class="form-label">Card number</label> 
                        <input type="text" class="form-control" id="cc-number" name="numero" placeholder="8 chiffres" required>
                        <div class="invalid-feedback">
                            8 chiffres
                        </div>
                    </div>

                    <div class="col-md-6">
                        <label for="cc-code" class="form-label">Security code</label>
                        <input type="pass" class="form-control" id="cc-code" name="code" placeholder="4 chiffres" required>
                        <div class="invalid-feedback">
                            4 chiffres
                        </div>
                    </div>

          
          
          

                    <button class="w-100 btn btn-primary btn-lg submit" id="btn_sub" type="submit">Sign in</button>
            
                </div></div>
            </form>
                    <hr class="my-4">
                    <center><div class="link"><p>Vous avez deja un compte,<a href="Login.jsp">Se connecter</a></p>
                            <p><a href="../Welcome.jsp">Retour</a></p></div></center>
    </center>
                    
                    
         <script src="/Servlet/assets/js/client/form-validation.js"></script>
    </body>
</html>
