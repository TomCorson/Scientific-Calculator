package com.zipcodewilmington.scientificcalculator;

public class Memory {

    public static Double saved = 0.0;


    public static void save(){
        Double i = Console.getDoubleInput("Enter a number to save");
        saved = i;
        Console.println( "%f added to memory",saved);
    }
    public static void clearMemory() {
        saved = 0.0;
        Console.println("Memory cleared");
    }
    public static void checkMemory(){
        Console.println("Current memory is " + saved);
    }

}
