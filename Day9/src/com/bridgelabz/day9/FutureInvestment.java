package com.bridgelabz.day9;

import java.util.Scanner;

public class FutureInvestment {
	public static double FutureValue(double C, double r, double T) {
		double fiv = C * Math.pow((1 + r / 100), T);
		return fiv;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Present Value: ");
		double C = sc.nextDouble();
		System.out.println("Enter the interest rate: ");
		double r = sc.nextDouble();
		System.out.println("Enter the time period in years: ");
		double T = sc.nextDouble();
		double e = FutureValue(C, r, T);
		System.out.println("Value is: " + e + "\n");
		sc.close();
	}
}
