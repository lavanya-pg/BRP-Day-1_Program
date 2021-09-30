package com.bridgelabz.day9;

import java.util.Scanner;

public class Factorial {
     public static long Fact(long n) {
    	 if(n<=0)
		return 1;
    	  return Factorial.Fact(n-1)*n;
     }
     
     public static void main(String[] args) {
		long n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		n = sc.nextLong();
		long f = Factorial.Fact(n);
		System.out.println("factorial = " +f);
		sc.close();
	}
}
