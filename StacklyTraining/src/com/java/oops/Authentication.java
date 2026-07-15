package com.java.oops;

import java.util.Scanner;

class AuthenticationVerification {

    // Login using Email and Password
    void login(String email, String password) {

        if (email.equals("pratap@gmail.com") && password.equals("Admin123")) {
            System.out.println("Login Successful using Email and Password.");
        } else {
            System.out.println("Invalid Email or Password.");
        }
    }

    // Login using Phone Number and OTP
    void login(long phone, int otp) {

        if (phone == 9172391249L && otp == 1234) {
            System.out.println("Login Successful using Phone Number and OTP.");
        } else {
            System.out.println("Invalid Phone Number or OTP.");
        }
    }

    // Login using Social ID
    void login(String socialId) {

        if (socialId.equals("Google123")) {
            System.out.println("Login Successful using Social ID.");
        } else {
            System.out.println("Invalid Social ID.");
        }
    }
}

public class Authentication {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        AuthenticationVerification auth = new AuthenticationVerification();

        System.out.println("Select Login Method");
        System.out.println("1. Email and Password");
        System.out.println("2. Phone Number and OTP");
        System.out.println("3. Social ID");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();
        sc.nextLine();

        switch (choice) {

            case 1:
                System.out.print("Enter Email: ");
                String email = sc.nextLine();

                System.out.print("Enter Password: ");
                String password = sc.nextLine();

                auth.login(email, password);
                break;

            case 2:
                System.out.print("Enter Phone Number: ");
                long phone = sc.nextLong();

                System.out.print("Enter OTP: ");
                int otp = sc.nextInt();

                auth.login(phone, otp);
                break;

            case 3:
                sc.nextLine();
                System.out.print("Enter Social ID: ");
                String socialId = sc.nextLine();

                auth.login(socialId);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}