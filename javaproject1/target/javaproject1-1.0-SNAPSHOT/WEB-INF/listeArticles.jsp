

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>







<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
   
    <body>
        
 
        <h1>E-commerce</h1>
        
        <ul>
            <c:forEach items="${articles}" var="article">
                <li name="id" id=${article.id}> 
                     <h2 >Article ${article.id}</h2>
                      <p>Nom: ${article.name} </p>
                      <p>Description: ${article.description}</p>
                      <p>Prix: ${article.price} $ </p>
                      <button><a href="${pageContext.request.contextPath}/panier?action=buy&id=${article.id}">Ajouter au panier</a></button>

                     </li>  
             </c:forEach>  
 </ul>
        
       
        
        
    </body>
</html>
