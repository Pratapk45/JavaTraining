package com.java.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class CountWord {
	
	    public static void main(String[] args) throws FileNotFoundException {

	        int wordCount = 0;

	            File file = new File("StudentData.txt");
	            Scanner sc = new Scanner(file);

	            while (sc.hasNext()) {
	            	 String word = sc.next();   // Read one word
	                 System.out.println(wordCount+1+" :"+word);  // Print the word
	                wordCount++;    // Increase count
	              
	            }

	            System.out.println("Total number of words: " + wordCount);
	       
	            sc.close();

	    }
	}

