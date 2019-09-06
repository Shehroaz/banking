package com.sherry;

public class InValidCountryException extends Exception {

    InValidCountryException(){
        super();
    }
    public InValidCountryException(String Message){
        super(Message);
    }
}

