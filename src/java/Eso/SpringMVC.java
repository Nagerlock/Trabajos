/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Eso;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author pampl
 */
@WebServlet(name = "SpringMVC", urlPatterns = {"/SpringMVC"})
public class SpringMVC extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet SpringMVC</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1 align = center>  SpringMVC  </h1>");
            out.println("<div id = 'INF' style='Background-color: gray; Width = 50%' align = center> <p> Informacion completamente necesaria, pulsa para más</p> </div>");
            out.println("<button onclick='mens();' style='Background-color: cyan'> Info </button>");
            out.println("<script>");
            out.println("function mens(){document.getElementById('INF').innerHTML = '<p>Spring MVC es un sub-proyecto Spring que esta dirigido a facilitar y optimizar el proceso creación de aplicaciones web utilizando el patrón MVC (Modelo-Vista-Controlador), donde el Modelo representa los datos o información que manejará la aplicación web, la Vista son todos los elementos de la UI (Interfaz de Usuario), con ellos el usuario interactúa con la aplicación, ejemplo: botones, campos de texto, etc., finalmente el Controlador será el encargado manipular los datos en base a la interacción del usuario.</p>'} ");
            out.println("</script>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
