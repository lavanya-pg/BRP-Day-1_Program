package com.bridgelabz.day9;

import java.util.Scanner;

public class Cos {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number in angle: ");
		double num = sc.nextDouble();
		double result = Math.cos(num);
		System.out.println("the value of the cos is: " + result);
		sc.close();
	}
}
