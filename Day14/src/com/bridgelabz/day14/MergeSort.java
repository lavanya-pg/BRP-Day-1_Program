package com.bridgelabz.day14;

import java.util.Scanner;

public class MergeSort {
	public static void merge(int a[], int l, int m, int h) {
		int i, j, c = l;
		int b[] = new int[h + 1];
		for (i = l, j = m + 1; i <= m && j <= h; c++) {
			if (a[i] <= a[j])
				b[c] = a[i++];
			else
				b[c] = a[j++];
		}
		while (i <= m)
			b[c++] = a[i++];
		while (j <= h)
			b[c++] = a[j++];
		for (i = l; i <= h; i++)
			a[i] = b[i];
	}

	public static void Sort(int a[], int l, int h) {
		if (l < h) {
			int m = (l + h) / 2;
			Sort(a, l, m);
			Sort(a, m + 1, h);
			merge(a, l, m, h);
		}
	}

	public static void printArray(int a[]) {
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter number of elements in an array: ");
		int n = scanner.nextInt();
		int a[] = new int[n];
		System.out.println("Enter " + n + " elements");
		for (int i = 0; i < n; i++) {
			a[i] = scanner.nextInt();
		}
		System.out.println("Elements in an Array");
		printArray(a);
		Sort(a, 0, n - 1);
		System.out.println("\nElements after sorting:");
		printArray(a);
		scanner.close();
	}
}
