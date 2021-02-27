package org.example.calculator.action;

import org.example.calculator.exception.IncorrectInputException;
import org.example.calculator.exception.OperationNotFoundException;
import org.example.calculator.operations.Operation;
import org.example.calculator.operations.OperationResolver;

import java.util.List;

import static org.example.calculator.data.DataInputHandler.inputData;
import static org.example.calculator.enums.InputPointer.*;
import static org.example.calculator.enums.OperationList.OPERATION;
import static org.example.calculator.utils.OutputFormatter.outputFormatterUs;
import static org.example.calculator.utils.StringToDoubleResolver.getDoubleFromString;

public class Calculator {
    public static String calculate() {
        List<String> dataArr = inputData();
        final double inputOne = getDoubleFromString(dataArr.get(INPUT_ONE.getInput()));
        final double inputTwo = getDoubleFromString(dataArr.get(INPUT_TWO.getInput()));
        final String operationInput = dataArr.get(INPUT_THREE.getInput());
        if (inputTwo == 0 && !operationInput.contains(OPERATION.getSquare()))
            throw new IncorrectInputException("Check your input values");
        Operation operation = OperationResolver
                .getOperation(operationInput)
                .orElseThrow(() -> new OperationNotFoundException("Invalid Operation " + operationInput));
//        return operation.apply(inputOne, inputTwo);
        return outputFormatterUs(operation.apply(inputOne, inputTwo));
    }
}
