package revature.data.app;
import revature.data.utils.ConnectionFactoryUtility;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

public class User {
    private static int id;
    private String firstName;
    private String lastName;
    private String email;
    private String password;


    public User() {
    }

    public static void setId(int id) {
        User.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public User(int id,String firstName, String lastName, String email, String password) {
        this.id =id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.password = password;
    }


    public static int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    public String toString() {
        return "User{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
    /*UserMethods------------------------------*******----Functions for the User Class---**-----------*/


    public User getByUsername(String username){
        //if there is no instance of a connection create one.
        if (ConnectionFactoryUtility.getInstance() != null) {

            String sql = "Select * From ers_user Where username = ?";

            //Todo complete this method.
        }
        //return null for now.
        return null;
    }


    public User getById(int id ){
        if(ConnectionFactoryUtility.getConnection() != null) {
            //Todo complete this method.
        }
        return null;
    }

    public List<User> getAllUsers(){

        //Todo complete this method.
        return null;
    }

    public int createUser(User user){

        //Todo complete this method.

        return user.getId();
    }




}




