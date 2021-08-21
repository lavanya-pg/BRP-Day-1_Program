package com.bridgelabz.day1;

import java.util.Scanner; // Import the Scanner class
public class LeapYear {
    // Method to check leap year
    public static void checkLeapYear(int year) {
        if (year % 400 == 0) {
            System.out.println(year + " is a leap year.");
        } else if (year % 100 == 0) {
            System.out.println(year + " is not a leap year.");
        } else if (year % 4 == 0) {
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }
    }
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in); // Create a Scanner object
        System.out.println("Enter a year to check:");
        int year = s.nextInt(); // Read user input from command line
        checkLeapYear(year);
    }
}