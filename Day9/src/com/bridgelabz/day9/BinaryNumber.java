package com.bridgelabz.day9;

import java.util.Scanner;

import com.sun.tools.javac.Main;

public class BinaryNumber {
	public static void main(String[] args) {
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		n = sc.nextInt();
		Main obj = new Main();
		int m = binary(n);
		System.out.println("The Binary Number of the given is: " +m);
		sc.close();
	}

	public static int binary(int n) {
		if (n == 1) {
			return 1;
		}
		return binary(n / 2) * 10 + n % 2;

	}
}
