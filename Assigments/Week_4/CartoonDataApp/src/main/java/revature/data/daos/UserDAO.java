package revature.data.daos;

import javafx.beans.binding.ObjectExpression;
import revature.data.app.User;
import revature.data.utils.ConnectionFactoryUtility;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;

public class UserDAO {

    public List<User> getUsers() throws SQLException {
        if (ConnectionFactoryUtility.getInstance() != null) {

            Connection connect = ConnectionFactoryUtility.getConnection();
            String sql = "Select * From user";
            PreparedStatement pstmt = connect.prepareStatement(sql);
        }
        return null;

    }


    public void getUsers(ResultSet rs) throws SQLException {
        if (ConnectionFactoryUtility.getInstance() != null) {

            Connection connect = ConnectionFactoryUtility.getConnection();
            String sql = "Select * From user";
            PreparedStatement pstmt = connect.prepareStatement(sql);


            while (rs.next()) {
                User user = new User();


            }
        }
    }

    public HashMap<String, Object> AddUsers(){
        User someuser = new User();
        return  null;
    }
}