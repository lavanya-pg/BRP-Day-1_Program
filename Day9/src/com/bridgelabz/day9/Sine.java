package com.bridgelabz.day9;

import java.util.Scanner;

public class Sine {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the angle: ");
		double number = sc.nextDouble();
		double result = Math.sin(number);
		System.out.println("The value of Sine is: " + result);
		sc.close();
	}
}
