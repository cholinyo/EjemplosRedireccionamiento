/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.sun.net.httpserver.spi.HttpServerProvider;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vcaruncho
 */
public class bienvenida extends HttpServlet {
    protected void serice (HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException 
    {
    response.setContentType("text/html;charser=UTF-8");
    PrintWriter out = response.getWriter();
    String login = request.getParameter("login");
    out.println("<html>"); 
    out.println("<head>"); 
    out.println("<title>Servlet Bienvenida</title>"); 
    out.println("</head>"); out.println("<body>"); 
    out.println("<h1>Bienvenido a mi página Sr./a. " + login + "</h1>"); 
    out.println("</body>"); 
    out.println("</html>"); 
    out.close(); }    
    
}