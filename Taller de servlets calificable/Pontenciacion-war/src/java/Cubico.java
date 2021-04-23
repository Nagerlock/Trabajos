
import com.sun.xml.internal.ws.util.StringUtils;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import static jdk.nashorn.internal.runtime.JSType.isNumber;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author User
 */
@WebServlet(urlPatterns ="/Cubico")
public class Cubico extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
    {
        PrintWriter out = response.getWriter();
        Integer numero = Integer.valueOf(request.getParameter("numero"));
        Integer resultado = numero*numero*numero;
        out.println("El resultado elevado es: " + resultado);    
    
    }
}
