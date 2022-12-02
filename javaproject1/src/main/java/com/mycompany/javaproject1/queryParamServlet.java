
package com.mycompany.javaproject1;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/query")
public class queryParamServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException{
        
       String prenom = request.getParameter("prenom");
        response.getWriter().append("<p>Tu t'appelles: </p>");
        response.getWriter().append("<p>"+prenom+"</p>");
       
        
        
    }
    
    
    
    
    
    
}
