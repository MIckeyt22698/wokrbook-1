package com.pluralsight;

import java.util.Optional;

public class MathApp {
    public static void main(String[] args) {
// Question 1:
// declare variables here
double bobMonthlySalary =3672.43;
double garyMonthlySalary = 3984.36;
double highestMonthlySalary = Math.max(bobMonthlySalary, garyMonthlySalary);
// then code solution

// then use System.out.println() to display results
System.out.println("the highest salary is" + " " + highestMonthlySalary);
// ex: System.out.println("The answer is " + answer);

// REPEAT FOR NEXT EXERCISE

int carPrice = 47000;
int truckPrice = 42000;
int cheaperVehicle = Math.min(carPrice, truckPrice);

System.out.println("Beteween the two cars this is the cheaper option" + " " + cheaperVehicle);


double circleRadius = 7.25;
double radiusSquared = Math.pow(circleRadius, 2);
double areaOfCircle = Math.PI * radiusSquared;

        System.out.println("The are of the circle is" + " " + areaOfCircle + "!");

double randomNumber = 5.0;
double squareRoot = Math.sqrt(5);

System.out.println("The square root of" + " "+ randomNumber + " " + "is" + " " +squareRoot);

int x1 = 5, y1 = 10;
int x2 = 85, y2 = 50;

double distanceBetweenPoints = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

System.out.println("Distance between the points" +" " + "is" + " " + distanceBetweenPoints);

double number = -3.8;
double absoluteValue = Math.abs(number);

System.out.println("the absolute value is " + " " + absoluteValue);

double randomNumb = Math.random();
System.out.println("Random number between 0 and 1" + " " + randomNumb);


    }
}
