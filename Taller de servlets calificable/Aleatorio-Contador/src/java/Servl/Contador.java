/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servl;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author pampl
 */
@WebServlet(name = "Contador", urlPatterns = {"/Contador"})
public class Contador extends HttpServlet {

  

    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        PrintWriter out = response.getWriter();
        int inicios = 1;
        HttpSession contador = request.getSession();
        
        if (contador.getAttribute("numero") != null){
            inicios = (Integer)contador.getAttribute("numero");
            inicios += 1;
        }
        contador.setAttribute("numero", inicios);
        out.println("Contador de vistas: " + inicios);
        
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
        PrintWriter out = response.getWriter();
        int sesiones = 1;
        HttpSession contador = request.getSession();
        
        if (contador.getAttribute("numero") != null){
            sesiones = (Integer)contador.getAttribute("numero");
            sesiones += 1;
        }
        contador.setAttribute("numero", sesiones);
        out.println("Contador de vistas: " + sesiones);
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
