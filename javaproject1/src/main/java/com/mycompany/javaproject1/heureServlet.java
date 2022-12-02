
package com.mycompany.javaproject1;

import java.io.IOException;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/heure")
public class heureServlet extends HttpServlet {
    
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
        
        LocalTime time= LocalTime.now().withNano(0);
         
       response.getWriter().print(time);
        
    }
    
}
