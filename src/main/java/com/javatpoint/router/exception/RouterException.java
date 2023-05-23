package com.javatpoint.router.exception;

abstract class RouterException extends Exception{
    private ErrorCode errorCode;

    public RouterException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }

    public ErrorCode getErrorCode(){
        return errorCode;
    }
}
