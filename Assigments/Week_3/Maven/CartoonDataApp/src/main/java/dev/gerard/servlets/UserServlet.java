package dev.gerard.servlets;
import com.fasterxml.jackson.databind.ObjectMapper;
import dev.gerard.app.User;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServlet;
import java.io.IOException;


@WebServlet("/User")//  annotation-based servlet registration.
public class UserServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException, IOException
    {
        //super.doGet(request,response);
        ObjectMapper mapper = new ObjectMapper();
        mapper.readValue(request.getInputStream(),User.class);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        super.doPost(request,response);
    }


    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        super.doPut(request,response);
    }

    @Override
    protected  void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
    {
        super.doDelete(request,response);
    }

}
