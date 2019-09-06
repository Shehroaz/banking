package com.sherry;

public class InValidNameException extends Exception {

        InValidNameException(){
            super();
        }
        public InValidNameException(String Message){
            super(Message);
        }
    }

