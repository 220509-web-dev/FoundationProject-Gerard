package revature.data.app;
import revature.data.daos.UserDAO;
import revature.data.utils.ConnectionFactoryUtility;
import revature.data.utils.Interfaces.User_Interface;


public class ConnectionApp {

    public static void main(String[] args) {

        //System.out.println(ConnectionFactoryUtility.getConnection());
        ConnectionFactoryUtility.getConnection();

      /*  User_Interface user_interface = new UserDAO();
        System.out.println(user_interface.getAllUsers().size());*/



    }
}