package com.sherry;

public class InValidAccountNumberException extends Exception {

    InValidAccountNumberException(){
        super();
    }
    public InValidAccountNumberException(String Message){
        super(Message);

    }
}
