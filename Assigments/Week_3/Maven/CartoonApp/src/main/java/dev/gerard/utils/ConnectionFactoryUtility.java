package dev.gerard.utils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactoryUtility {

        private static ConnectionFactoryUtility instance;
        private ConnectionFactoryUtility(){super();}


public static ConnectionFactoryUtility getInstance() {
                if(instance == null){
                        instance = new ConnectionFactoryUtility();
                }
                return instance;
}


        public static Connection getConnection() {
                try {
                        String dbInfo = "jdbc:postgresql://localhost/Cartoon_DB:5432?user=postgres&password=gman";
                        Connection connection = DriverManager.getConnection(dbInfo);
                        return connection;
                } catch (SQLException e) {
                        e.printStackTrace();
                        return null;
                }


        }

}