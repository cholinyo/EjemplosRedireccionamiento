/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vcaruncho
 */
@WebServlet(name = "Encabezados", urlPatterns = {"/encabezados"})
public class Encabezados extends HttpServlet {
    public void service (HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println ("<html><head>");
            out.println("<title>Encabezados</title></head>");
            out.println("<body>");
            out.println("Protocolo:  <b>" + request.getProtocol() + "<br/>" );
            out.println("Método:  <b>" + request.getMethod()+ "<br/>" );
            Enumeration e=request.getHeaderNames();
            out.println("<table border='1'>"); 
            out.println("<tr><th> Encabezado</th><th>Valor</th></tr>"); 
            while(e.hasMoreElements()){ 
                String s=(String)e.nextElement();
                out.println("<tr><td>"+s+"</td><td>" + request.getHeader(s)+"</td></tr>"); 
            } 
            out.println("</table>");
            out.println("</body></html>");
    }
}