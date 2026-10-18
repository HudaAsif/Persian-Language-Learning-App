package com.persianapp.exception;

/** Wraps SQL/IO problems coming from the data layer. */
public class DataAccessException extends RuntimeException {
    public DataAccessException(String message, Throwable cause) {
        super(message, cause);
    }
}
