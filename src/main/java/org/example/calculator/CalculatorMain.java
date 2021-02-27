package org.example.calculator;

import static org.example.calculator.action.Calculator.calculate;
import static org.example.calculator.utils.Printer.print;

public final class CalculatorMain {
    public static void main(String[] args) {
        print("Result:", calculate());
    }
}
