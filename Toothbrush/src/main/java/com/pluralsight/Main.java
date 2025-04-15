package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {
        displayBrushingSteps();
        String favorite = getFavoriteMovie();
        System.out.println("my favorite movie is: " + favorite);
        int result = addNumbers(12, 6);
        System.out.println("The sum is: " + result);
    }
    public static void displayBrushingSteps(){
        System.out.println("1. wet your brush.");
        System.out.println("2. apply toothpaste");
        System.out.println("3. brush your teeth for around 2 minutes");
    }
    public static String getFavoriteMovie(){
        return " The Dark Knight ";
    }
    public static int addNumbers(int a,int b){
        return a + b;}
}