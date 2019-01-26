package com.stackroute.userservice.exceptions;

public class UserNotFoundException extends Exception {
    private String message;
    public UserNotFoundException(){}

    public UserNotFoundException(String tracknotfound){
        super(tracknotfound);
        this.message=tracknotfound;
    }
}
