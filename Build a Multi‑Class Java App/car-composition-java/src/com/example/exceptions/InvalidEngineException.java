package com.example.exceptions;

public class InvalidEngineException extends RuntimeException {
    public InvalidEngineException(String message) {
        super(message);
    }
}
