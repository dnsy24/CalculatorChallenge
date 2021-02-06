package org.example.calculator.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum OperationList {
    OPERATION("+", "-", "*", "/");

    private final String add;
    private final String subtract;
    private final String multiply;
    private final String delete;
}
