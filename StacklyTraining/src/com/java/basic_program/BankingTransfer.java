package com.java.basic_program;

import java.util.Scanner;

public class BankingTransfer {

		    static double balance = 10000;

		    public static void deposit(double amount) {
		        if (amount > 0) {
		            balance += amount;
		            
		            System.out.println("Deposit Successful.");
		            System.out.println("Available Balance :"+balance+" Rs");
		        } else {
		            System.out.println("Invalid Deposit Amount.");
		        }
		    }

		    public static void withdraw(double amount) {
		    	if(amount>0 && amount<=balance) {
		    		balance-=amount;
		    		System.out.println("Withdrawal Successfuly");
		    		System.out.println("Remaining balance :"+balance +"Rs");
		    	}
		    	else if(amount<=0) {
		    		System.out.println("Invalid Withdrawal Amount.");
		    	}
		    	else if( amount>balance){
		    		System.out.println("Insufficient Balance.");
		    	}
		    	else{
		    		System.out.println("Thank you");
		    	}
//		        if (amount <= 0) {
//		            System.out.println("Invalid Withdrawal Amount.");
//		        } else if (amount > balance) {
//		            System.out.println("Insufficient Balance.");
//		        } else {
//		            balance -= amount;
//		            System.out.println("Withdrawal Successful.");
//		        }
		    }

		    public static void checkBalance() {
		        System.out.println("Current Balance: ₹" + balance);
		    }

		    public static void main(String[] args) {

		        Scanner sc = new Scanner(System.in);
		        int choice;

		        do {
		            System.out.println("\n===== BANK MENU =====");
		            System.out.println("1. Deposit");
		            System.out.println("2. Withdraw");
		            System.out.println("3. Check Balance");
		            System.out.println("4. Exit");
		            System.out.print("Enter Choice: ");
		            choice = sc.nextInt();

		            switch (choice) {
		                case 1:
		                    System.out.print("Enter Deposit Amount: ");
		                    deposit(sc.nextDouble());
		                    break;

		                case 2:
		                    System.out.print("Enter Withdrawal Amount: ");
		                    BankingTransfer.withdraw(sc.nextDouble());
		                    break;

		                case 3:
		                    checkBalance();
		                    break;

		                case 4:
		                    System.out.println("Thank You for Banking!");
		                    break;

		                default:
		                    System.out.println("Invalid Choice.");
		            }

		        } while (choice != 4);

		        sc.close();
		    }
		}
