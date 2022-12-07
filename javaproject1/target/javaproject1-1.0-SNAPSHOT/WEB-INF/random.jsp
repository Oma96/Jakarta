

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Jeu nombre</h1>
        
        <form method="POST" action="jeunombre">
            <label for="nombreJoueurString">Nombre:</label><input type="text" name="nombreJoueurString" id="nombreJoueur"/>
            <input type="submit" value="Envoyer"/>
        </form>
        
        <p>Nombre à deviner :${nombreADeviner}</p>
        <p>Nombre Joueur : ${nombreJoueur}</p>
        <p>Nombre de tentatives restantes : ${nombreTentativesRestantes}</p>
       
        
        
        
    </body>
</html>
