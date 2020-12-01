package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

/**
 * Created by leon on 2/9/18.
 */
public class Console {

    public static void print(String output, Object... args) {
        System.out.printf(output, args);
    }

    public static void println(String output, Object... args) {
        print(output + "\n", args);
    }

    public static String getStringInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        String userInput = scanner.nextLine();
        return userInput;
    }

    public static Double getDoubleInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Double userInput = scanner.nextDouble();
        return userInput;

    }
    public static Integer getIntegerInput(String prompt){
        Scanner scanner = new Scanner(System.in);
        println(prompt);
        Integer userInput = scanner.nextInt();
        return userInput;
    }
   // public static Double getDoubleInput(String prompt) {
       // return null;
    //}
    public static void printMenuOptions() {
        Console.println(" 0:Clear 1:Add  2:Subtract  3:Multiply 4:Divide 5:Square 6:Square Root" +

                " 7:Exponent 8:Inverse 9:Switch Sign \n10:Pi 11:Factorial 12:Celsius to Fahrenheit " +

                " 7:Exponent 8:Inverse 9:Switch Sign \n10:Factorial 11:Multiply by Pi 12:Celsius to Fahrenheit " +

                "13:Trig Functions Menu 14:Switch Trig Units Menu \n15:Logarithmic Functions Menu  " +
                "16:Switch Number Display Menu  17:Memory Settings Menu 18:Quit");
    }
    public static void printTrigFunctionsMenuOptions() {
        Console.println("Trig Functions Menu: \n 1:Sine 2:Cosine 3:Tangent " +
                "4:Inverse Sine \n5:Inverse Cosine 6:Inverse Tangent");
    }
    public static void switchTrigUnitsMenu() {
        Console.println("Switch Trig Units Menu: \n 1:Degrees 2:Radians");
    }

    public static void logarithmicFunctionsMenu(){
        Console.println("Logarithmic Functions Menu: \n" +
                "1:Log 2:Inverse Logarithm 3:Natural Logarithm 4:Inverse Natural Logarithm");
    }
    public static void switchDisplayModeMenu(){
        Console.println("Switch Number Display Menu: \n" +
                "1:Binary 2:Octal 3:Decimal 4:Hexadecimal");
    }
    public static void memorySettingsMenu(){
        Console.println("Memory Settings Menu: \n" +
                "1:Add Value To Memory 2:Clear Memory 3:Recall Memory");
    }
    public static Double getDouble(){
        Double i = Console.getDoubleInput("Enter number");
        return i;
    }
    public static Integer getInteger(){
        Integer i = Console.getIntegerInput("Enter number");
        return i;
    }
}
