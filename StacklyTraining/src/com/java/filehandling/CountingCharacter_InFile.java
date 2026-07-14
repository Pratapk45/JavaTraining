package com.java.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountingCharacter_InFile {

	public static void main(String[] args) {

		int vowels = 0;
		int digits = 0;
		int special = 0;

		try {
			File file = new File("StudentData.txt");
			Scanner sc = new Scanner(file);

			while (sc.hasNextLine()) {
				String line = sc.nextLine();

				for (int i = 0; i < line.length(); i++) {
					char ch = line.charAt(i);

					// Count vowels
					if ("AEIOUaeiou".indexOf(ch) != -1) {
						vowels++;
					}
					// Count digits
					else if (Character.isDigit(ch)) {
						digits++;
					}
					// Count special characters
					else if (!Character.isLetterOrDigit(ch) && !Character.isWhitespace(ch)) {
						// System.out.println(ch);
						special++;
					}
				}
			}

			sc.close();

			System.out.println("Vowels           : " + vowels);
			System.out.println("Digits           : " + digits);
			System.out.println("Special Characters : " + special);

		} catch (FileNotFoundException e) {
			System.out.println("File not found.");
		}
	}

}
