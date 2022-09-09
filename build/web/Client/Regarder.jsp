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
    Service.client.Film filmService=new Service.client.Film();
    DAO.Film film=new DAO.Film(); 
    Categorie categorie=new Categorie();
    InfoFilm info=new InfoFilm();
    Commentaire coms=new Commentaire();
    Client client=new Client();
    int idClient=client.getId(connecte.getNomClientConnecte());
    int idFilm=Integer.parseInt(request.getParameter("idFilm"));
    String nomFilm=film.getNom(idFilm);
    Note note=new Note();
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Categorie</title>
        <link rel="stylesheet" href="/Servlet/assets/css/client/Regarder.css">
    </head>
    <body>
        
        <header>
            <a href="#" class="logo"><img src="/Servlet/video/text.png" ></h1></a>
            <div class="toggle">
                
            </div>
        </header>
        
            <div class="banner">
                <h2>Categorie : Action</h2>
                <p>Auteur : <% out.println(info.getAuteur(idFilm));%></p>
                <a href="#" class="play"><img src="/Servlet/assets/img/client/play.png" width="40">Regarder</a>
                <div class="slide"></div>
                <ul>
                    <li><a href="#">T</a></li>
                    <li><a href="#">C</a></li>
                </ul>
            </div>   
        
        
           
        <div style="float: left;">
            <video width="700" src="/Servlet/video/<% out.println(nomFilm);%>.mp4" controls=""></video>
            <% if(!note.hasNote(idFilm,idClient)){%>
                <p>Noter :
                    <% for(int i=1;i<=5;i++)
                    {
                        out.println("<a href=\"Noter.jsp?note="+i+"&idFilm="+request.getParameter("idFilm")+"\">"+i+"</a>");
                    }%>
                </p>
            <%}%>
            <p><a href="Telecharger?nomFilm=<% out.println(nomFilm);%>" ><button>Telecharger</button></a></p>
            <a href="Deconnecter?nom=<% out.println(connecte.getNomClientConnecte());%>"><button>Se deconnecter</button></a>
        
        </div>
        <br>
        <div style="float: right;margin-right: 100px;">
            <div style="width:400px;height: 400px;border: 1px solid #000;">
                <%
                    out.println(coms.afficheCommentaire(idFilm));
                %>
            </div>
            <form action="Commenter.jsp" method="get">
                <p><input type="hidden" name="idFilm" value=<% out.println(request.getParameter("idFilm"));%>></p>
                <p><input type="text" name="commentaire"></p>
                <input type="submit" value="Commentaire">
            </form>
        </div>
        
    </body>

