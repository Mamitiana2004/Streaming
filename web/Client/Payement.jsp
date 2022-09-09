<%-- 
    Document   : Payement
    Created on : 27 mai 2022, 11:43:08
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
    Compte c=new Compte();
    String error="";
    if(request.getParameter("error")!=null)
    {
        error="! "+request.getParameter("error");
    }
    
    int compte=0;
    if(request.getParameter("compte")!=null)
    {
        compte=Integer.parseInt(request.getParameter("compte"));
        request.getSession().setAttribute("compte",compte);
    }
    else if(request.getParameter("compte")==null)
    {
        compte=(int)request.getSession().getAttribute("compte");
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Payement</title>
    </head>
    <body>
        
        <link rel="stylesheet" href="/Servlet/assets/css/client/form-validation.css">
        <link rel="stylesheet" href="/Servlet/assets/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="/Servlet/assets/css/client/Payement.css">
    </head>
    <body>
        <div  class="Payement col-md-5 col-lg-6">
            <img src="/Servlet/assets/img/client/banque.png">
            <hr class="tirer mb-4">
            <h2>Payement</h2>
            <form class="form-signin m-auto needs-validation" method="post" action="Payer" novalidate="">
                
                
                <div class="col-9">
                    <p class="prix"><strong>Payer :</strong><span> <% out.println(c.getPrix(compte));%></span> Ar</p>
                </div>
                
                <input type="hidden"name="prix" value=<% out.println(c.getPrix(compte));%>>
                <div class="form-floating col-9">
                    <select class="form-select" id="floatingInput" name="nbrMois"    required="">
                        <option class="labelSelect" value="">...</option>
                            <% 
                                for(int i=1;i<=12;i++)
                                {
                                    out.println("<option value=\""+i+"\">"+i+" </option>");
                                }
                            %>    
                    </select><label for="fl oatingInput">Nombre de mois</label>
                    
                    <div class="errorValid invalid-feedback">
                        Combien de mois ?
                    </div>
                </div>
                <br>
               <div class="col-9">
                   <div class="form-floating">
                       <input type="text" class="form-control" id="floatingInput" name="numero" placeholder="8 chiffres" required="">
                        <label for="floatingInput">Numero de carte bancaire</label>
                        <div class="errorValid invalid-feedback">
                        Numero de compte
                    </div>
                  </div>
                    
                </div>
                <br>
                <div class="col-9">
                    <div class="form-floating">
                        <input type="password" class="form-control" id="floatingInput" name="code" placeholder="" required="">
                        <label for="floatingInput">Code bancaire</label>
                        <div class="errorValid invalid-feedback">
                        Code bancaire s'il vous plait.
                    </div>
                     </div>
                    
                </div>
                <br>
                <p class="error"> <% out.println(error);%></p>
                <p><button class="submit"  type="submit">Payer</button></p>
            </form>
                <br>
                <p><a class="link" href="Abonnement.jsp">← Retour</a></p>
        </div>
                
                
    <script src="/Servlet/assets/dist/js/bootstrap.bundle.min.js"></script>
         <script src="/Servlet/assets/js/client/form-validation.js"></script>


    </body>
</html>
