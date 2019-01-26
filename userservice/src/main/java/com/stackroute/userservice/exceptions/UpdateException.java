package com.stackroute.userservice.exceptions;

public class UpdateException extends Exception {
    private String message;
    public UpdateException(){}

    public UpdateException(String message){
        super(message);
        this.message=message;
    }
}
