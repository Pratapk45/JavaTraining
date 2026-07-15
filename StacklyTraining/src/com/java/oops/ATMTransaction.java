package com.java.oops;

import java.util.Scanner;

class Bank {
    protected String bankName;
    protected double balance;

    Bank(String bankName, double balance) {
        this.bankName = bankName;
        this.balance = balance;
    }
}

class Account extends Bank {
    protected String accountHolder;

    Account(String bankName, double balance, String accountHolder) {
        super(bankName, balance);
        this.accountHolder = accountHolder;
    }
}

class ATM extends Account {

    ATM(String bankName, double balance, String accountHolder) {
        super(bankName, balance, accountHolder);
    }

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposit Successful.");
        System.out.println("Current Balance: " + balance);
    }

    void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid Amount");
        } else if (amount > balance) {
            System.out.println("Insufficient Balance");
        } else {
            balance -= amount;
            System.out.println("Withdrawal Successful");
            System.out.println("Remaining Balance: " + balance);
        }
    }

    void checkBalance() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Available Balance: " + balance);
    }
}
public class ATMTransaction {
	 public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        ATM atm = new ATM("SBI", 10000, "Pratap");

	        int choice;

	        do {
	            System.out.println("\n===== ATM MENU =====");
	            System.out.println("1. Deposit");
	            System.out.println("2. Withdraw");
	            System.out.println("3. Check Balance");
	            System.out.println("4. Exit");
	            System.out.print("Enter Choice : ");
	            choice = sc.nextInt();

	            switch (choice) {
	            case 1:
                    System.out.print("Enter Deposit Amount : ");
                    double deposit = sc.nextDouble();
                    atm.deposit(deposit);
                    break;

                case 2:
                    System.out.print("Enter Withdraw Amount : ");
                    double withdraw = sc.nextDouble();
                    atm.withdraw(withdraw);
                    break;

                case 3:
                    atm.checkBalance();
                    break;

                case 4:
                    System.out.println("Thank You for Using ATM.");
                    break;

                default:
                    System.out.println("Invalid Choice.");
            } 
	            } while (choice != 4);

	        sc.close();
	    }
	            }

