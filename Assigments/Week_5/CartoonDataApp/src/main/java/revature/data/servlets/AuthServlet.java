package revature.data.servlets;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthServlet extends HttpServlet {

    public AuthServlet(){};
    public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,java.io.IOException{

        response.setContentType("text/html");
        java.io.PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<title>Beta_Authentication_Page</title>");
        out.println("<head>");
        out.println("<h1>Beta_Authentication_Page</h1>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div>");
        out.println("<table border= 1>");
        out.println("<tr>");
        out.println("<h2>This page was put here as a place-holder for when " +
                "I fully understand the development process.</h2>.<br>");
        out.println("<h2>At the moment I do not have nearly as much knowledge as some of my fellow comrades.</h2>.<br>");
        out.println("<h2>But, as time goes by I'll gain more confidence in my abilities, " +
                "so that I my become a more efficient developer.</h2>.<br>");
        out.println("</tr>");
        out.println("</table>");
        out.println("</div>");
        out.println("<div>");
        out.println("<a href=http://localhost:8080/cartoon-data-app/cartooons><h1>Cartoon_Database.</h1> </a>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
    }
}
