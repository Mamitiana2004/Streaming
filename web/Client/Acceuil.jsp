<%-- 
    Document   : Acceuil
    Created on : 27 mai 2022, 15:14:26
    Author     : P14A-01-Faneva
--%>
<%@page import="DAO.*" %>
<%
    Connecte connecte=new Connecte();
    if(!connecte.hasConnecte())
    {
        response.sendRedirect("Login.jsp");
    }
    Service.client.Film film=new Service.client.Film();
    Categorie categorie=new Categorie();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Acceuil</title>
        <link rel="stylesheet" href="/Servlet/assets/css/Bootstrap.css">
    </head>
    <body>
        <h1>Hello 
        <% 
            out.println(connecte.getNomClientConnecte());
        %></h1>
        <% 
            for(int i=1;i<=categorie.count();i++)
            {
                out.println("<a href=\"Categorie.jsp?id="+i+"\"><button>"+categorie.getNom(i)+"</button>");
            }
                
        %>
        <a href="Deconnecter?nom=<% out.println(connecte.getNomClientConnecte());%>"><button>Se deconnecter</button></a>
    </body>
</html>
