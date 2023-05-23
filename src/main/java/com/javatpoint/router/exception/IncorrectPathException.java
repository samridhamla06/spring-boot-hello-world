package com.javatpoint.router.exception;

public class IncorrectPathException extends RouterException{
    public IncorrectPathException(String message, ErrorCode errorCode) {
        super(message, errorCode);
    }
}
