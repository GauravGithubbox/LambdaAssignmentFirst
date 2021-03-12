package com.knoldus;


import java.util.function.IntBinaryOperator;

public class IntegerMax {
    public Integer CalculatingMax(String FirstInteger, String SecondInteger) {


        IntBinaryOperator operator = Math::max;
        try {
            int result = operator.applyAsInt(Integer.parseInt(FirstInteger), Integer.parseInt(SecondInteger));

            return result;
        } catch (Exception e){
            System.out.println(" Enter Integer Number only  "+e);
            throw new NumberFormatException();
        }

    }

}

