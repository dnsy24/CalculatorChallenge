package org.example.calculator.exception;

public class OperationNotFoundException extends IllegalArgumentException {
    public OperationNotFoundException(String message) {
        super(message);
    }
}
