package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;


public class CalculatorTest {

    @BeforeEach
    void setUp() {

        Calculator calculator = new Calculator();
        System.out.println("Setting up calculator ");
    }

    //5 homework
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
        assertFalse(10 == calculator.calculateSumOfTwoIntegers(8, 4));

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
        assertFalse(-10 == calculator.calculateSumOfTwoIntegers(-8, -4));

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
        assertFalse(6 == calculator.calculateSubtractingOfTwoIntegers(12,4));

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
        assertFalse(-6 == calculator.calculateSubtractingOfTwoIntegers(-12,-4));

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

    //6 homework

    @Test
    public void checkingIfTwoPositiveNumbersAreDividedCorrectly()
    {
        Calculator calculator = new Calculator();
        assertEquals(3.355, calculator.calculateDivisionOfTwoNumbersWithFloatingPoint(7.55, 2.25), 0.001);
    }

    @Test
    public void checkingIfTwoNegativeNumbersAreDividedCorrectly()
    {
        Calculator calculator = new Calculator();
        assertEquals(4.87, calculator.calculateDivisionOfTwoNumbersWithFloatingPoint(-7.55, -1.55), 0.001);
    }


    @Test
    public void checkingIfTheTwoPositiveNumbersMultipliedCorrectly()
    {
        Calculator calculator = new Calculator();
        assertEquals(57.002, calculator.calculateMultiplicationsOfTwoNumbersWithFloatingPoint(7.55, 7.55), 0.001);

    }

    @Test
    public void checkingIfTheTwoNegativeNumbersMultipliedCorrectly()
    {
        Calculator calculator = new Calculator();
        assertEquals(10.343, calculator.calculateMultiplicationsOfTwoNumbersWithFloatingPoint(-7.55, -1.37), 0.001);

    }





}
