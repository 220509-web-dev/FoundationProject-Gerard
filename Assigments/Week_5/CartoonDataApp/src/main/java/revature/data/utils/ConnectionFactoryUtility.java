package revature.data.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryUtility {

        private static final String url = "jdbc:postgresql://localhost:5432/postgres";
        private static final String user = "postgres";
        private static final String password = "bones";


        private static ConnectionFactoryUtility instance;
        private ConnectionFactoryUtility(){super();}


public static ConnectionFactoryUtility getInstance() {
                if(instance == null){
                        instance = new ConnectionFactoryUtility();
                }
                return instance;
}


        public static Connection getConnection() {
                Connection conn = null;

                try {
                        Connection connection = DriverManager.getConnection(url,user,password);
                        System.out.println("Connection was successful!");
                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Sorry, connection failed..Not sure why?");
                        return null;
                }

                return conn;
        }

}