package revature.data.servlets;

import revature.data.app.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import revature.data.daos.UserDAO;
import revature.data.utils.ConnectionFactoryUtility;
import revature.data.utils.Interfaces.User_Interface;

import javax.servlet.ServletException;
import javax.servlet.http.*;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;


public class UserServlet extends HttpServlet implements User_Interface{
    HttpServletResponse response = null;
    private final ObjectMapper mapper;

    private final UserDAO userDAO;
    public UserServlet(ObjectMapper mapper,  UserDAO userDAO) {
        this.mapper = mapper;
        this.userDAO = userDAO;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // super.doGet(req,resp);
        /// resp.getWriter().write("/users works!\n");

        String responsePayload = "";
        List<User> users = getAllUsers();
        responsePayload = mapper.writeValueAsString(users);
        resp.setContentType("application/json");
        resp.getWriter().write(responsePayload);
        System.out.println(users.size());

    }
/*
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

    }*/

    @Override
    protected void doPut(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doPut(request, response);
    }

    @Override
    protected void doDelete(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doDelete(request, response);
    }


    public User createUser(User user) {

        return null;
    }


    public User getUserById(int id) {
        return null;
    }


    public User getUserByUsername(String username) {
        return null;
    }

@Override
    public List<User> getAllUsers() {

        List<User> users = new ArrayList<>();
        System.out.println("[LOG] - User Servlet received a post request at" + LocalDateTime.now());
        try (Connection conn = ConnectionFactoryUtility.getInstance().getConnection()) {
            String sql = "Select * From cartoons.users";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            ResultSet result = pstmt.executeQuery();

            while (result.next()) {
                User user = new User();
                user.setId(result.getInt("id"));
                user.setFirstName(result.getString("first_name"));
                user.setLastName(result.getString("last_name"));
                user.setEmail(result.getString("email"));
                users.add(user);

            }

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        return users;


    }


    public void createMultipleUsers(List<User> users) {

    }


}

