import org.example.Calculator;
import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void testCalculateAddition() {
        assertEquals(6, Calculator.calculate("4+2"));
    }

    @Test
    void testCalculateSubstraction() {
        assertEquals(2, Calculator.calculate("4-2"));
    }

    @Test
    void testCalculateMultiplication() {
        assertEquals(8, Calculator.calculate("4*2"));
    }

    @Test
    void testCalculateDivision() {
        assertEquals(2, Calculator.calculate("4/2"));
    }

    @Test
    void testCalculateDivisionByZero() {
        Assertions.assertThrows(ArithmeticException.class, () -> {
            Calculator.calculate("4/0");
        });
    }

    @Test
    void testCalculateEmptyString() {
        Assertions.assertThrows(NumberFormatException.class, () -> {
            Calculator.calculate("");
        });
    }

    @Test
    void testCalculateNull() {
        Assertions.assertThrows(NullPointerException.class, () -> {
            Calculator.calculate(null);
        });
    }
}