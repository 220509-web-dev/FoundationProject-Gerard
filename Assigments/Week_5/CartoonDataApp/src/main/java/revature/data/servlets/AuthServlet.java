package revature.data.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import revature.data.app.User;

import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthServlet extends HttpServlet {

    public AuthServlet() {
    }

    public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {


        RequestDispatcher dispatcher = request.getServletContext().getRequestDispatcher("/WEB-INF/index.html");
        dispatcher.include(request, response);

        String param = request.getParameter("cartoon-web-app/WEB-INF/index.html");

        if (param == null) {
            throw new ServletException("Missing parameter in Authentication.");
        } else if (param.equals("/index")) {
            dispatcher = request.getRequestDispatcher("/WEB-INF/index.html");
        } else if (param.equals("/cartoons")) {
            dispatcher = request.getRequestDispatcher("/cartoons");
        } else {
            throw new ServletException("Improper parameter passed.");
        }
        if (dispatcher != null) {
            dispatcher.include(request, response);

        /*request.getRequestURI().replace("/cartoon-data-app/authentication", "/cartoon-data-app/cartoons");
        request.getServletContext().getRequestDispatcher("/WEB-INF/index.html");*/

        }

    }
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, java.io.IOException {

        ObjectMapper objectMapper = new ObjectMapper();

        String Dline;
        String username = " ";
        String password = " ";


        BufferedReader reader = request.getReader();
        RequestDispatcher dispatcher = null;

        StringBuilder stringBuilder = new StringBuilder();

        while ((Dline = reader.readLine()) != null) {
            stringBuilder.append(Dline);
        }
        String body = stringBuilder.toString();
        System.out.println("body: " + body);


        /*User userCredentials = objectMapper.readValue(body, User.class);*/

        response.getWriter().write(objectMapper.writeValueAsString(username));

        response.getWriter().write(objectMapper.writeValueAsString(password));


    }


    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false);

        if (session != null) {
            session.invalidate();
        }
        resp.setStatus(204);
    }
}




