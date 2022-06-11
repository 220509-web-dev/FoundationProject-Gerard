package revature.data.servlets;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class CopyrightServlet extends HttpServlet {

    public CopyrightServlet(){};

    public  void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException,java.io.IOException{
        response.setContentType("text.html");
        java.io.PrintWriter out = response.getWriter();
        out.println("<html>");
        out.println("<title>copyright</title>");
        out.println("<head>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>The copyright symbol was dynamically loaded</p>");
        out.println("Copyright&copy;2022");
        out.println("</body>");
        out.println("</html>");


    }
}
