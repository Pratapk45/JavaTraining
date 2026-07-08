package com.java.basic_program;

import java.util.Scanner;

public class EmloyeePayroll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Employee ID: ");
		        int empId = sc.nextInt();

		        sc.nextLine(); // Consume newline

		        System.out.print("Enter Employee Name: ");
		        String empName = sc.nextLine();

		        System.out.print("Enter Basic Salary: ");
		        double basicSalary = sc.nextDouble();

		        // Salary Calculations
		        double hra = basicSalary * 0.20;   // 20% HRA
		        double da = basicSalary * 0.10;    // 10% DA
		        double pf = basicSalary * 0.08;    // 8% PF

		        double grossSalary = basicSalary + hra + da;
		        double netSalary = grossSalary - pf;

		        // Display Payroll
		        System.out.println("\n------ Employee Payroll ------");
		        System.out.println("Employee ID   : " + empId);
		        System.out.println("Employee Name : " + empName);
		        System.out.println("Basic Salary  : " + basicSalary);
		        System.out.println("HRA (20%)     : " + hra);
		        System.out.println("DA (10%)      : " + da);
		        System.out.println("PF (8%)       : " + pf);
		        System.out.println("Gross Salary  : " + grossSalary);
		        System.out.println("Net Salary    : " + netSalary);

		        sc.close();
	}

}
