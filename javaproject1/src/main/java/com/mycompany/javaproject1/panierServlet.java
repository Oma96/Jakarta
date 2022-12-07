
package com.mycompany.javaproject1;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/panier")
public class panierServlet  extends HttpServlet{
    
      ArrayList<Article> articlesPanier = new ArrayList<>();  
      ArrayList<Article> articles = new ArrayList<>();

     
     Article article1 = new Article(1,"Telephone","Samsung S22",1000);
     Article article2 = new Article(2,"Telephone","I phone 14 pro",1200);
     Article article3 = new Article(3,"Telephone","Oppo 3",600);
     
     
     
      
   
        
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException, ServletException {
        
        
      articles.add(article1);
      articles.add(article2);
      articles.add(article3);
        
 String action = request.getParameter("action");
          if (action.equalsIgnoreCase("buy")){
              doGet_add(request,response);
              }
          
          
           request.getRequestDispatcher("WEB-INF/panier.jsp").forward(request, response);
      }
    
    
    
    public void doGet_add(HttpServletRequest request, HttpServletResponse response){
         request.getSession().setAttribute("articlesPanier",articlesPanier);
     
             
            String idString= request.getParameter("id");
            int id = Integer.parseInt(idString);
            Article article= articles.get(id-1);
            articlesPanier.add(article);
            System.out.println(articlesPanier);
            //request.setAttribute("article", article);
            
            
        
    
    
    
}
}
