package com.bridgelabz.day1;

import java.util.Scanner;
public class PrintThreeNames {

	public static void main(String[] args) {
		
		System.out.println("Enter 3 names");
		String s1,s2,s3;
		Scanner sc=new Scanner(System.in);
		s1=sc.nextLine();
		s2=sc.nextLine();
		s3=sc.nextLine();
		System.out.println("Hi "+s3+" ,"+s2+" and "+s1);

	}

}