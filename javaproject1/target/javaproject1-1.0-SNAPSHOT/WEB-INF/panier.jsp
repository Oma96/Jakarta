

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Panier</h1>
        
        
        
        
        <c:set var="total" value="0"></c:set>
		
	
    
        <c:forEach items="${articlesPanier}" var="article">
           <c:set var="total" value="${total + article.price}"></c:set>
         <li name= "id" > 
                     <h2 >Article ${article.id}</h2>
                      <p>Nom: ${article.name} </p>
                      <p>Description: ${article.description}</p>
                      <p>Prix: ${article.price} $ </p>
        </c:forEach>  
                      
            <p> Total = ${total}</p>            
                      
    </body>
</html>
