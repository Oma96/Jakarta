
package com.mycompany.javaproject1;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/personne")
public class personneServlet extends HttpServlet{
    private List<Personne> personnes = new ArrayList<>();

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        // affichage JSP
        request.setAttribute("personnes", personnes);
        request.getRequestDispatcher("WEB-INF/personne.jsp").forward(request, response);
    }

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        try {
            // recupération données envoyées dans le <form> HTML
            String prenom = request.getParameter("prenom");
            String nom = request.getParameter("nom");
            String ageString = request.getParameter("age");
            int age = Integer.parseInt(ageString);

            // sauvegarde dans la Session
            if (prenom != null && nom != null) {
                Personne personne = new Personne(prenom, nom, age);
                personnes.add(personne);
                request.getSession().setAttribute("personne", personne);
            }

            // affichage JSP       
            doGet(request, response);
            
        } catch (Exception e) {
            response.getWriter().append("<p>Erreur dans le formulaire</p>");
            response.getWriter().append("<a href=\"personnesession\">Retour</a>");
        }
    }
}
