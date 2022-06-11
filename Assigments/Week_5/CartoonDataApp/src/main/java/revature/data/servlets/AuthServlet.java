package revature.data.servlets;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.BufferedReader;

public class AuthServlet extends HttpServlet {

    public AuthServlet() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {

        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/index.html");
        dispatcher.include(request, response);


    }

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {

        BufferedReader reader = request.getReader();

        String line;
        StringBuilder stringBuilder = new StringBuilder();

        while ((line = reader.readLine()) != null) {
            stringBuilder.append(line);
        }
        String body = stringBuilder.toString();
        System.out.println("body: " + body);
        //request.getRequestURI().replace("/cartoon-data-app/authentication", "/cartoon-data-app/cartoons");

    }
}
