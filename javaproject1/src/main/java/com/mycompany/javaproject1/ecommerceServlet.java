
package com.mycompany.javaproject1;

import java.io.IOException;
import java.util.ArrayList;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/ecommerce")
public class ecommerceServlet extends HttpServlet {
    
     ArrayList<Article> articles = new ArrayList<>();

     
     Article article1 = new Article(1,"Telephone","Samsung S22",1000);
     Article article2 = new Article(2,"Telephone","I phone 14 pro",1200);
     Article article3 = new Article(3,"Telephone","Oppo 3",600);
  
    
     @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException{
     
      articles.add(article1);
      articles.add(article2);
      articles.add(article3);
      
      request.setAttribute("articles", articles);
      
      request.getRequestDispatcher("WEB-INF/listeArticles.jsp").forward(request, response);
     
    }
    
     @Override
       public void doPost(HttpServletRequest request, HttpServletResponse response){
       
       //request.getParameter("")
       
       }
     
     
     
     
     
    
    
    
}
