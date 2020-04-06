package com.unitTestingCalc.demo;

public class Calculator {
    public int Add(String input) {

        try {
            String[] splittedValues = (input.replaceAll("\\s","").split("\\+"));

            var sum = 0;
            for (int i = 0; i < splittedValues.length; i++) {
                int values = Integer.parseInt(splittedValues[i]);
                sum += values;
            }

            return sum;
        }catch(NumberFormatException e){
            System.out.println("Number format exception occurred");
            return 0;
        }
    }
}
