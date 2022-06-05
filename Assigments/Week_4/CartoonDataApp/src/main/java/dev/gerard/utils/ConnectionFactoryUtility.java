package dev.gerard.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryUtility {

        private static final String url = "jdbc:postgresql://localhost:5432/Cartoon_DB";
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
                        return null;
                }

                return conn;
        }

}