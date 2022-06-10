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
        resp.setContentType("text/html");
        java.io.PrintWriter out = resp.getWriter();
        out.println("<html>");
        out.println("<title>The Database</title>");
        out.println("<head>");
        out.println("<h1>The Database</h1>");
        out.println("</head>");
        out.println("<body>");

        out.println("<div>");
        out.println("<table border= 1>");
        out.println("<tr>");
        out.println("<h2>Welcome to the Cartoon Database</h>");

        out.println("</tr>");
        out.println("</table>");
        out.println("</div>");
        out.println("<div>");
        out.println("</div>");
        out.println("</body>");
        out.println("</html>");
        List<Cartoon> cartoons = cartoonDAO.getCartoon();
        String respPayload = mapper.writeValueAsString(cartoons);
        //resp.setContentType("application/json");
        resp.getWriter().write(respPayload);
    }
}
