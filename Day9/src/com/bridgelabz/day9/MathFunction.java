package com.bridgelabz.day9;

public class MathFunction {
	public static boolean isPrime(int num) {
		int flag = 0, m = 0;
		m = num / 2;
		if (num == 0 || num == 1) {
			System.out.println(num + " is not prime number");
		} else {
			for (int i = 2; i <= m; i++) {
				if (num % i == 0) {
					System.out.println(num + " is not prime number");
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.println(num + " is prime number");
			}
		}
		return false;
	}

	public static void isFactorial(int num) {
		int i = 1, fact = 1;
		while (i <= num) {
			fact = fact * i;
			i++;
		}
		System.out.println("factorial of the number: " + fact);
	}

	public static void isSqrt(double num) {
		Double squareroot = Math.pow(num, 0.5);
		System.out.println("The square of given number " + num + " is " + squareroot);
	}

	public static void harmonicSeries(int num) {
		double result = 0.0;
		while (num > 0) {
			result = result + (double) 1 / num;
			num--;
		}
		System.out.println("Harmonic Series is : " + result);
	}

	public static void sin(double num) {
		double b = Math.toRadians(num);
		System.out.println(Math.sin(b));
	}

	public static void cos(double num) {
		double b = Math.toRadians(num);
		System.out.println(Math.cos(b));
	}

	public static void toBinary(int num) {
		String binary = Integer.toBinaryString(num);
		System.out.println("Binary Value of Number " + num + " is " + binary);
	}
}
