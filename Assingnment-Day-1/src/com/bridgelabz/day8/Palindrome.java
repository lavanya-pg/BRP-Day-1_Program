package com.bridgelabz.day8;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string: ");
		String str = sc.nextLine();
		int length = str.length();

		boolean isPalindrome = true;

		for (int beginindex = 0; beginindex < length; beginindex++) {

			if (str.charAt(beginindex) != str.charAt(length - 1 - beginindex)) {
				System.out.println("Enterd String is not a Palindrome.");
				isPalindrome = false;
				break;
			}

		}
		if (isPalindrome) {
			System.out.println("Entered String is a Palindrome.");
		}
		sc.close();
	}
}
