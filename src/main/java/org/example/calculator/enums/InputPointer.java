package org.example.calculator.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum InputPointer {
    INPUT_ONE(0),
    INPUT_TWO(1),
    INPUT_THREE(2);

    private final int input;
}
