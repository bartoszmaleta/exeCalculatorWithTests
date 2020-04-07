package org.example;

import java.util.Arrays;

public class Calculator {
    public static int calculate(String formula) {
        int result = 0;

        System.out.println("formula = " + formula);

        String[] formulaSplitted = formula.split("[\\s@*/&.?$+-]+");

        System.out.println(Arrays.toString(formulaSplitted));

        return result;
    }
}
