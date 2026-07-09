package com.java.looping_statement;

import java.util.Scanner;

public class FactorialProgram {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);
	        int choice;

	        do {
	            System.out.println("\n----- Factorial Program -----");
	            System.out.println("1. Find Factorial");
	            System.out.println("2. Exit");
	            System.out.print("Enter your choice: ");
	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    System.out.print("Enter a number: ");
	                    int num = sc.nextInt();

	                    int fact = 1;
	                    int i = 1;

	                    do {
	                        fact = fact * i;
	                        i++;
	                    } while (i <= num);

	                    System.out.println("Factorial of " + num + " = " + fact);
	                    break;

	                case 2:
	                    System.out.println("Thank You!");
	                    break;

	                default:
	                    System.out.println("Invalid Choice! Please enter 1 or 2.");
	            }

	        } while (choice != 2);

	        sc.close();
	    }

}
