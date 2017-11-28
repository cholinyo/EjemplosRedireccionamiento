package redirecionar;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

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
public class control extends HttpServlet {
    @Override
    public void doPost (HttpServletRequest request, HttpServletResponse response)
            throws ServletException , IOException {
            response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            String login = request.getParameter("login");
            String password = request.getParameter("password");
            if (password.equals("admin")) {
                response.sendRedirect("bienvenida?login="+login);                
            }
            else {
                response.sendRedirect("index.html");
            }
        }
    }
}
