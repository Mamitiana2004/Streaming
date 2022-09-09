<%-- 
    Document   : AchatFilm
    Created on : 2 juin 2022, 13:31:53
    Author     : P14A-01-Faneva
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="DAO.*" %>
<% 
    Compte c=new Compte();
    String error="";
    if(request.getParameter("error")!=null)
    {
        error=request.getParameter("error");
    }
    
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Payement</h1>
        <form method="post" action="Payer">
            <p>Payer </p>
            <p><% out.println(error);%></p>
            <p>Numero de carte bancaire : <input type="text" name="numero" id=""></p>
            <p>Code bancaire : <input type="password" name="code" id="code"></p>
            <p><input type="submit" value="Payer"></p>
        </form>
    </body>
</html>
