package com.java.basic_program;

import java.util.Scanner;

public class Employee_Payroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Designation (Manager/Developer/Tester): ");
		String designation = sc.nextLine();

		System.out.print("Enter Basic Salary: ");
		double basicSalary = sc.nextDouble();

		System.out.print("Enter Years of Experience: ");
		int experience = sc.nextInt();

		double increment = 0;
		double bonus = 0;

		// Increment based on designation and experience
		if (designation.equalsIgnoreCase("Manager")) {
			if (experience >= 5)
				increment = basicSalary * 0.20;
			else
				increment = basicSalary * 0.10;

			bonus = 10000;
		} else if (designation.equalsIgnoreCase("Developer")) {
			if (experience >= 5)
				increment = basicSalary * 0.15;
			else
				increment = basicSalary * 0.08;

			bonus = 7000;
		} else if (designation.equalsIgnoreCase("Tester")) {
			if (experience >= 5)
				increment = basicSalary * 0.12;
			else
				increment = basicSalary * 0.05;

			bonus = 5000;
		} else {
			System.out.println("Invalid Designation");
			return;
		}

		double grossSalary = basicSalary + increment + bonus;

		System.out.println("\n------ Employee Payroll ------");
		System.out.println("Employee Name : " + name);
		System.out.println("Designation   : " + designation);
		System.out.println("Basic Salary  : " + basicSalary);
		System.out.println("Experience    : " + experience + " Years");
		System.out.println("Increment     : " + increment);
		System.out.println("Bonus         : " + bonus);
		System.out.println("Gross Salary  : " + grossSalary);

		sc.close();
	}

}
