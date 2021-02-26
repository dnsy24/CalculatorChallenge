package org.example.calculator.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static org.example.calculator.utils.Helper.print;
import static org.example.calculator.enums.Messages.MESSAGE;

public class DataInputHandler {
    public static List<String> inputData() {
        print(MESSAGE.getMessage());
        return new ArrayList<>() {{
            print("first number: ");
            add(new Scanner(System.in).nextLine());
            print("second number or press enter to skip: ");
            add(new Scanner(System.in).nextLine());
            print("operation: ");
            add(new Scanner(System.in).nextLine());
        }};
    }
}
