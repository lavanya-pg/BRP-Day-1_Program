package com.bridgelabz.day9;

import java.util.Scanner;

public class HarmonicNumber {
	public static void main(String[] args) {
		double a;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		a = sc.nextDouble();
		double h = harmonicCal(a);
		System.out.println("Harmonic Value =" + h);
		sc.close();
	}

	static double harmonicCal(double n) {
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			sum = sum + (1 / i);
		}
		return sum;
	}
}
