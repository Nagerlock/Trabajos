/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paginas;

import java.io.IOException;
import java.io.PrintWriter;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author User
 */
@WebServlet("/Pantalladeinicio")
public class Pantalladeinicio extends HttpServlet  {


    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Motocicletas</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Listas</h1>");
        out.println("<br><a href = 'Moto1'>Eva Force</a>");
        out.println("<br><a href = 'Moto2'> Boxer</a>");
        out.println("<br><a href = 'Moto3'> Elcetrica</a>");
        out.println("</body>");
        out.println("</html>");
    }
}
