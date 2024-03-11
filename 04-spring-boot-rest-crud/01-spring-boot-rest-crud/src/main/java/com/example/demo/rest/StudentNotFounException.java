package com.example.demo.rest;

public class StudentNotFounException extends RuntimeException{
    public StudentNotFounException(String message) {
        super(message);
    }

//    public StudentNotFounException(String message, Throwable cause) {
//        super(message, cause);
//    }
//
//    public StudentNotFounException(Throwable cause) {
//        super(cause);
//    }
}
