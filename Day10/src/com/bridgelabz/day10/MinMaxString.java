package com.bridgelabz.day10;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Size of an Array: ");
		int n = scanner.nextInt();
		String array[] = new String[n];
		System.out.println("Enter a String: ");
		for (int i = 0; i < n; i++) {
			array[i] = scanner.next();
		}
		System.out.println(Arrays.toString(array));
		MathFunction.minMaxString(array);
		scanner.close();
	}
}
