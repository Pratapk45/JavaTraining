package com.java.looping_statement;

import java.util.Scanner;

public class ReservationProgram {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int availableTickets = 10;

		while (availableTickets > 0) {

			System.out.println("\nAvailable Tickets: " + availableTickets);
			System.out.print("Enter number of tickets to book (0 to Exit): ");
			int tickets = sc.nextInt();

			if (tickets == 0) {
				System.out.println("Thank You!");
				break;
			}

			if (tickets <= availableTickets && tickets > 0) {
				availableTickets = availableTickets - tickets;
				System.out.println(tickets + " Ticket(s) Booked Successfully.");
				System.out.println("Remaining Tickets: " + availableTickets);
			} else {
				System.out.println("Invalid Booking! Tickets not available.");
			}
		}

		if (availableTickets == 0) {
			System.out.println("\nAll Tickets Sold Out.");
		}

		sc.close();
	}
}
