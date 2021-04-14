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
@WebServlet("/Moto1")
public class Moto1 extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException
    {
        PrintWriter out = response.getWriter();
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Moto1</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<h1>Eva Force</h1>");
        out.println("<br><img src= 'Eva.jpg'>");
        out.println("<br><p> En pocas palabras es una moto de ultima generacion </p>");
        out.println("<br><p> Hecha por y para personas con cultura uwu </p>");
        out.println("</body>");
        out.println("</html>");
    }
}
