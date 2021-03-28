package com.epam.array.exception;

public class ArrayValidateException extends Exception {

    public ArrayValidateException() {
    }

    public ArrayValidateException(String message) {
        super(message);
    }

    public ArrayValidateException(String message, Throwable cause) {
        super(message, cause);
    }

    public ArrayValidateException(Throwable cause) {
        super(cause);
    }
}