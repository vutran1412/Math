package com.vu;

import java.util.Scanner;
import java.math.*;
import java.util.Random;

public class Math {

    public static void main(String[] args) {
	// write your code here
        int seconds = 60;
        int min = seconds * 60;
        int hour = min * 60;
        int day = hour * 24;

        Scanner num = new Scanner(System.in);
        System.out.println("How long is you favorite song?");
        int song = num.nextInt();
        double songInSeconds = song * 60;
        System.out.println("Your favorite song is " + songInSeconds + " seconds long!");
        System.out.println();

        System.out.println("There are " + day + " seconds in a day");
        System.out.println();

        System.out.println("What is the length of a side of a square? ");
        double lengthOfSquare = num.nextDouble();
        double areaOfSquare = lengthOfSquare * lengthOfSquare;
        System.out.println("The Area of the square is " + areaOfSquare);
        System.out.println();

        System.out.println("What is the number of miles you have to travel?");
        double miles = num.nextDouble();
        double kilometers = miles * 1.6;
        System.out.println("You have to travel " + kilometers + " kilometers");
        System.out.println();

        System.out.println("What is the price of an item before tax? The sales tax is 5%");
        double price = num.nextDouble();
        double totalPrice = price * 1.05;
        System.out.println("The total price with tax is " + totalPrice);
        System.out.println();

        System.out.println("Please enter a number: ");
        int number = num.nextInt();
        if (number % 2 == 0) {
            System.out.println("The number is even");
        } else {
            System.out.println("The number is odd");
        }
        if (number % 10 == 0) {
            System.out.println("The number is divisible by 10");
        }
        System.out.println();

        System.out.println(java.lang.Math.PI);
        System.out.println();

        Random integer = new Random(100-1);
        System.out.println(integer);








    }
}
