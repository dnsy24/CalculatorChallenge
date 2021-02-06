package org.example.calculator.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataInputHandler {
    private static final String MESSAGE = "Enter two numbers and operation (+, -, *, /)";

    public static List<String> inputData() {
        System.out.println(MESSAGE);
        return new ArrayList<>() {{
            add(new Scanner(System.in).nextLine());
            add(new Scanner(System.in).nextLine());
            add(new Scanner(System.in).nextLine());
        }};
    }
}
