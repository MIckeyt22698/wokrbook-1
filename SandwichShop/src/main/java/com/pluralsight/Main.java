package com.pluralsight;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner keyStrokes = new Scanner(System.in);

        System.out.println("Choose your sandwich size");
        System.out.print(" Either 'R' or 'L': ");
        String size = keyStrokes.nextLine();

        double basePrice;
        if (size.equals("R")) {
            basePrice = 5.45;
        } else if (size.equals("L")) {
            basePrice = 8.95;
        } else {
            System.out.println("Invalid sandwich size. Exiting.");
            return;
        }


        System.out.print("What is your age: ");
        double age = keyStrokes.nextDouble();

        System.out.println("Calculating Discount");

        double discount = 0.0;

        if (age <= 17) {discount =0.10;}

            else if (age >= 64) {discount = 0.20;}

            else System.out.println("No discount applied");

        double finalPrice = basePrice - (basePrice * discount);

        System.out.printf("your total is: $%.2f%n", finalPrice);
        }


    }
