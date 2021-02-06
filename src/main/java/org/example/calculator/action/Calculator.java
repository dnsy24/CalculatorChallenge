package org.example.calculator.action;

import org.example.calculator.exception.OperationNotFoundException;

import org.example.calculator.operations.Operation;
import org.example.calculator.operations.OperationResolver;

import java.util.List;

import static org.example.calculator.data.DataInputHandler.inputData;
import static org.example.calculator.data.InputPointer.*;

public class Calculator {
    public static double calculate() {
        final List<String> dataArr = inputData();
        final double numberOne = Double.parseDouble(dataArr.get(INPUT_ONE.getInput()));
        final double numberTwo = Double.parseDouble(dataArr.get(INPUT_TWO.getInput()));
        final String operationInput = dataArr.get(INPUT_THREE.getInput());

        Operation operation = OperationResolver
                .getOperation(operationInput)
                .orElseThrow(() -> new OperationNotFoundException("Invalid Operation " + operationInput));
        return operation.apply(numberOne, numberTwo);
    }
}
