package com.bridgelabz.day4;

import java.util.Scanner;

public class Sqrt {
	// Function to return the square root of a number using Newtons method
	static double squareRoot(double n, double l) {
		// Assuming the sqrt of n as n only
		double x = n;
		// The closed guess will be stored in the root
		double root;
		// To count the number of iterations
		int count = 0;
		while (true) {
			count++;
			// Calculate more closed x
			root = 0.5 * (x + (n / x));
			// Check for closeness
			if (Math.abs(root - x) < 1)
				break;
			// update root
			x = root;
		}
		return root;
	}

	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		double n, l;
		System.out.println("Enter Value of N : ");
		n = cs.nextDouble();
		System.out.println("Enter Value of L : ");
		l = cs.nextDouble();
		System.out.println(squareRoot(n, 1));
	}
}