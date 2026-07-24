package com.javaproject.onlinevotingsystem;

import java.util.InputMismatchException;
import java.util.Scanner;

public class OnlineVotingSystem {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        VotingService service = new VotingService();

	        int choice = 0;

	        do {

	            System.out.println("\n====== Online Voting System ======");

	            System.out.println("1. Register");
	            System.out.println("2. Login");
	            System.out.println("3. View Candidates");
	            System.out.println("4. Cast Vote");
	            System.out.println("5. Display Result");
	            System.out.println("6. Exit");

	            System.out.print("Enter Choice : ");

	            try {

	                choice = sc.nextInt();

	                switch (choice) {

	                    case 1:
	                        service.register();
	                        break;

	                    case 2:
	                        service.login();
	                        break;

	                    case 3:
	                        service.viewCandidates();
	                        break;

	                    case 4:
	                        service.castVote();
	                        break;

	                    case 5:
	                        service.displayResult();
	                        break;

	                    case 6:
	                        System.out.println("Thank You...");
	                        break;

	                    default:
	                        System.out.println("Invalid Choice.");
	                }

	            } catch (InputMismatchException e) {

	                System.out.println("Please Enter Numbers Only.");
	                sc.next();
	            }

	        } while (choice != 6);

	        sc.close();
	    }
}
