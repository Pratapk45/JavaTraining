package com.java.filehandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ReadStudentData {

	    public static void main(String[] args) throws FileNotFoundException {

	            File file = new File("StudentData.txt");
	            Scanner sc = new Scanner(file);

	            while (sc.hasNextLine()) {
	                System.out.println(sc.nextLine());
	            }

	            sc.close();

	    }
	}

