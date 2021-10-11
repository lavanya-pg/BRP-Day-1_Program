package com.bridgelabz.day14;

import java.util.Scanner;

public class InsertionSort {
	public static void Sort(int a[]) {
		int n = a.length;
		for (int i = 1; i < n; i++) {
			for (int j = i - 1; j >= 0 && a[j + 1] < a[j]; j--) {
				int temp = a[j + 1];
				a[j + 1] = a[j];
				a[j] = temp;
			}
		}
	}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the size of array: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter the Elements:");
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Elements in Array");
		printArray(a);
		Sort(a);
		System.out.println("\n elements after sorting");
		printArray(a);
		scanner.close();
	}
}
