/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package redirecionar;

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

public class Error extends HttpServlet {
protected void service(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
    response.setContentType("text/html;charset=UTF-8"); 
    PrintWriter out = response.getWriter(); 
    String mensajeError= (String)request.getAttribute("mensaje"); 
    out.println("<html>"); 
    out.println("<head>"); 
    out.println("<title>Servlet Error</title>"); 
    out.println("</head>"); 
    out.println("<body>"); 
    out.println("<h1>"+mensajeError+"</h1>"); 
    out.println("</body>"); 
    out.println("</html>"); 
    out.close(); } 
}
