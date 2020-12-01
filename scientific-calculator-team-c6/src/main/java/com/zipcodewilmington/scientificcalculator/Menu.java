package com.zipcodewilmington.scientificcalculator;

import java.util.Scanner;

public class Menu {
    public static void runMenu() {
        boolean running = true;
        Double displayNum = 0.0;
        Double userNum = 0.0;
        Double userNum2 = 0.0;
        Integer userInt = 0;
        String displaySting = "";
        while(running == true) {
            Console.println(displayNum.toString());
            Console.println("Calculator Main Menu:");
            Console.printMenuOptions();
            Integer userInput = Console.getIntegerInput("Enter Option Number: ");

            switch (userInput) {
                case 0:
                    displayNum = 0.0;
                    Console.println("Cleared \n0.0");
                    break;
                case 1:
                    userNum = Console.getDouble();
                    userNum2 = Console.getDouble();
                    displayNum = Calculator.add(userNum,userNum2);
                    break;
                case 2:
                    userNum = Console.getDouble();
                    userNum2 = Console.getDouble();
                    displayNum = Calculator.subtract(userNum,userNum2);
                    break;
                case 3:
                    userNum = Console.getDouble();
                    userNum2 = Console.getDouble();
                    displayNum = Calculator.multiply(userNum,userNum2);
                    break;
                case 4:
                    userNum = Console.getDouble();
                    userNum2 = Console.getDouble();
                    displayNum = Calculator.divide(userNum,userNum2);
                    break;
                case 5:
                    userNum = Console.getDouble();
                    displayNum = Calculator.square(userNum);
                    break;
                case 6:
                    userNum = Console.getDouble();
                    displayNum = Calculator.squareRoot(userNum);
                    break;
                case 7:
                    userNum = Console.getDouble();
                    userNum2 = Console.getDouble();
                    displayNum = Calculator.toThePowerOf(userNum,userNum2);
                    break;
                case 8:
                    userNum = Console.getDouble();
                    displayNum = Calculator.inverse(userNum);
                    break;
                case 9:
                    userNum = Console.getDouble();
                    displayNum = Calculator.switchSign(userNum);
                    break;
                case 10:
                        userNum = Console.getDouble();
                        displayNum = SciFunctions.factorial(userNum);
                           break;
                case 11:
                    userNum = Console.getDouble();
                    displayNum = SciFunctions.multiplyByPi(userNum);
                    break;
                case 12:
                    userNum = Console.getDouble();
                    displayNum = SciFunctions.celToFar(userNum);
                    break;
                case 13:
                    Console.printTrigFunctionsMenuOptions();
                    Integer trigMenuOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (trigMenuOption) {
                          case 1:
                              userNum = Console.getDouble();
                              displayNum = SciFunctions.sin(userNum);
                              break;
                        case 2:
                            userNum = Console.getDouble();
                            displayNum = SciFunctions.cos(userNum);
                            break;
                        case 3:
                            userNum = Console.getDouble();
                            displayNum = SciFunctions.tan(userNum);
                            break;
                        case 4:
                            userNum = Console.getDouble();
                            displayNum = SciFunctions.sec(userNum);
                            break;
                        case 5:
                            userNum = Console.getDouble();
                            displayNum = SciFunctions.csc(userNum);
                            break;
                        case 6:
                            userNum = Console.getDouble();
                            displayNum = SciFunctions.cot(userNum);
                            break;
                        default:
                            Console.println("Invalid entry!");
                            break;
                    }

                    break;
                case 14:
                    Console.switchTrigUnitsMenu();
                    Integer trigUnitOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (trigUnitOption) {
                        case 1:
                            userNum = Console.getDouble();
                            displayNum = SciFunctions.degrees(userNum);
                            break;
                        case 2:
                            userNum = Console.getDouble();
                            displayNum = SciFunctions.radians(userNum);
                            break;
                        default:
                            Console.println("Invalid entry!");
                            break;
                    }
                    break;
                case 15:
                    Console.logarithmicFunctionsMenu();
                    Integer logFuncOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (logFuncOption) {
                        case 1:
                            userNum = Console.getDouble();
                            displayNum = SciFunctions.log(userNum);
                            break;
                        case 2:
                            userNum = Console.getDouble();
                            displayNum = SciFunctions.naturalLog(userNum);
                            break;
                        case 3:
                            userNum = Console.getDouble();
                            displayNum = SciFunctions.inverseLog(userNum);
                            break;
                        case 4:
                            userNum = Console.getDouble();
                            displayNum = SciFunctions.inverseNaturalLog(userNum);
                            break;
                        default:
                            Console.println("Invalid entry!");
                            break;
                    }
                    break;
                case 16:
                    Console.switchDisplayModeMenu();
                    Integer switchDisplayOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (switchDisplayOption) {
                        case 1:
                            userInt = Console.getInteger();
                            Console.println(SciFunctions.binary(userInt));
                            break;
                        case 2:
                            userInt = Console.getInteger();
                            Console.println(SciFunctions.octal(userInt));
                            break;
                        case 3:
                            userInt = Console.getInteger();
                            Console.println(SciFunctions.decimal(userInt));
                            break;
                        case 4:
                            userInt = Console.getInteger();
                            Console.println(SciFunctions.hexadecimal(userInt));
                            break;
                        default:
                            Console.println("Invalid entry!");
                            break;
                    }
                    break;
                case 17:
                    Console.memorySettingsMenu();
                    Integer memoryOption = Console.getIntegerInput("Enter Option Number: ");
                    switch (memoryOption) {
                        case 1:
                            Memory.save();
                            break;
                        case 2:
                            Memory.clearMemory();
                            break;
                        case 3:
                            Memory.checkMemory();
                            break;
                        default:
                            Console.println("Invalid entry!");
                            break;
                    }
                    break;
                case 18:
                    Console.println("Good Bye");
                    running = false;
                    break;

                default:
                    Console.println("Invalid entry!");
                    break;
            }
        }

        }

    }



