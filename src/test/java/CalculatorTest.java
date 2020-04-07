import org.example.Calculator;
import org.junit.Assert;
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
        try {
            Calculator.calculate("4/0");
        }
        catch (ArithmeticException e) {
            Assert.fail("Exception " + e);
        }

//        ArithmeticException thrown = assertThrows(
//                ArithmeticException.class,
//                () -> Calculator.calculate("4/0"));
    }
}