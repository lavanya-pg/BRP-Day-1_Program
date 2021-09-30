package com.bridgelabz.day8;

import java.security.DomainCombiner;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Recursion {
	
	static List<String> output = new ArrayList<>();
	public static void permutation(String perm, String Word) {
		if(Word.isEmpty()) {
			if(!output.contains(perm)) {
				System.out.println(perm+ " ");
				output.add(perm);
			}
		}
		for (int i = 0; i < Word.length(); i++) {
			String  W = Word.substring(0,i) + Word.substring(i+1,Word.length());
			String  p = perm + Word.charAt(i);
			
			permutation (p,W);
		}
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a String: ");
		String str = sc.next();
		
		System.out.println("All Perutstions: ");
		permutation(" ",str);
		
		sc.close();
	}
}
