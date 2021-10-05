package com.bridgelabz.day10;

import java.util.Arrays;

public class MathFunction {
	public static void presentValue(double presentAmount) {
		System.out.println("Your Present Value is : " + presentAmount);
	}

	public static int getMax(int[] inputArray) {
		int maxValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] > maxValue) {
				maxValue = inputArray[i];
			}
		}
		return maxValue;
	}

	public static int getMin(int[] inputArray) {
		int minValue = inputArray[0];
		for (int i = 1; i < inputArray.length; i++) {
			if (inputArray[i] < minValue) {
				minValue = inputArray[i];
			}
		}
		return minValue;
	}

	public static String minMaxString(String[] array) {
		System.out.println("Sorted Array");
		Arrays.sort(array);
		System.out.println(Arrays.toString(array));
		System.out.println("Maximum String = " + array[array.length - 1]);
		System.out.println("Minimum String = " + array[0]);
		return "";
	}

	public static String Collinear(int x1, int x2, int x3, int y1, int y2, int y3) {
		int a = x1 * (y2 - y3) + x2 * (y3 - y1) + x3 * (y1 - y2);
		if (a == 0)
			System.out.println("Points are Collinear");
		else
			System.out.println("Points are not Collinear");
		return "";
	}
}
