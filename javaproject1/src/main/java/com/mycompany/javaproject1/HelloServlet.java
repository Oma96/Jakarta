
package com.mycompany.javaproject1;

import java.io.IOException;
import java.time.LocalDateTime;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.annotation.WebServlet;


@WebServlet("/hello")
public class HelloServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) 
            throws IOException, ServletException 
    {    
        LocalDateTime time = LocalDateTime.now();
         request.setAttribute("horaire", time);
        request.getRequestDispatcher("WEB-INF/hello.jsp").forward(request, response);
    }
}


