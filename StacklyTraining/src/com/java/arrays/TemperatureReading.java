package com.java.arrays;

import java.util.Scanner;

public class TemperatureReading {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter number of patients: ");
		int patients = sc.nextInt();

		System.out.print("Enter number of days: ");
		int days = sc.nextInt();

		double[][] temperature = new double[patients][days];

		// Input temperatures
		for (int i = 0; i < patients; i++) {
			System.out.println("\nEnter temperatures for Patient " + (i + 1));

			for (int j = 0; j < days; j++) {
				System.out.print("Day " + (j + 1) + ": ");
				temperature[i][j] = sc.nextDouble();
			}
		}

		// Display report
		System.out.println("\n----- Temperature Report -----");

		for (int i = 0; i < patients; i++) {
			System.out.println("\nPatient " + (i + 1));

			for (int j = 0; j < days; j++) {
				System.out.print("Day " + (j + 1) + " = " + temperature[i][j] + " °C");

				if (temperature[i][j] >= 38.0) {
					System.out.println(" --> Fever (Treatment Required)");
				} else {
					System.out.println(" --> Normal");
				}
			}
		}

		sc.close();
	}
}