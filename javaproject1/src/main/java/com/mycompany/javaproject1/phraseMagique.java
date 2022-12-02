
package com.mycompany.javaproject1;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/phrase")
public class phraseMagique extends HttpServlet {
     String phrase= "";
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException
    { 
       
      String mot= request.getParameter("mot");
      phrase= phrase.concat(" ").concat(mot);
      response.getWriter().print(phrase);
        
        
    }      
    
    
}
