package com.java.basic_program;

import java.util.Scanner;

public class StringFunctions {

	public static void main(String[] args) {
		

		
		        Scanner sc = new Scanner(System.in);

		        System.out.print("Enter first string: ");
		        String str1 = sc.nextLine();

		        System.out.print("Enter second string: ");
		        String str2 = sc.nextLine();

		        // length()
		        System.out.println("Length: " + str1.length());

		        // toUpperCase()
		        System.out.println("Uppercase: " + str1.toUpperCase());

		        // toLowerCase()
		        System.out.println("Lowercase: " + str1.toLowerCase());

		        // charAt()
		        System.out.println("Character at index 2: " + str1.charAt(2));

		        // concat()
		        System.out.println("Concatenation: " + str1.concat(str2));

		        // equals()
		        System.out.println("Equals: " + str1.equals(str2));

		        // equalsIgnoreCase()
		        System.out.println("Equals Ignore Case: " + str1.equalsIgnoreCase(str2));

		        // compareTo()
		        System.out.println("Compare To: " + str1.compareTo(str2));

		        // contains()
		        System.out.println("Contains 'Java': " + str1.contains("Java"));

		        // startsWith()
		        System.out.println("Starts With 'J': " + str1.startsWith("J"));

		        // endsWith()
		        System.out.println("Ends With 'a': " + str1.endsWith("a"));

		        // substring()
		        System.out.println("Substring (1 to 4): " + str1.substring(1, 4));

		        // indexOf()
		        System.out.println("Index of 'a': " + str1.indexOf('a'));

		        // lastIndexOf()
		        System.out.println("Last Index of 'a': " + str1.lastIndexOf('a'));

		        // replace()
		        System.out.println("Replace 'a' with 'x': " + str1.replace('a', 'x'));

		        // trim()
		        System.out.println("Trim: " + str1.trim());

		        // isEmpty()
		        System.out.println("Is Empty: " + str1.isEmpty());

		        // split()
		        String[] words = str1.split(" ");
		        System.out.println("Words:");
		        for (String word : words) {
		            System.out.println(word);
		        }

		        sc.close();
		    }

	}

