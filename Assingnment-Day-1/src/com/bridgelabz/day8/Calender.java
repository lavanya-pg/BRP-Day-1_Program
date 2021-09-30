package com.bridgelabz.day8;

import java.util.Scanner;

public class Calender {
	public static String getDay(String day, String month, String year) {
		int ym, yp, d, ay, a = 0, by = 20;
		int[] y = new int[] { 6, 4, 2, 0 };
		int[] m = new int[] { 0, 3, 3, 6, 1, 4, 6, 2, 5, 0, 3, 5 };

		String[] wd = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int gd = Integer.parseInt(day);
		int gm = Integer.parseInt(month);
		int gy = Integer.parseInt(year);

		ym = gy % 100;
		yp = ym / 4;
		ay = gy / 100;

		while (ay != by) {
			by = by + 1;
			a = a + 1;
			if (a == 4) {
				a = 0;
			}
		}
		if ((ym % 4 == 0) && (gm == 2)) {
			d = (gd + m[gm - 1] + ym + yp + y[a] - 1) % 7;
		} else
			d = (gd + m[gm - 1] + ym + yp + y[a]) % 7;
		return wd[d];
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Day: ");
		String day = scanner.next();
		System.out.println("Enter Month: ");
		String month = scanner.next();
		System.out.println("Enter Year: ");
		String year = scanner.next();

		System.out.println(getDay(day, month, year));
		scanner.close();
	}
}
