package com.bridgelabz.day13;

import java.util.Scanner;

public class MagicNumber {

	public static boolean isMagicNumber(int n) {
		int sum = 0;
		while (n > 0 || sum > 9) {
			if (n == 0) {
				n = sum;
				sum = 0;
			}
			sum += n % 10;
			n /= 10;
		}
		return (sum == 1);
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = scanner.nextInt();
		if (isMagicNumber(n))
			System.out.println(n + " is a Magic Number");
		else
			System.out.println(n + " is not a Magic Number");
		scanner.close();

	}
}
