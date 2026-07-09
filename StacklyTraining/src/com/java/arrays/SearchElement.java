package com.java.arrays;

import java.util.Scanner;

public class SearchElement {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the size of array: ");
		int size = sc.nextInt();

		int[] arr = new int[size];

		System.out.println("Enter array elements:");
		for (int i = 0; i < size; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.print("Enter the element to search: ");
		int search = sc.nextInt();

		int index = -1;

		for (int i = 0; i < size; i++) {
			if (arr[i] == search) {
				index = i;
				break;
			}
		}

		if (index != -1) {
			System.out.println("Element found at index position: " + index);
		} else {
			System.out.println("Element not found in the array.");
		}

		sc.close();
	}
}
