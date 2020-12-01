package com.zipcodewilmington.scientificcalculator;

import com.zipcodewilmington.scientificcalculator.Console;

public class Calculator {

    public static Double add(Double i, Double j) {
        Double result = i + j;
        Console.println("%s + %s = %s", i, j, result);
        return result;
    }

    public static Double subtract(Double i, Double j) {
        Double result = i - j;
        Console.println("%s - %s = %s", i, j, result);
        return result;
    }

    public static Double multiply(Double i, Double j) {
        Double result = i * j;
        Console.println("%s * %s = %s", i, j, result);
        return result;
    }

    public static Double divide(Double i, Double j) {
        if (j == 0 || i == 0) {
            Console.println("Err can't divide by zero");
            return 0.0;
        } else {
            Double result = i / j;
            Console.println("%s / %s = %s", i, j, result);
            return result;
        }
    }

    public static Double square(Double i) {
        Double result = Math.pow(i, 2);
        Console.println("%s ^ 2 = %s", i, result);
        return result;
    }

    public static Double squareRoot(Double i) {
        Double result = Math.sqrt(i);
        Console.println("%s = %s", i, result);
        return result;
    }

    public static Double toThePowerOf(Double i, Double j) {
        Double result = Math.pow(i, j);
        Console.println("%s ^ %s = %s", i, j, result);
        return result;
    }

    public static Double inverse(Double i) {
        Double result = 1 / i;
        Console.println("Inverse is %s",result);
        return result;

    }
    public static Double switchSign(Double i) {
        Double result = i *= -1;
        return result;
    }
}





