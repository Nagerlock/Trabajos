
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
@WebServlet("/Pitadoras")
public class Pitadoras extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");

        Float catA = Float.valueOf(request.getParameter("catetoa"));
        Float catB = Float.valueOf(request.getParameter("catetob"));
        Float resultado = (float)Math.sqrt(Math.pow(catA, 2) + Math.pow(catB, 2));

        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<title>Teorema de pitagoras</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p><b>Cateto A</b> = " + catA + "</p>");
        out.println("<p><b>Cateto B</b> = " + catB + "</p>");
        out.println("<p><b>Hipotenusa</b> = " + resultado + "</p>");
        out.println("</body>");
        out.println("</html>");        
    }
}
