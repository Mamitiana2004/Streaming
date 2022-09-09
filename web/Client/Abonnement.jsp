<%-- 
    Document   : Abonnement
    Created on : 17 mai 2022, 09:50:14
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
%>
<svg xmlns="http://www.w3.org/2000/svg" style="display: none;">
  <symbol id="check" fill="#ED254E" viewBox="0 0 16 16">
    <title>Check</title>
    <path d="M13.854 3.646a.5.5 0 0 1 0 .708l-7 7a.5.5 0 0 1-.708 0l-3.5-3.5a.5.5 0 1 1 .708-.708L6.5 10.293l6.646-6.647a.5.5 0 0 1 .708 0z"/>
  </symbol>
</svg>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Abonnement</title>
        <meta charset="utf-8">
        <link rel="stylesheet" href="/Servlet/assets/css/client/form-validation.css">
        <link rel="stylesheet" href="/Servlet/assets/dist/css/bootstrap.min.css">
        <link rel="stylesheet" href="/Servlet/assets/css/client/Abonne.css">
    </head>
    <body>
   <div class="container py-3">
       <center><div class="pricing-header p-3 pb-md-4 mx-auto text-cent    er">
                <img src="/Servlet/assets/img/client/Abonnement.png">
                <p class="fs-5 text-muted">Choississez l'abonnement qui vous convient le mieux</p>
           </div></center>
        <br>
     
  <main>   
    <div class="row row-cols-1 row-cols-md-3 mb-3 text-center">
              <%
                        for(int i=1;i<=c.count();i++)
                        {
                            if(i==1)
                            {%>
                               
                            <div class="col">
                                <div class="borderFree card mb-4 rounded-3 shadow-sm">
                                  <div class="enteteFree card-header py-3">
                                    <h4 class=" my-0 fw-normal">Free</h4>
                                  </div>
                                  <div class="card-body">
                                    <h1 class="card-title pricing-card-title">Ar <%= c.getPrix(i) %>   <small class="text-muted fw-light">/mois</small></h1>
                                    <ul class="list-unstyled mt-3 mb-4">
                                      <li>Video limiter a 5/jour</li>
                                      <li>Telechargement et achat des videos impossible</li>
                                    </ul>
                                    <a href="Abonnement?abonnement=<%= i %>"><button type="button" class="free w-100 btn btn-lg btn-outline-primary">Rester gratuit</button></a>
                                  </div>
                                </div>
                              </div>
                            
                            
                            <%}
                            if(i>1)
                            {%>
                             
                            
                            <div class="col">
                                <div class="borderPayant card mb-4 rounded-3 shadow-sm">
                                  <div class="entetePayant card-header py-3 text-white bg-primary border-primary">
                                    <h4 class="my-0 fw-normal"><%= c.getNom(i) %></h4>
                                  </div>
                                  <div class="card-body">
                                    <h1 class="card-title pricing-card-title">Ar <%= c.getPrix(i) %>   <small class="text-muted fw-light">/mois</small></h1>
                                    <ul class="list-unstyled mt-3 mb-4">
                                      <li>Video non limiter</li>
                                      <li>Telechargement et achat des videos possibles</li>
                                    </ul>
                                    <a href="Abonnement?abonnement=<%= i %>"><button type="button" class="payant     w-100 btn btn-lg btn-primary">Abonner</button></a>
                                  </div>
                                </div>
                              </div>
                            
        
        <%}
                        }
       %>
    </div> 
    
    <h2 class="title display-6 text-center mb-4">Compare plans</h2>

    <div class="table-responsive">
      <table class="table text-center">
        <thead>
          <tr>
            <th style="width: 34%;"></th>
            <th style="width: 22%;">Free</th>
            <th style="width: 22%;">Prenium</th>
            <th style="width: 22%;">VIP</th>
          </tr>
        </thead>
        <tbody>
          <tr>
            <th scope="row" class="text-start">Video non limiter</th>
            <td></td>
            <td><svg class="bi" width="24" height="24"><use xlink:href="#check"/></svg></td>
            <td><svg class="bi" width="24" height="24"><use xlink:href="#check"/></svg></td>
          </tr>
          <tr>
            <th scope="row" class="text-start">Achat des videos</th>
            <td></td>
            <td><svg class="bi" width="24" height="24"><use xlink:href="#check"/></svg></td>
            <td><svg class="bi" width="24" height="24"><use xlink:href="#check"/></svg></td>
          </tr>
        </tbody>

        <tbody>
          <tr>
            <th scope="row" class="text-start">Telechargement des videos</th>
            <td></td>
            <td></td>
            <td><svg class="bi" width="24" height="24"><use xlink:href="#check"/></svg></td>
          </tr>
          <tr>
            <th scope="row" class="text-start">Unlimited members</th>
            <td></td>
            <td><svg class="bi" width="24" height="24"><use xlink:href="#check"/></svg></td>
            <td><svg class="bi" width="24" height="24"><use xlink:href="#check"/></svg></td>
          </tr>
          <tr>
            <th scope="row" class="text-start">Extra security</th>
            <td></td>
            <td></td>
            <td><svg class="bi" width="24" height="24"><use xlink:href="#check"/></svg></td>    
          </tr>
        </tbody>
      </table>
    </div>
  </main>
   </div>
        
        
      
    
    </body>
</html>
