
package com.mycompany.javaproject1;

import java.io.IOException;
import static java.lang.Integer.parseInt;
import java.util.Random;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// GET /jeunombre
@WebServlet("/jeunombre")
public class randomServlet extends HttpServlet {
    
    int nombreADeviner = new Random().nextInt(10)+1;
    int nombreTentativesRestantes = 3;
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException
    {       
         String nombreJoueurString = request.getParameter("nombre");
         
         try {
            int nombreJoueur = Integer.parseInt(nombreJoueurString);       

            nombreTentativesRestantes--;
                            
            response.getWriter().append("<p>Nombre à deviner: "+nombreADeviner+"</p>");
            response.getWriter().append("<p>Nombre joué: "+nombreJoueur+"</p>");
            response.getWriter().append("<p>Nombre tentatives restantes: "+nombreTentativesRestantes+"</p>");
           
            if(nombreJoueur == nombreADeviner){
                response.getWriter().append("<p>Bravo c'est gagné !</p>");
                response.getWriter().append("<p>Nouvelle partie démarrée</p>");
                nombreADeviner = new Random().nextInt(10)+1;
                nombreTentativesRestantes = 3;
            } else {
                if(nombreJoueur > nombreADeviner){
                    response.getWriter().append("<p>c'est trop grand</p>");
                } else {
                    response.getWriter().append("<p>c'est trop petit</p>");
                }
                
                if(nombreTentativesRestantes == 0){
                    response.getWriter().append("<p>PERDU, nombre de tentatives maximum atteint</p>");
                    response.getWriter().append("<p>Nouvelle partie démarrée</p>");
                    nombreADeviner = new Random().nextInt(10)+1;
                    nombreTentativesRestantes = 3;
                }
            }
         }
         catch(NumberFormatException e){
             response.getWriter().append("<p>Erreur : Veuillez saisir un nombre</p>");
         }         
    }
}
