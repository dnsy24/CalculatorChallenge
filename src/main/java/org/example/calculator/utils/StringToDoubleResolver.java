package org.example.calculator.utils;

import io.vavr.control.Try;

public class StringToDoubleResolver {

    /**@param input is a String value which will be converted to double.
     * if input is empty the returned default value will be 0.0
     * */

    public static double getDoubleFromString(String input) {
//        return input.isEmpty() ? 0 : Double.parseDouble(input);
        return Try.of(() -> Double.parseDouble(input)).getOrElse(0.0);
    }

}
