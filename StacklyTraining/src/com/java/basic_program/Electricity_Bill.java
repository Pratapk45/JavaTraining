package com.java.basic_program;

import java.util.Scanner;

public class Electricity_Bill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter Connection Type (Home/Shop): ");
		        String type = sc.nextLine();

		        System.out.print("Enter Units Consumed: ");
		        int units = sc.nextInt();

		        double bill = 0;

		        if (type.equalsIgnoreCase("Home")) {

		            if (units <= 100) {
		                bill = units * 1.5;
		            } else if (units <= 200) {
		                bill = (100 * 1.5) + ((units - 100) * 2.5);
		            } else {
		                bill = (100 * 1.5) + (100 * 2.5) + ((units - 200) * 4.0);
		            }

		        } else if (type.equalsIgnoreCase("Shop")) {

		            if (units <= 100) {
		                bill = units * 2.0;
		            } else if (units <= 200) {
		                bill = (100 * 2.0) + ((units - 100) * 3.0);
		            } else {
		                bill = (100 * 2.0) + (100 * 3.0) + ((units - 200) * 5.0);
		            }

		        } else {
		            System.out.println("Invalid Connection Type");
		            return;
		        }

		        System.out.println("\nConnection Type : " + type);
		        System.out.println("Units Consumed  : " + units);
		        System.out.println("Electricity Bill: ₹" + bill);

		        sc.close();
	}

}
