package com.bridgelabz.day6;

import static java.lang.Math.cos;

public class Cos {
	static void cal_cos(float n) {
		float accuracy = (float) 0.0001, x1, denominator, cosx, cosval;

		n = n * (float) (3.142 / 180.0);
		x1 = 1;

		cosx = x1;

		cosval = (float) cos(n);
		int i = 1;
		do {
			denominator = 2 * i * (2 * i - 1);
			x1 = -x1 * n * n / denominator;
			cosx = cosx + x1;
			i = i + 1;

		} while (accuracy <= cosval - cosx);
		System.out.println(cosx);

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float n = 30;
		cal_cos(n);

	}

}
