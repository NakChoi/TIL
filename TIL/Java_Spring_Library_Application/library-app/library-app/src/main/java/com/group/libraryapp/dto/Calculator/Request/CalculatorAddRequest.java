package com.group.libraryapp.dto.Calculator.Request;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CalculatorAddRequest {

    private final int number1;
    private final int number2;

    public int getNumber1() {
        return number1;
    }

    public int getNumber2() {
        return number2;
    }
}
