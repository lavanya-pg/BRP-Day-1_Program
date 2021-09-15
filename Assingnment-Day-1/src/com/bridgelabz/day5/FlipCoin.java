package com.bridgelabz.day5;

import java.util.Scanner;

public class FlipCoin {
	public static void main(String[] args) {
		int heads = 0;
		int tails = 0;
		int counter = 1;
		double randNum = 0.0;
		Scanner sc = new Scanner(System.in);

		System.out.println("How Many Times will the Coin be Flipped? ");
		int flips = sc.nextInt();

		while (counter <= flips) {
			randNum = Math.random();
			System.out.println(counter + "\t" + randNum);

			if (randNum < 0.5) {
				heads++;
				System.out.println("\t heads");
			} else {
				tails++;
				System.out.println("\t tails");
			}
			counter++;
		}
		System.out.println();
		System.out.println("Number of Heads = " + heads);
		System.out.println("Number of talis = " + tails);
	}
}
