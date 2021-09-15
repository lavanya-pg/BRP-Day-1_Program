package com.bridgelabz.day5;

import java.util.Scanner;

public class PowerOfTwo {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:");
		int n = sc.nextInt();
		for (int i = 0; i <= n; i++) {
			System.out.println(i + "\t" + ((int) (Math.pow(2, i))));
		}
	}
}
