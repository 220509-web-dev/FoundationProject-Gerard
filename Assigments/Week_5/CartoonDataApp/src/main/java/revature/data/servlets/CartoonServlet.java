package revature.data.servlets;

import com.fasterxml.jackson.databind.ObjectMapper;
import revature.data.app.Cartoon;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class CartoonServlet extends HttpServlet {

    private final ObjectMapper mapper;
    public CartoonServlet(ObjectMapper mapper){
        this.mapper = mapper;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException{
        Cartoon cartoon = new Cartoon();
    }
}
