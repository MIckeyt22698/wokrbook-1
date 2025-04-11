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
        String action = myScanner.nextLine();

        System.out.println("Preparing to do math... ");


        ;
    }
}