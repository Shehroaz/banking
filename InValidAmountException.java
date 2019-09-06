package com.sherry;



public class InValidAmountException extends  Exception{

   InValidAmountException(){
        super();

    }
    public InValidAmountException(String Message){
        super(Message);
    }
}
