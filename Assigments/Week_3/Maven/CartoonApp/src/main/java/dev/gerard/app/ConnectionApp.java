package dev.gerard.app;
import dev.gerard.utils.ConnectionFactoryUtility;


public class App {

    public static void main(String[] args) {
        System.out.println(ConnectionFactoryUtility.getConnection());
    }
}
