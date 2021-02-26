package org.example.calculator.exception;

public class IncorrectInputException extends IllegalArgumentException{
    public IncorrectInputException(String message) {
        super(message);
    }
}
