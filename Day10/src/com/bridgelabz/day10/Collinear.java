package com.bridgelabz.day10;

import java.util.Scanner;

import com.bridgelabz.day10.MathFunction;

public class Collinear {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the values of X1,X2,X3,Y1,Y2,Y3: ");
		int X1 = sc.nextInt();
		int X2 = sc.nextInt();
		int X3 = sc.nextInt();
		int Y1 = sc.nextInt();
		int Y2 = sc.nextInt();
		int Y3 = sc.nextInt();
		MathFunction.Collinear(X1, X2, X3, Y1, Y2, Y3);
		sc.close();

	}
}
