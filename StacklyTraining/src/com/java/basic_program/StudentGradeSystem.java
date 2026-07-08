package com.java.basic_program;

import java.util.Scanner;

public class StudentGradeSystem {
	static {
		String SchooName = "Shri Pandurang Vidyalay Katphal";
		System.out.println("School Name :" + SchooName);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Student Name: ");
		String name = sc.nextLine();
		System.out.print("Enter Student Standard: ");
		int Standard = sc.nextInt();

		System.out.print("Enter Maths Marks: ");
		int m1 = sc.nextInt();
		System.out.print("Enter Science Marks: ");
		int m2 = sc.nextInt();
		System.out.print("Enter English Marks: ");
		int m3 = sc.nextInt();
		System.out.print("Enter Hindi Marks: ");
		int m4 = sc.nextInt();
		System.out.print("Enter marathi Marks: ");
		int m5 = sc.nextInt();

		int totalMarks = m1 + m2 + m3 + m4 + m5;

		System.out.println("Total Marks :" + totalMarks);

		double marks = totalMarks * 100 / 500;

		System.out.println("Marks :" + marks);

		char grade;

		if (marks >= 90 && marks <= 100) {
			grade = 'A';
		} else if (marks >= 80 && marks <= 100) {
			grade = 'B';
		} else if (marks >= 70 && marks <= 100) {
			grade = 'C';
		} else if (marks >= 60 && marks <= 100) {
			grade = 'D';
		} else if (marks >= 40 && marks <= 100) {
			grade = 'E';
		} else if (marks >= 0 && marks <= 100) {
			grade = 'F';
		} else {
			System.out.println("Invalid Marks!");
			sc.close();
			return;
		}

		System.out.println("\n----- Student Result -----");
		System.out.println("Student Name : " + name);
		System.out.println("Standard : " + Standard);
		System.out.println("Grade        : " + grade);

		sc.close();
	}
}
