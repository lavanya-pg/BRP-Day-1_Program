package com.bridgelabz.day10;

import java.util.Scanner;

public class InterestRate {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Present Value: ");
		int C = scanner.nextInt();
		System.out.println("Enter the Interest Rate: ");
		int r = scanner.nextInt();
		System.out.println("Enter the Time Period in Years: ");
		int T = scanner.nextInt();
		double presentAmount = C / (1 + r) ^ T;
		MathFunction.presentValue(presentAmount);
		scanner.close();
	}

}
