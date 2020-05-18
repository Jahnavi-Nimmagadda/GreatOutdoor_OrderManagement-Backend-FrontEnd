package com.cg.go.exceptions;

@SuppressWarnings("serial")
public class OrderIdNotFoundException extends RuntimeException{
    public OrderIdNotFoundException(String msg){
        super(msg);
    }

    public OrderIdNotFoundException(String msg,Throwable e){
        super(msg,e);
    }
}
