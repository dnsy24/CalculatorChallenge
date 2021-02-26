package org.example.calculator.enums;

import lombok.*;

@Getter
@AllArgsConstructor
public enum OperationList {
    OPERATION("+", "-", "*", "/", "^2");

    private final String add;
    private final String subtract;
    private final String multiply;
    private final String delete;
    private final String square;
}
