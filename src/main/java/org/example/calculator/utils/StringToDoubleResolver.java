package org.example.calculator.utils;

public class StringToDoubleResolver {

    public static double getDoubleFromString(String input) {
        return input.isEmpty() ? 0 : Double.parseDouble(input);
    }

}
