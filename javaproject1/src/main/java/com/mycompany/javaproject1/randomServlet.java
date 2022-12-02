
package com.mycompany.javaproject1;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Random;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/random")
public class randomServlet extends HttpServlet {
    
     @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException{
         String number= request.getParameter("number");
         
        
         Random random = new Random();
         int randomNumber= random.nextInt(10)+1;
         if(randomNumber == parseInt(number)){
             response.getWriter().print("Le nombre c'est : "+ randomNumber + " Bravo! C'est gagné");
            }else if( parseInt(number)< randomNumber){
               response.getWriter().print("Le nombre c'est : "+ randomNumber + " C'est trop petit!");
            }else if( parseInt(number)> randomNumber){
                 response.getWriter().print("Le nombre c'est : "+ randomNumber + " C'est trop grand!");
            }
         }
    
    
    
}
