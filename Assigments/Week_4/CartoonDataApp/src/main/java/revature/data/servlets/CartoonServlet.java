package revature.data.servlets;
import com.fasterxml.jackson.databind.ObjectMapper;
import revature.data.app.Cartoon;
import revature.data.daos.CartoonDAO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class CartoonServlet extends HttpServlet {

    private final ObjectMapper mapper;
    private final CartoonDAO cartoonDAO;

    public CartoonServlet(ObjectMapper mapper, CartoonDAO cartoonDAO) {
        this.mapper = mapper;
        this.cartoonDAO = cartoonDAO;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        List<Cartoon> cartoons = cartoonDAO.getCartoon();
        String respPayload = mapper.writeValueAsString(cartoons);
        resp.setContentType("application/json");
        resp.getWriter().write(respPayload);
    }
}
