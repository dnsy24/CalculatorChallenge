package org.example.calculator.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Messages {
    MESSAGE("Enter two numbers and operation (+, -, *, /)");

    private final String message;
}
