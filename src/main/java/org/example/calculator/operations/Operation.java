package org.example.calculator.operations;

@FunctionalInterface
public interface Operation {
    double apply(double a, double b);
}
