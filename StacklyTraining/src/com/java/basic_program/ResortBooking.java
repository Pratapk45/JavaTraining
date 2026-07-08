package com.java.basic_program;

import java.util.Scanner;

public class ResortBooking {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int roomType;
		int mealPlan;
		int days;
		double roomCharge = 0;
		double mealCharge = 0;
		double totalBill;

		// Room Type Validation
		do {
			System.out.println("\n===== RESORT BOOKING =====");
			System.out.println("1. Deluxe Room");
			System.out.println("2. Super Deluxe Room");
			System.out.println("3. Suite Room");
			System.out.print("Enter Room Type: ");
			roomType = sc.nextInt();

			switch (roomType) {
			case 1, 2, 3 -> {
			}
			default -> System.out.println("Invalid Room Type! Please Enter Again.");
			}

		} while (roomType != 1 && roomType != 2 && roomType != 3);

		System.out.print("Enter Number of Days: ");
		days = sc.nextInt();

		switch (roomType) {

		case 1 -> {
			roomCharge = 3000;

			do {
				System.out.println("\nMeal Plan");
				System.out.println("1. Breakfast (₹300)");
				System.out.println("2. Breakfast + Dinner (₹700)");
				System.out.print("Enter Meal Plan: ");
				mealPlan = sc.nextInt();

				switch (mealPlan) {
				case 1 -> mealCharge = 300;
				case 2 -> mealCharge = 700;
				default -> System.out.println("Invalid Meal Plan! Please Enter Again.");
				}

			} while (mealPlan != 1 && mealPlan != 2);
		}

		case 2 -> {
			roomCharge = 5000;

			do {
				System.out.println("\nMeal Plan");
				System.out.println("1. Breakfast (₹400)");
				System.out.println("2. Breakfast + Dinner (₹900)");
				System.out.print("Enter Meal Plan: ");
				mealPlan = sc.nextInt();

				switch (mealPlan) {
				case 1 -> mealCharge = 400;
				case 2 -> mealCharge = 900;
				default -> System.out.println("Invalid Meal Plan! Please Enter Again.");
				}

			} while (mealPlan != 1 && mealPlan != 2);
		}

		case 3 -> {
			roomCharge = 8000;

			do {
				System.out.println("\nMeal Plan");
				System.out.println("1. Breakfast (₹500)");
				System.out.println("2. Breakfast + Lunch + Dinner (₹1200)");
				System.out.print("Enter Meal Plan: ");
				mealPlan = sc.nextInt();

				switch (mealPlan) {
				case 1 -> mealCharge = 500;
				case 2 -> mealCharge = 1200;
				default -> System.out.println("Invalid Meal Plan! Please Enter Again.");
				}

			} while (mealPlan != 1 && mealPlan != 2);
		}
		}

		totalBill = (roomCharge + mealCharge) * days;

		// Discount using switch (No if)
		switch (days >= 5 ? 1 : 0) {
		case 1 -> {
			totalBill = totalBill - (totalBill * 0.10);
			System.out.println("\n10% Discount Applied!");
		}
		default -> {
		}
		}

		System.out.println("\n===== BOOKING SUMMARY =====");
		System.out.println("Room Type      : " + roomType);
		System.out.println("Days           : " + days);
		System.out.println("Room Charge    : " + roomCharge+"Rs");
		System.out.println("Meal Charge    : " + mealCharge+"Rs");
		System.out.println("Total Bill     : " + totalBill+"Rs");

		sc.close();
	}
}
