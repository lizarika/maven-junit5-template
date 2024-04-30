package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CalculatorTest {

    @Test
    public void checkingTheAdditionOfTwoPositiveNumbers()
    {
        Calculator calculator = new Calculator();
        assertEquals(12, calculator.calculateSumOfTwoIntegers(8, 4));
    }

    @Test
    public void checkingTheAdditionOfTwoPositiveNumbersFailed()
    {
        Calculator calculator = new Calculator();
        assertEquals(10, calculator.calculateSumOfTwoIntegers(8, 4));

    }

    @Test
    public void checkingTheAdditionOfTwoNegativeNumbers()
    {
        Calculator calculator = new Calculator();
        assertEquals(-12, calculator.calculateSumOfTwoIntegers(-8, -4));

    }

    @Test
    public void checkingTheAdditionOfTwoNegativeNumbersFailed()
    {
        Calculator calculator = new Calculator();
        assertEquals(-10, calculator.calculateSumOfTwoIntegers(-8, -4));

    }


    @Test
    public void checkingTheSubtractingOfTwoNumbers()
    {
        Calculator calculator = new Calculator();
        assertEquals(8, calculator.calculateSubtractingOfTwoIntegers(12,4));

    }

    @Test
    public void checkingTheSubtractingOfTwoNumbersFailed()
    {
        Calculator calculator = new Calculator();
        assertEquals(6, calculator.calculateSubtractingOfTwoIntegers(12,4));

    }

    @Test
    public void checkingTheSubtractingOfTwoNegativeNumbers()
    {
        Calculator calculator = new Calculator();
        assertEquals(-8, calculator.calculateSubtractingOfTwoIntegers(-12,-4));

    }

    @Test
    public void checkingTheSubtractingOfTwoNegativeNumbersFailed()
    {
        Calculator calculator = new Calculator();
        assertEquals(-6, calculator.calculateSubtractingOfTwoIntegers(-12,-4));

    }

    @Test
    public void checkingTheFirstNumberIsBiggerThanSecondNumber()
    {
        Calculator calculator = new Calculator();
        assertTrue(5>3);

    }

    @Test
    public void checkingTheFirstNumberIsBiggerThanSecondNumberFailed()
    {
        Calculator calculator = new Calculator();
        assertFalse(3>5);

    }

    @Test
    public void checkingTheSecondNumberIsBiggerThanFirstNumber()
    {
        Calculator calculator = new Calculator();
        assertTrue(3<5);

    }

    @Test
    public void checkingTheFirstNumberEqualsSecondNumber()
    {
        Calculator calculator = new Calculator();
        assertTrue(5==5);

    }

}
