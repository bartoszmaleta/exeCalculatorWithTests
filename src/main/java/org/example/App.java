package org.example;

import java.util.Arrays;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        Calculator.calculate("45*2");
        Calculator.calculate("2/2");
        Calculator.calculate("2+2");
        Calculator.calculate("2-2");

    }


    public static int calculate(String formula) {
        int result = 0;

        System.out.println("formula = " + formula);

        String[] formulaSplitted = formula.split("[\\s@*/&.?$+-]+");
        int firstNumber = Integer.parseInt(formulaSplitted[0]);
        int secondNumber = Integer.parseInt(formulaSplitted[1]);


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


        return result;
    }
}

