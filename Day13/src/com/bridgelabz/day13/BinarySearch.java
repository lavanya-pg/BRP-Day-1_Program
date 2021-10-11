package com.bridgelabz.day13;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
	static int binarySearch(String[] array, String x) {
		int l = -0, r = array.length - 1;
		while (l <= r) {
			int m = l + (r - l) / 2;
			int res = x.compareTo(array[m]);
			if (res == 0)
				return m;
			if (res > 0)
				l = m + 1;
			else
				r = m - 1;

		}
		return -1;
	}

	public static void main(String[] args) {
		String[] array = { "Lavanya", "Sandhiya", "Ishwarya", "Naviya" };
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the Name: ");
		String x = scanner.next();
		int result = binarySearch(array, x);
		if (result == -1)
			System.out.println("Name not found");
		else
			System.out.println("Name found at index " + result);
		scanner.close();
	}
}
