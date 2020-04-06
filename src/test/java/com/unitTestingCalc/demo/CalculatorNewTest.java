package com.unitTestingCalc.demo;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorNewTest {

    @Test
    public void ShouldAddedTwoNumbersPassedAsInputString() {
        String input = "2+3";
        Calculator calculator = new Calculator();

        int result = calculator.Add(input);

        Assertions.assertEquals(5,result);

    }

    @Test
    public void ShouldReturn0IfInputIsEmpty() {
        String input = "";
        Calculator calculator = new Calculator();

        int result = calculator.Add(input);

        Assertions.assertEquals(0,result);

    }

    @Test
    public void ShouldAddedThreeNumbersPassedAsInputString() {
        String input = " 2+3+ 5";
        Calculator calculator = new Calculator();

        int result = calculator.Add(input);

        Assertions.assertEquals(10,result);

    }
}
