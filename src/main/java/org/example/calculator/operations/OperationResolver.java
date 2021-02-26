package org.example.calculator.operations;

import org.example.calculator.operations.repo.*;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import static org.example.calculator.enums.OperationList.*;

public class OperationResolver {
    private static final Map<String, Operation> OPERATION_MAP = new HashMap<>();

    static {
        OPERATION_MAP.put(OPERATION.getAdd(), new AddImpl());
        OPERATION_MAP.put(OPERATION.getSubtract(), new SubtractImpl());
        OPERATION_MAP.put(OPERATION.getMultiply(), new MultiplyImpl());
        OPERATION_MAP.put(OPERATION.getDelete(), new DivideImpl());
        OPERATION_MAP.put(OPERATION.getSquare(), new SquareImpl());
    }

    public static Optional<Operation> getOperation(String operator) {
        return Optional.ofNullable(OPERATION_MAP.get(operator));

    }
}
