package com.bridgelabz.day7;

public class Binary {
	static int swapNibbles(int x) {
		return ((x & 0x0F) << 4 | (x & 0xF0) >> 4);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int x = 100;
		System.out.print(swapNibbles(x));
	}

}
