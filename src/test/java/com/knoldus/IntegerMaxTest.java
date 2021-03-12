package com.knoldus;

import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;


public class IntegerMaxTest {

    @Test
    public void isMaxNumber() {
        IntegerMax obj = new IntegerMax();
        int val = obj.CalculatingMax("6", "5");
        Assert.assertEquals(6, val);

    }

    @Test
    public void checkForEqual() {
        IntegerMax obj = new IntegerMax();
        int val = obj.CalculatingMax("6", "6");
        Assert.assertEquals(6, val);

    }

    @Test
    public void checkForException() {
        IntegerMax obj = new IntegerMax();
        Assertions.assertThrows(NumberFormatException.class,()-> obj.CalculatingMax("6", "six"));

    }

}

