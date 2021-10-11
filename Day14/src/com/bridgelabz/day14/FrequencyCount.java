package com.bridgelabz.day14;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class FrequencyCount {
	public static void frequencyCount(String s) {
		Map<Character, Integer> d = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) {
			if (d.containsKey(s.charAt(i))) {
				d.put(s.charAt(i), d.get(s.charAt(i)) + 1);
			} else {
				d.put(s.charAt(i), 1);
			}
		}
		for (int i = 0; i < s.length(); i++) {
			if (d.get(s.charAt(i)) != 0) {
				System.out.println(s.charAt(i));
				System.out.println(d.get(s.charAt(i)) + " ");
				d.put(s.charAt(i), 0);
			}
		}

	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the String");
		String s = scanner.nextLine();
		frequencyCount(s);
		scanner.close();
	}

}
