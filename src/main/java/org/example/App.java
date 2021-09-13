/**
 * UCF COP3330 Fall 2021 Assignment 5 Solution
 * Copyright 2021 Emily Radney
 */

package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scnr = new Scanner(System.in);
        double principal, interest, rate, time, total;

        System.out.print("Enter the principal: ");
        principal = scnr.nextDouble();
        System.out.print("Enter the rate of interest: ");
        interest = scnr.nextDouble();
        rate = interest / 100;
        System.out.print("Enter the number of years: ");
        time = scnr.nextDouble();

        total = principal * (1 + (rate * time));

        System.out.println("After " + time + " years at " + interest + "%, the investment will be worth $" + String.format("%.2f", total) + ".");
    }
}
