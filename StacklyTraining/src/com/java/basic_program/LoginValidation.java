package com.java.basic_program;

import java.util.Scanner;

public class LoginValidation {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter Email: ");
	        String email = sc.nextLine();

	        System.out.print("Enter Password (10-digit Mobile Number): ");
	        String password = sc.nextLine();

	        boolean isNumber = true;

	        // Check whether all characters are digits
	        for (int i = 0; i < password.length(); i++) {
	            if (!Character.isDigit(password.charAt(i))) {
	                isNumber = false;
	                break;
	            }
	        }

	        if (email.contains("@gmail.com") && password.length() == 10 && isNumber) {
	            System.out.println("Login Successful");
	        } else {
	            System.out.println("Login Failed");

	            if (!email.contains("@gmail.com")) {
	                System.out.println("Invalid Email");
	            }

	            if (password.length() != 10 || !isNumber) {
	                System.out.println("Password should be a 10-digit mobile number");
	            }
	        }

	        sc.close();
	    }

}
