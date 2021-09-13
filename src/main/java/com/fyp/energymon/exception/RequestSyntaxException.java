package com.fyp.energymon.exception;

public class RequestSyntaxException extends RuntimeException {

    public RequestSyntaxException() {
    }

    public RequestSyntaxException(String message) {
        super(message);
    }

    public RequestSyntaxException(String message, Throwable cause) {
        super(message, cause);
    }

    public RequestSyntaxException(Throwable cause) {
        super(cause);
    }

}
