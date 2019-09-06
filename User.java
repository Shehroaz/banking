package com.sherry;

import java.io.Serializable;

public class User  extends Person implements Serializable {
    String username;
    String password;

    /**
     * Constructor of User
     *
     */
    public  User(){}

    /**
     * User constructor give user info
     *
     * @param firstName First Name of the user
     * @param lastName Last Name of the user
     * @param username username of the user
     * @param password password of the user
     * @throws InValidNameException Exception for InValid Name
     */

    public  User(String firstName,String lastName,String username,String password) throws InValidNameException{
        super(firstName,lastName);
        this.setUsername(username);
        this.setPassword(password);
    }

    /**
     * Set Username
     *
     * @param username username of the user
     * @throws InValidNameException Exception for InValid Name
     */

    public void setUsername(String username) throws InValidNameException {
        if(username.matches("^[\\d\\w]{4,}$")){
        this.username = username;
    }else {
        throw new InValidNameException("Username must contain 4 character's or number's ");
    }}

    /**
     * Set Password
     *
     * @param password password of user accounts
     * @throws InValidNameException InValid Name Exception
     */


    public void setPassword(String password) throws InValidNameException {
        if(password.matches( "^.{6,}$")){
        this.password = password;
    }else{
            throw new InValidNameException("Password must be atleast 6 character's long ");
    }}

    /**
     * Get Password
     *
     * @return Password
     */

    public String getPassword() {
        return password;
    }

    /**
     * Get username
     *
     * @return username
     */

    public String getUsername() {
        return username;
    }
}
