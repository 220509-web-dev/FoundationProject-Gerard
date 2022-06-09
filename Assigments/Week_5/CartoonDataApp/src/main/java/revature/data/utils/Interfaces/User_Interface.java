package revature.data.utils.Interfaces;
import revature.data.app.User;
import java.util.List;
public interface User_Interface {

    User createUser(User user);

    User getUserById(int id);
    User getUserByUsername(String username);

    List<User> getAllUsers();

    public void createMultipleUsers(List<User> users);
/*    User updateUser(User user);
    void deleteUserById(int id);*/

}