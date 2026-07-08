package com.java.basic_program;

import java.util.Scanner;

public class StringLength {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        System.out.print("Enter a String: ");
	        String str = sc.nextLine();

	        if (str.isEmpty()) {
	            System.out.println("String is empty.");
	        } else {
	            System.out.println("String is not empty.");
	            System.out.println("Length of String: " + str.length());
	        }

	        sc.close();
	    }
}
