package com.bridgelabz.day10;

import java.util.Scanner;

public class MinMaxInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of an Array: ");
		int n = scanner.nextInt();
		int array[] = new int[n];
		System.out.println("Enter the Elements of Array: ");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.nextInt();
		}
		int max = MathFunction.getMax(array);
		System.out.println("Maximum Value is : " + max);

		int min = MathFunction.getMin(array);
		System.out.println("Minimum Value is: " + min);
		scanner.close();
	}
}
