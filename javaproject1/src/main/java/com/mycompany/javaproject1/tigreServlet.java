
package com.mycompany.javaproject1;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;



@WebServlet ("/tigre")
public class tigreServlet extends HttpServlet {
    
     private ArrayList<Tigre> tigres = new ArrayList<>();
     
     @Override
     public void doGet(HttpServletRequest request, HttpServletResponse response) 
             throws ServletException, IOException{
         // affichage JSP
         
         
        request.setAttribute("tigres", tigres);
        request.getRequestDispatcher("WEB-INF/tigre.jsp").forward(request, response);
         
         
     }
     
     
     @Override
     public void doPost(HttpServletRequest request, HttpServletResponse response) 
             throws IOException{
         
         
           try {
            // recupération données envoyées dans le <form> HTML
            String nom = request.getParameter("nom");
            String pays = request.getParameter("pays");
            String ageString = request.getParameter("age");
            int age = Integer.parseInt(ageString);

            // sauvegarde dans la Session
            if (nom != null && pays != null) {
                Tigre tigre = new Tigre(nom, pays, age);
                tigres.add(tigre);
                request.getSession().setAttribute("tigre", tigre);
            }

            // affichage JSP       
            doGet(request, response);
            
        } catch (Exception e) {
            response.getWriter().append("<p>Erreur dans le formulaire</p>");
            response.getWriter().append("<a href=\"tigre\">Retour</a>");
        }
     
     
     }
     
    
    
}
