

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
        <h1>Zoo</h1>
        
        <form method="POST" action="tigre">
            <label for="nom">Nom</label><input type="text" name="nom" id="nom"/>
            <label for="pays">Pays</label><input type="text" name="pays" id="pays"/>
             <label for="age">Age</label><input type="text" name="age" id="age"/>
            <input type="submit" value="Envoyer"/>
        </form>
      
          <c:if test="${ tigre.age < 0 }">
            <p>Erreur: Saisissez un age positif</p>
            ${tigres.remove(tigre)}
           </c:if>
        
        <ul>
            <c:forEach items="${tigres}" var="tigre">
               <li> ${ tigre.nom }  
            </c:forEach>             
         </ul>
        
        
    
</html>
