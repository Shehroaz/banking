package com.sherry;

public class NotEnoughAmountException extends Exception {

    NotEnoughAmountException(){
        super();
    }
    public NotEnoughAmountException(String Message){
        super(Message);
    }
}
