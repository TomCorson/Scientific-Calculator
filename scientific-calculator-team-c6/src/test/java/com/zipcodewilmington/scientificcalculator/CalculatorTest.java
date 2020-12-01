package com.zipcodewilmington.scientificcalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class CalculatorTest {

    @Test
    public void add() {
        Double num1 = 4.0;
        Double num2 = 6.0;
        Double expectedResult = 10.0;
        Double  actualResult = Calculator.add(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void subtract() {
        Double num1 = 4.0;
        Double num2 = 6.0;
        Double expectedResult = -2.0;
        Double  actualResult = Calculator.subtract(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void multiply() {
        Double num1 = 123.0;
        Double num2 = 2.0;
        Double expectedResult = 246.0;
        Double  actualResult = Calculator.multiply(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void divide() {
        Double num1 = 55.8;
        Double num2 = 6.2;
        Double expectedResult = 9.0;
        Double  actualResult = Calculator.divide(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void square() {
        Double num1 = 33.0;
        Double expectedResult = 1089.0;
        Double  actualResult = Calculator.square(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void squareRoot() {
        Double num1 = 121.0;
        Double expectedResult = 11.0;
        Double  actualResult = Calculator.squareRoot(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void toThePowerOf() {
        Double num1 = 8.0;
        Double num2 = 4.0;
        Double expectedResult = 4096.0;
        Double actualResult = Calculator.toThePowerOf(num1, num2);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public void inverse() {
        Double num1 = 3.0;
        Double expectedResult = 0.3333333333333333;
        Double actualResult = Calculator.inverse(num1);
        assertEquals(expectedResult, actualResult);
    }
    @Test
    public  void switchSign(){
        Double num1 = -44.0;
        Double expectedResult = 44.0;
        Double actualResult = Calculator.switchSign(num1);
        assertEquals(expectedResult, actualResult);
    }
}