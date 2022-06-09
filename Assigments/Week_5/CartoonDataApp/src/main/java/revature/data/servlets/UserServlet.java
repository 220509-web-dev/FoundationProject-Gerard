package revature.data.servlets;
import revature.data.app.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import revature.data.utils.Interfaces.User_Interface;
import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.time.LocalDateTime;
import java.util.List;



public class UserServlet extends HttpServlet implements User_Interface {

    private final ObjectMapper mapper;

    public UserServlet(ObjectMapper mapper) {
        this.mapper = mapper;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req,resp);
        resp.getWriter().write("/users works!\n");
        System.out.println("[LOG] - User Servlet received a post request at" + LocalDateTime.now());
        User someUser = new User(999, "Alice", "Anderson", "aanderson@revature.com", "password");
        String responsePayload = mapper.writeValueAsString(someUser);
        resp.setContentType("application/json");
        resp.getWriter().write(responsePayload);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //super.doPost(request,response);

        System.out.println("[LOG] - User Servlet received a post request at" + LocalDateTime.now());

        try {
            User user = mapper.readValue(request.getInputStream(), User.class);
            System.out.println(user);
        } catch (Exception e) {
            e.printStackTrace();

        }

    }

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPut(request, response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doDelete(request, response);
    }

    @Override
    public User createUser(User user) {
        String newuser= user.toString();
        System.out.println("[LOG] - User Servlet received a post request at" + LocalDateTime.now());
        User someUser = new User(999, "Alice", "Anderson", "aanderson@revature.com", "password");
        return null;
    }

    @Override
    public User getUserById(int id) {
        return null;
    }

    @Override
    public User getUserByUsername(String username) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }

    @Override
    public void createMultipleUsers(List<User> users) {

    }
}
