package com.bridgelabz.day2;

import java.util.Scanner;

public class Distance {
	public static void main(String[] args) {
		Scanner cs = new Scanner(System.in);
		double x, y, distance;

		System.out.println("Enter Arguments x,y : ");
		x = cs.nextDouble();
		y = cs.nextDouble();

		distance = Math.sqrt(x * x + y * y);
		System.out.println(distance);
	}
}