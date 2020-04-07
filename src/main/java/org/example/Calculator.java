package org.example;

import java.util.Arrays;

public class Calculator {
    public static int calculate(String formula) {
        if (formula.equals("")) {
            System.out.println("Exception");
            throw new NumberFormatException();
        }

        int result = 0;

        System.out.println("formula = " + formula);

        String[] formulaSplitted = formula.split("[\\s@*/&.?$+-]+");
        int firstNumber = Integer.parseInt(formulaSplitted[0]);
        int secondNumber = Integer.parseInt(formulaSplitted[1]);
        if (secondNumber == 0) {
            throw new ArithmeticException();
        }

        System.out.println("Array = " + Arrays.toString(formulaSplitted));

        if (formula.contains("+")) {
            result = firstNumber + secondNumber;
        } else if (formula.contains("-")) {
            result = firstNumber - secondNumber;
        } else if (formula.contains("/")) {
            result = firstNumber / secondNumber;
        } else if (formula.contains("*")) {
            result = firstNumber * secondNumber;
        }
        System.out.println("Result = " + result + "\n");

        return result;
    }
}
