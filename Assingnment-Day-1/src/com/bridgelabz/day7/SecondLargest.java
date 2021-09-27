package com.bridgelabz.day7;

public class SecondLargest {
	public static void main(String[] args) {
		int a[] = { 11, 2, 3, 15, 1, 0, 55, 54, 5, 9, 7 };
		int large, slarge, small, ssmall;

		large = a[0];
		slarge = a[0];
		small = a[0];
		ssmall = a[0];

		for (int i = 1; i < a.length; i++) {

			if (large < a[i]) {
				large = a[i];

			}

		}

		for (int i = 1; i < a.length; i++) {

			if (small > a[i]) {
				small = a[i];

			}

		}

		System.out.println("Large element is" + large);
		System.out.println("ssmall element is" + small);

		for (int i = 1; i < a.length; i++) {

			if (a[i] < large && slarge < a[i]) {
				slarge = a[i];

			}

		}

		for (int i = 1; i < a.length; i++) {

			if (a[i] > small && ssmall > a[i]) {
				ssmall = a[i];

			}

		}
		System.out.println("second Largest element is" + slarge);

		System.out.println("second small element is" + ssmall);

	}
}
