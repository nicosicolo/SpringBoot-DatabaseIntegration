package org.nsicolo.databaseintegration.exceptions;

public class UserNotFoundException extends RuntimeException {
    private String message;

    public UserNotFoundException() {};

    public UserNotFoundException(String message) {
        super(message);
        this.message = message;
    }
}
