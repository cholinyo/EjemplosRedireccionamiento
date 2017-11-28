/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author vcaruncho
 */
@WebServlet(name = "TablaMultiplicar", urlPatterns = {"/tablamultiplicar"})
public class TablaMultiplicar extends HttpServlet {

 protected void service(HttpServletRequest request, HttpServletResponse response)
         throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
         PrintWriter out = response.getWriter();
         out.println("html");
         out.println("<head>");
         out.println("<title>Tabla de muliplicar</title>");
         out.println("</head>");
         out.println("<body>");
         out.println("center ");
         out.println("<center><table border='1'>");
         for(int i=1;i<=10;i++){ 
            out.println("<tr>");
            for(int k=1;k<=10;k++){
                out.println("<td>");
                out.println(i*k);
                out.println("</td>"); 
            } 
            out.println("</tr>");
         } out.println("</table></center>"); 
         out.println("</body>");
         out.println("</html>"); 
         out.close(); } 
}
  
 
