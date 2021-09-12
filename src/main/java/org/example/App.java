/*
 * UCF COP3330 Fall 2021 Assignment 22 Solution
 * Copyright 2021 Noah Taylor
 */

package org.example;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the first number: ");
        int numOne = input.nextInt();
        System.out.println("Enter the second number: ");
        int numTwo = input.nextInt();
        System.out.println("Enter the third number: ");
        int numThree = input.nextInt();

        if (numOne > numTwo && numOne > numThree)
            System.out.println("The largest number is " + numOne + ".");
        if (numTwo > numOne && numTwo > numThree)
            System.out.println("The largest number is " + numTwo + ".");
        if (numThree > numTwo && numThree > numOne)
            System.out.println("The largest number is " + numThree + ".");
    }
}