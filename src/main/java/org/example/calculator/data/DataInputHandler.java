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
            add(new Scanner(System.in).nextLine());
            add(new Scanner(System.in).nextLine());
            add(new Scanner(System.in).nextLine());
        }};
    }
}
