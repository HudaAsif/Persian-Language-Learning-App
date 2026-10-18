package com.persianapp.exception;

/** Thrown when a chapter, component or glossary entry does not exist. */
public class NotFoundException extends RuntimeException {
    public NotFoundException(String message) {
        super(message);
    }
}
