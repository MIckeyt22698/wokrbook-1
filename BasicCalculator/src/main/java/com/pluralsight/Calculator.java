package com.pluralsight;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double firstNumber = myScanner.nextDouble();

        System.out.print("Enter second number: ");
        double secondNumber = myScanner.nextDouble();

        myScanner.nextLine();

        System.out.println("What do you want to do? ");
        System.out.print(" Enter 'A' 'S' 'M' 'D': ");
        String input = myScanner.nextLine();

        System.out.println("Preparing to do math... ");

        if (input.equals("A")) {
            double result = firstNumber + secondNumber;
            System.out.println(firstNumber + " + " + secondNumber + " = " + result);}

            else if (input.equals("S")){
                double subtractionResult = firstNumber - secondNumber;
            System.out.println(firstNumber + " - " + secondNumber + " = " + subtractionResult);}

            else if (input.equals("M")){
                    double multiplicationResult = firstNumber * secondNumber;
                    System.out.println(firstNumber + " * " + secondNumber + " = " + multiplicationResult);}

            else if (input.equals("D")){
                double divisionResult = firstNumber / secondNumber;
                System.out.println(firstNumber + " / " + secondNumber + " = " + divisionResult);}



                }
            }











