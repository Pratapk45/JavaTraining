package com.java.basic_program;

import java.util.Scanner;

public class DaysInMonth {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter month (1-12): ");
		int month = sc.nextInt();

		System.out.print("Enter year: ");
		int year = sc.nextInt();

		switch (month) {

		case 1, 3, 5, 7, 8, 10, 12 -> System.out.println("Number of days = 31");

		case 4, 6, 9, 11 -> System.out.println("Number of days = 30");

		case 2 -> {
			if ((year % 400 == 0) || (year % 4 == 0 && year % 100 != 0)) {
				System.out.println(year + " is a Leap Year.");
				System.out.println("Number of days = 29");
			} else {
				System.out.println(year + " is not a Leap Year.");
				System.out.println("Number of days = 28");
			}
		}

		default -> System.out.println("Invalid month! Please enter a month between 1 and 12.");
		}

		sc.close();
	}

}
