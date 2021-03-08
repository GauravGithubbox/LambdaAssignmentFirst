package com.knoldus;


import java.util.function.IntBinaryOperator;

public class IntegerMax {
    public int CalculatingMax(int FirstInteger, int SecondInteger) {

        IntBinaryOperator operator = Math::max;

        int result = operator.applyAsInt(FirstInteger, SecondInteger);
       return result;
    }
}
