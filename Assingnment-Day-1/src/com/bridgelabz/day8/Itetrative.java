package com.bridgelabz.day8;

import java.util.Scanner;

public class Itetrative {
	static void printPermutation(String string, String ans) {
		if (string.length() == 0) {
			System.out.println(ans + " ");
			return;
		}
		for (int i = 0; i < string.length(); i++) {
			char ch = string.charAt(i);
			String ros = string.substring(0, i) + string.substring(i + 1);
			printPermutation(ros, ans + ch);
		}
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String : ");
		String string = scanner.nextLine();
		printPermutation(string, " ");
		scanner.close();
	}
}
