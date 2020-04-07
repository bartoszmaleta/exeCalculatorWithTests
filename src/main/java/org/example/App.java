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

        Calculator.calculate("2*2");
        Calculator.calculate("2/2");
        Calculator.calculate("2+2");
        Calculator.calculate("2-2");

    }


    public static int calculate(String formula) {
        int result = 0;

        System.out.println("formula = " + formula);

        String[] formulaSplitted = formula.split("[\\s@*/&.?$+-]+");

        System.out.println("Array = " + Arrays.toString(formulaSplitted));

        return result;
    }
}

