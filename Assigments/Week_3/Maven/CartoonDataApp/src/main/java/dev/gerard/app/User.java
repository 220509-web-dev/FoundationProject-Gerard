package dev.gerard.app;

import java.util.Objects;

public class User {
    private static int id;
    private String username;
    private String password;

    //No args: Constructor replaces the default constructor.
    public User(){super(); this.id++;}

    //one args: method to invoke a user with an id;
    public User(int id){super();this.id =id; this.id++;}

    //two args: method to invoke a user with a username and password.
    public User(String username, String password){
        super();
        this.username = username;
        this.password = password;
        this.id++;
    }

    public User(int id, String username, String password){
    super();
    this.id =id;
    this.username = username;
    this.password = password;
    this.id++;
    }

    //This method returns the user's id;
    public static int getId(){ return id;}
    /*TODO create a user id that automatically decrements
    when the user is deleted.
    * */

    public String getUserName() {return username;}
    //set the username
    public void setUsername(String username){this.username =username;}

    public String getPassword(){return  password;}
    //Set the password for the user.
    public void setPassword(String password){this.password = password;}


    //compairs an object.
    @Override
    public boolean equals(Object o){
        if(this == o) return true;
        if(o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return  id == user.id && Objects.equals(username,user.username)
                && Objects.equals(password,user.password);
    }

    @Override
    public int hashCode() {return Objects.hash(id,username,password);}

    @Override
    public String toString(){
        return "User{ "+
                "id = "+id+
                ", username = " + username + '\'' +
                ", password ="+ password  + '\'' +
                '}';
    }














}
