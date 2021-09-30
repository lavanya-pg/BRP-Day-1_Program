package com.bridgelabz.day9;

import java.util.Scanner;

public class Prime {
	public static boolean isPrime(int num) {
		boolean ifitPrime = true;
		if (num <= 1) {
			return false;
		}
		for (int i = 2; i < Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			}
		}
		return ifitPrime;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int number = sc.nextInt();
		boolean ifitPrime = isPrime(number);
		if (ifitPrime) {
			System.out.println("The Given Number is a Prime Number.");
		} else {
			System.out.println("The Given Number is Not a Prime NNumber.");
		}
		sc.close();
	}
}
