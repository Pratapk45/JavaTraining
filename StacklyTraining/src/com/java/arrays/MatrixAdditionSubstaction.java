package com.java.arrays;

import java.util.Scanner;

public class MatrixAdditionSubstaction {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		System.out.println("Please Enter the rows for the Matrix A : ");
		int rows1 = scan.nextInt();

		System.out.println("Please Enter the columns for the Matrix A : ");
		int cols1 = scan.nextInt();

		int a[][] = new int[rows1][cols1];

		System.out.println("Enter the Elements of Matrix A: ");
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] = scan.nextInt();
			}
			System.out.println();
		}

		System.out.println("Please Enter the rows for the Matrix B : ");
		int rows2 = scan.nextInt();

		System.out.println("Please Enter the columns for the Matrix B : ");
		int cols2 = scan.nextInt();

		int b[][] = new int[rows2][cols2];

		if (rows1 == rows2 && cols1 == cols2) {
			System.out.println("Enter the Elements of Matrix B: ");
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[i].length; j++) {
					b[i][j] = scan.nextInt();
				}
				System.out.println();
			}
			System.out.println("Elements of Matrix A : ");
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					System.out.print(a[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("Elements of Matrix B : ");
			for (int i = 0; i < b.length; i++) {
				for (int j = 0; j < b[i].length; j++) {
					System.out.print(b[i][j] + " ");
				}
				System.out.println();
			}

			System.out.println("Addition : ");
			int add[][] = new int[rows1][cols1];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					add[i][j] = a[i][j] + b[i][j];
				}
			}
			for (int i = 0; i < add.length; i++) {
				for (int j = 0; j < add[i].length; j++) {
					System.out.print(add[i][j] + " ");
				}
				System.out.println();
			}

			System.out.println("Subtraction : ");
			int sub[][] = new int[rows1][cols1];
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++) {
					sub[i][j] = a[i][j] - b[i][j];
				}
			}
			for (int i = 0; i < sub.length; i++) {
				for (int j = 0; j < sub[i].length; j++) {
					System.out.print(sub[i][j] + " ");
				}
				System.out.println();
			}
		} else {
			System.out.println("\n===========================================================\n");
			System.out.println("Matrix addition is not possible and Matrix subtraction is not possible.\n"
					+ "Rows and Columns of Matrix A and Matrix B has to be Equal.");
		}
		scan.close();
	}
}
