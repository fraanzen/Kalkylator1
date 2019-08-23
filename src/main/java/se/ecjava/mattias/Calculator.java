package se.ecjava.mattias;

import java.util.Scanner;

/**
 * Kalkylator gjord för inlämningsuppgift.
 * Author: Mattias Franzén.
 */

public class Calculator {
    public static void main(String[] args) {
        boolean restart = true;
        Scanner scanner = new Scanner(System.in);
        {
            do {
                System.out.println("Welcome to this AWESOME calculator. Press Enter to start.");
                scanner.nextLine();
                System.out.println("Enter first number:");
                double firstNumber = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter second number:");
                double secondNumber = Double.parseDouble(scanner.nextLine());
                System.out.println("Enter arithmetic:");
                String arithmetic = scanner.nextLine();
                double result = 0;
                switch (arithmetic) {
                    case "+":
                        result = Arithmetic.addition(firstNumber, secondNumber);
                        break;
                    case "-":
                        result = Arithmetic.subtraction(firstNumber, secondNumber);
                        break;
                    case "*":
                        result = Arithmetic.multiplication(firstNumber, secondNumber);
                        break;
                    case "/":
                        result = Arithmetic.division(firstNumber, secondNumber);
                        break;
                    default:
                        scanner.nextLine();
                        System.out.println("Arithmetic is not supported");
                }
                System.out.println("Result: " + result);
                System.out.println("Press enter to start over.");
                scanner.nextLine();
                }while (restart);
            }
        }
    }