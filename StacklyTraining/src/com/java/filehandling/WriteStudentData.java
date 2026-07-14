package com.java.filehandling;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class WriteStudentData {
	
	    public static void main(String[] args) throws IOException  {

	        Scanner sc = new Scanner(System.in);

	            FileWriter fw = new FileWriter("StudentData.txt");

	            System.out.print("Enter Student ID: ");
	            int id = sc.nextInt();
	            sc.nextLine();

	            System.out.print("Enter Student Name: ");
	            String name = sc.nextLine();

	            System.out.print("Enter Course: ");
	            String course = sc.nextLine();

	            System.out.print("Enter Marks: ");
	            double marks = sc.nextDouble();

	            fw.write("Student Details\n");
	            fw.write("-------------------------\n");
	            fw.write("Student ID : " + id + "\n");
	            fw.write("Student Name : " + name + "\n");
	            fw.write("Course : " + course + "\n");
	            fw.write("Marks : " + marks + "\n");

	            fw.close();
	            System.out.println("Student data written successfully to StudentData.txt");

	       

	        sc.close();
	    }
	}

