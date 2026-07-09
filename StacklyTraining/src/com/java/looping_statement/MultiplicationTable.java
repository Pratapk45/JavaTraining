package com.java.looping_statement;

import java.util.Scanner;

public class MultiplicationTable {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number which table you want");
		int num = sc.nextInt();

		for (int i = 1; i <= 10; i++) {
			System.out.println(num * i);
		}
	}
}
