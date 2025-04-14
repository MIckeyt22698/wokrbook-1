package com.pluralsight;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Keystrokes = new Scanner(System.in);

        System.out.println("First and last name:");
        String firstAndLastName = Keystrokes.nextLine();

        System.out.println("Hours Worked:");
        Float hoursWorked = Keystrokes.nextFloat();

        System.out.println("Hourly pay:");
        Float hourlyPay = Keystrokes.nextFloat();

        System.out.println("Calculating monthly pay...");

        System.out.println("First and last :" + firstAndLastName);
        System.out.println("Monthly pay :" + ((hoursWorked * hourlyPay) * 4));







    }










}