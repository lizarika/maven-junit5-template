package org.example;

public class Calculator {

    //5 subtracting and adding of two numbers
    public int calculateSumOfTwoIntegers (int firstNumber, int secondNumber){
        return firstNumber+secondNumber;
    }
    public int calculateSubtractingOfTwoIntegers (int firstNumber, int secondNumber){
        return firstNumber-secondNumber;
    }

    public boolean firstIntegerIsBiggerThanSecondInteger (int firstNumber, int secondNumber){
        return firstNumber>secondNumber;
    }

    //6 floating point division and multiplication method
    public double calculateDivisionOfTwoNumbersWithFloatingPoint(double firstNumber, double secondNumber){
        return firstNumber / secondNumber;
    }

    public double calculateMultiplicationsOfTwoNumbersWithFloatingPoint(double firstNumber, double secondNumber){
        return firstNumber * secondNumber;
    }

}
