package com.cg.go.exceptions;

@SuppressWarnings("serial")
public class UserIdNotFoundException extends RuntimeException{
    public UserIdNotFoundException(String msg){
        super(msg);
    }

    public UserIdNotFoundException(String msg,Throwable e){
        super(msg,e);
    }
}
