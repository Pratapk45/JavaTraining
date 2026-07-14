package com.java.arrays;

import java.util.Scanner;

public class StudentResultSystem {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		// Input student & subject count
		System.out.print("Enter number of students: ");
		int students = sc.nextInt();

		System.out.print("Enter number of subjects: ");
		int subjects = sc.nextInt();

		int[][] marks = new int[students][subjects];
		int[] totals = new int[students];
		double[] averages = new double[students];
		char[] grades = new char[students];

		// Input marks with validation
		for (int i = 0; i < students; i++) {

			System.out.println("\nEnter marks for Student " + (i + 1));

			int total = 0;

			for (int j = 0; j < subjects; j++) {

				while (true) {

					System.out.print("Subject " + (j + 1) + ": ");
					int mark = sc.nextInt();

					if (mark >= 0 && mark <= 100) {

						marks[i][j] = mark;
						total += mark;
						break;

					} else {

						System.out.println("Invalid! Enter marks between 0 and 100.");

					}

				}

			}

			totals[i] = total;
			averages[i] = total / (double) subjects;

			// Grade calculation
			if (averages[i] >= 90)
				grades[i] = 'A';
			else if (averages[i] >= 75)
				grades[i] = 'B';
			else if (averages[i] >= 60)
				grades[i] = 'C';
			else if (averages[i] >= 50)
				grades[i] = 'D';
			else
				grades[i] = 'F';
		}

		// Find topper
		int topperIndex = 0;

		for (int i = 1; i < students; i++) {

			if (totals[i] > totals[topperIndex]) {
				topperIndex = i;
			}

		}

		// Final Report
		System.out.println("\n====== FINAL REPORT ======");

		System.out.print("Student\t");

		for (int j = 0; j < subjects; j++) {
			System.out.print("Sub" + (j + 1) + "\t");
		}

		System.out.println("Total\tAvg\tGrade");

		for (int i = 0; i < students; i++) {

			System.out.print((i + 1) + "\t");

			for (int j = 0; j < subjects; j++) {
				System.out.print(marks[i][j] + "\t");
			}

			System.out.println(totals[i] + "\t" + averages[i] + "\t" + grades[i]);
		}

		// Display topper
		System.out.println("\nTopper: Student " + (topperIndex + 1));
		System.out.println("Total Marks: " + totals[topperIndex]);
		System.out.println("Average: " + averages[topperIndex]);
		System.out.println("Grade: " + grades[topperIndex]);

		sc.close();
	}
}
