package com.sherry;

public class InValidIbanCheckSumException extends Exception {

    InValidIbanCheckSumException(){
        super();
    }
    public InValidIbanCheckSumException(String Message){
        super(Message);
    }
}


