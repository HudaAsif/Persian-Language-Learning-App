package com.persianapp.exception;

/** Thrown when user input breaks a business rule (blank title, empty content, etc.). */
public class ValidationException extends RuntimeException {
    private final String field;

    public ValidationException(String field, String message) {
        super(message);
        this.field = field;
    }

    /** Name of the field that caused the error (needed for NFR-US-06). */
    public String getField() {
        return field;
    }
}
