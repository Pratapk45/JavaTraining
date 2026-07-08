package com.java.basic_program;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first number: ");
		        double num1 = sc.nextDouble();

		        System.out.print("Enter operator (+, -, *, /, %): ");
		        char operator = sc.next().charAt(0);

		        System.out.print("Enter second number: ");
		        double num2 = sc.nextDouble();

		        switch (operator) {
		            case '+':
		                System.out.println("Result = " + (num1 + num2));
		                break;

		            case '-':
		                System.out.println("Result = " + (num1 - num2));
		                break;

		            case '*':
		                System.out.println("Result = " + (num1 * num2));
		                break;

		            case '/':
		                if (num2 != 0)
		                    System.out.println("Result = " + (num1 / num2));
		                else
		                    System.out.println("Division by zero is not allowed.");
		                break;

		            case '%':
		                if (num2 != 0)
		                    System.out.println("Result = " + (num1 % num2));
		                else
		                    System.out.println("Modulo by zero is not allowed.");
		                break;

		            default:
		                System.out.println("Invalid operator.");
		        }

		        sc.close();

	}

}
