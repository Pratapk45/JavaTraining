package com.java.looping_statement;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int choice;

		do {
			System.out.println("\n----- Fibonacci Series -----");
			System.out.println("1. Generate Fibonacci Series");
			System.out.println("2. Exit");
			System.out.print("Enter your choice: ");
			choice = sc.nextInt();

			switch (choice) {

			case 1:
				System.out.print("Enter number of terms: ");
				int n = sc.nextInt();

				int a = 0, b = 1, c;
				int i = 1;

				System.out.print("Fibonacci Series: ");

				do {
					System.out.print(a + " ");

					c = a + b;
					a = b;
					b = c;

					i++;
				} while (i <= n);

				System.out.println();
				break;

			case 2:
				System.out.println("Thank You!");
				break;

			default:
				System.out.println("Invalid Choice. Please enter 1 or 2.");
			}

		} while (choice != 2);

		sc.close();
	}

}
