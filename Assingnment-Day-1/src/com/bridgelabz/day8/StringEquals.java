package com.bridgelabz.day8;

import java.util.Arrays;
import java.util.Scanner;

public class StringEquals {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the  First String: ");
		String str1 = sc.nextLine();
		Object[] array1 = { str1 };
		System.out.println("Enter the Second String: ");
		String str2 = sc.nextLine();
		Object[] array2 = { str2 };
		sc.close();

		if (Arrays.equals(array1, array2)) {
			System.out.println("String are equals.");
		} else {
			System.out.println("Strings are not equal.");
		}

	}
}
