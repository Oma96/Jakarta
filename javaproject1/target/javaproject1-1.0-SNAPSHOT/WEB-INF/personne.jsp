

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
     <body>
        <h1>Personne</h1>
        <p> Prénom : ${ personne.prenom } </p>
        <p> Nom : ${ personne.nom } </p>
        <p>Age : ${personne.age}</p>
     <c:if test="${ personne.age > 17 }">
            <p>Vous etes une personne majeure</p>
        </c:if>
        
        <c:if test="${ personne.age < 18 }">
         <p>Vous etes une personne mineure</p>
        </c:if>
         <form method="POST" action="personne">
            <label for="prenom">Prénom</label><input type="text" name="prenom" id="prenom"/>
            <label for="nom">Nom</label><input type="text" name="nom" id="nom"/>
             <label for="age">Age</label><input type="text" name="age" id="age"/>
            <input type="submit" value="Envoyer"/>
        </form>
         
            <c:choose>
             <c:when test="${ personnes.size() == 0 }">
                 <p>Il n'y a aucune personne à afficher</p> 
             </c:when>
             <c:when test="${ personnes.size() == 1 }">
                 <p>Il y a une personne dans la liste</p> 
             </c:when>
             <c:when test="${ personnes.size() > 1 }">
                 <p>Il y a plusieurs personnes dans la liste</p>
             </c:when>
             <c:otherwise>
                 <p>Probleme la liste ?</p>
             </c:otherwise>
         </c:choose>
                 
                 
        <c:forEach var="compteur" begin="0" end="10" step="2">
           ${compteur}
        </c:forEach>
         
           <ul>
            <c:forEach items="${personnes}" var="personne">
                <li> ${ personne.prenom } ${ personne.nom }
            </c:forEach>             
         </ul>
    </body>
</html>
