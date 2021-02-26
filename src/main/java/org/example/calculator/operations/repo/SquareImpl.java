package org.example.calculator.operations.repo;

import org.example.calculator.operations.Operation;

public class SquareImpl implements Operation {
    @Override
    public double apply(double a, double b) {
        return a == 0 ? b * b : a * a;
    }
}
