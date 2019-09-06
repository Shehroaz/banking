package com.sherry;

import java.io.Serializable;

public class Person implements Serializable {
    private String firstName;
    private String lastName;

    /**
     * Default constructor
     */
    public Person(){}

    /**
     * Create constructor
     *
     * @param firstName First Name of the user
     * @param lastName Last Name of the user
     * @throws InValidNameException Exception about InValid Name
     */

    public Person(String firstName,String lastName)throws InValidNameException{
        this.setFirstName(firstName);
        this.setLastName(lastName);

    }

    /**
     * Create First Name First Name of the user
     *
     * @param firstName First  Name of the user
     * @throws InValidNameException Exception about InValid Name
     */

    public void setFirstName(String firstName) throws InValidNameException{
        if (firstName.matches("^[a-zA-Z]*$")) {
            this.firstName = firstName;
        }else{
            throw new InValidNameException("First Name can only contain's letter's");
    } }

    /**
     * Get First Name First  Name of the user
     *
     * @return  First  Name of the user
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * Create Last Name
     * @param lastName Last  Name of the user
     * @throws InValidNameException Exception about InValid Name
     */

    public void setLastName(String lastName) throws InValidNameException {
        if (lastName.matches("^[a-zA-Z]*$")) {
            this.lastName = lastName;
        }else{
            throw new InValidNameException("Last Name can only contain's letter's");
        }
    }

    /**
     * Get Last Name
     * @return Last Name
     */

    public String getLastName() {
        return lastName;
    }
}
