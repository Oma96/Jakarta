
package com.mycompany.javaproject1;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calendrier")
public class calendrierServlet extends HttpServlet {
    
    
     @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException
    { 
    String jour= request.getParameter("jour");
    String mois = request.getParameter("mois");
    
    
    switch(jour){
   
       case "1": 
           response.getWriter().print("Lundi");
           break;
   
       case "2":
           response.getWriter().print("Mardi");
           break;
   
       case "3":
          response.getWriter().print("Mercredi");
           break;
       case "4" :
            response.getWriter().print("Jeudi");
           break;
         case "5" :
             response.getWriter().print("Vendredi");
           case "6" :  
                response.getWriter().print("Samedi");
           case "7" : 
               response.getWriter().print("Dimanche");
           default:
               break;
   }
    response.getWriter().print(" ");
    switch(mois){
   
       case "1": 
           response.getWriter().print("Janvier");
           break;
   
       case "2":
           response.getWriter().print("Fevrier");
           break;
   
       case "3":
          response.getWriter().print("Mars");
           break;
       case "4" :
            response.getWriter().print("Avril");
           break;
         case "5" :
             response.getWriter().print("Mai");
           case "6" :  
                response.getWriter().print("Juin");
           case "7" : 
               response.getWriter().print("Juillet");
           case "8" :  
                response.getWriter().print("Aout");
           case "9" : 
               response.getWriter().print("Septembre");
          case "10" : 
               response.getWriter().print("Octobre");
           case "11" :  
                response.getWriter().print("Novembre");
           case "12" : 
               response.getWriter().print("Decembre");
           default:
               break;
   }
    
    
    
    
    
    
    }
    
}
