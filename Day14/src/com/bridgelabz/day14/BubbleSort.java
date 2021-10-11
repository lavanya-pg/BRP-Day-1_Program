package com.bridgelabz.day14;

import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
		int temp;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number of integers to sort:");
		int num = scanner.nextInt();

		int array[] = new int[num];

		System.out.println("Enter " + num + " integers: ");

		for (int i = 0; i < num; i++)
			array[i] = scanner.nextInt();
		scanner.close();

		for (int i = 0; i < (num - 1); i++) {
			for (int j = 0; j < num - i - 1; j++) {
				if (array[j] > array[j + 1]) {
					temp = array[j];
					array[j] = array[j + 1];
					array[j + 1] = temp;
				}
			}
		}

		System.out.println("Sorted list of integers:");

		for (int i = 0; i < num; i++)
			System.out.println(array[i]);
	}
}
