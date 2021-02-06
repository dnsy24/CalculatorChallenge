package org.example.calculator.operations.repo;

import org.example.calculator.operations.Operation;

public class DivideImpl implements Operation {
    @Override
    public double apply(double a, double b) {
        return a / b;
    }
}
