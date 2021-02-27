package org.example.calculator.utils;

import java.util.Arrays;

public class Printer {
    public static void print(Object... args) {
        Arrays.stream(args)
                .forEach(System.out::println);
    }
}
