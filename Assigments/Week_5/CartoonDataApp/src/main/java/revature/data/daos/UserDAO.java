package revature.data.daos;

import javafx.beans.binding.ObjectExpression;
import revature.data.app.Cartoon;
import revature.data.app.User;
import revature.data.utils.ConnectionFactoryUtility;
import revature.data.utils.Interfaces.User_Interface;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class UserDAO implements User_Interface {

    public User createUser(User user){
        return new User();
    }
    public void createMultipleUsers(List<User> users) {

        String SQL = "INSERT INTO users(first_name,last_name,email,username,password)" + "VALUES(?,?)";

        try (Connection conn = ConnectionFactoryUtility.getInstance().getConnection();

            PreparedStatement statement = conn.prepareStatement(SQL);){
            int count = 0;
            for (User user1 : users) {
                statement.setString(1, user1.getFirstName());
                statement.setString(2, user1.getLastName());

                statement.addBatch();
                count++;

                if (count % 50 == 0 || count == users.size()) {
                statement.executeBatch();
                }
            }


        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public User getUserById(int id) {
        return null;
    }


    public User getUserByUsername(String username) {
        return null;
    }

    public List<User> getAllUsers() {
        List<User> users = new ArrayList<>();

        try (Connection conn = ConnectionFactoryUtility.getInstance().getConnection()) {
            String sql = "SELECT * FROM Cartoons.users";

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

}