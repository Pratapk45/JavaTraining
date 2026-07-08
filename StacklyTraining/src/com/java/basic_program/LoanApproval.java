package com.java.basic_program;

import java.util.Scanner;

public class LoanApproval {
public static void main(String[] args) {
	
	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Salary: ");
	        double salary = sc.nextDouble();

	        System.out.print("Employment Status (true/false): ");
	        boolean employment = sc.nextBoolean();

	        System.out.print("Enter CIBIL Score: ");
	        int cibil = sc.nextInt();

	        if (salary >= 30000 && employment == true && cibil >= 750) {
	            System.out.println("Congratulations! Loan Approved.");
	        } else {
	            System.out.println("Sorry! Loan Rejected.");

	            if (salary < 30000) {
	                System.out.println("Reason: Salary should be at least ₹30,000.");
	            }

	            if (!employment) {
	                System.out.println("Reason: Employment status must be true.");
	            }

	            if (cibil < 750) {
	                System.out.println("Reason: CIBIL score should be at least 750.");
	            }
	        }

	        sc.close();
	    }

}
