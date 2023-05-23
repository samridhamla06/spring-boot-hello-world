package com.javatpoint.router.exception;

/**
 * boolean rateLimit(int customerId)
 */
public enum ErrorCode {
    INCORRECT_PATH("400.1");

    private String errorCode;

    ErrorCode(String errorCode) {
        this.errorCode = errorCode;
    }

    @Override
    public String toString() {
        return "ErrorCode{" +
                "errorCode='" + errorCode + '\'' +
                '}';
    }
}
