package com.java.looping_statement;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 7;

		for (int i = 1; i <= n; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

		System.out.println("-----------------");

		for (int i = n; i >= 1; i--) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j);
			}
			System.out.println();
		}

		System.out.println("-------Pyramid---------");

		for (int i = 1; i <= n; i++) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			System.out.println();
		}
		System.out.println("--------Inverted Pyramid-------");

		for (int i = n; i >= 1; i--) {

			for (int j = 1; j <= n - i; j++) {
				System.out.print(" ");
			}

			for (int k = 1; k <= (2 * i - 1); k++) {
				System.out.print("*");
			}

			System.out.println();
		}
	}

}
