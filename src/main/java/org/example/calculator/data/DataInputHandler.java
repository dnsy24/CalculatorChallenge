package org.example.calculator.data;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DataInputHandler {

    public static List<String> inputData() {
        System.out.println("Enter two numbers and operation (+, -, *, /)");
        return new ArrayList<>() {{
            add(new Scanner(System.in).nextLine());
            add(new Scanner(System.in).nextLine());
            add(new Scanner(System.in).nextLine());
        }};
    }
}
