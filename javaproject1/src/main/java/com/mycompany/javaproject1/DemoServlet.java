
package com.mycompany.javaproject1;

import java.io.IOException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// GET /demo
@WebServlet("/demo")
public class DemoServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws IOException{
        System.out.println("Debut du doGet()");
        response.getWriter().write("<h1>Bonjour</h1>");
      //try {
         //int result = 5 / 0;
        //}
        //catch(NullPointerException e){
          //  System.out.println("Exception : "+e.getMessage());
        //}
        //catch(ArithmeticException e){
          //  System.out.println("Exception : "+e.getMessage());
        //}
        System.out.println("Fin du doGet()");
}

}
