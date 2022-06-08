package revature.data.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryUtility {

        private static final String url = "jdbc:postgresql://localhost:5432/postgres";
        private static final String user = "postgres";
        private static final String password = "bones";


        private static ConnectionFactoryUtility connection;
        private ConnectionFactoryUtility(){super();}



public static ConnectionFactoryUtility getInstance() {
                if(connection == null){
                        connection= new ConnectionFactoryUtility();
                }
                return connection;

}
    static {
        try {
            Class.forName("org.postgresql.Driver");
        } catch (Exception e) {
            System.err.println("Failed to load PostgreSQL Driver");
            throw new RuntimeException(e); // fail fast
        }
    }

        public static Connection getConnection() {
                Connection conn = null;

                try {
                         conn = DriverManager.getConnection(url,user,password);
                        System.out.println("Connection was successful!");
                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Sorry, connection failed..Not sure why?");

                }

                return conn;
        }

}
