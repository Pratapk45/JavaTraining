package com.java.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreateDelete {
	
	    public static void main(String[] args) {

	        File file = new File("sample.txt");

	        try {
	            // Create file
	            if (file.createNewFile()) {
	                System.out.println("File created: " + file.getName());
	            } else {
	                System.out.println("File already exists.");
	            }

	            // Delete file
	            if (file.delete()) {
	                System.out.println("File deleted successfully.");
	            } else {
	                System.out.println("Failed to delete file.");
	            }

	        } catch (IOException e) {
	            System.out.println("An error occurred.");
	            e.printStackTrace();
	        }
	    }

}
