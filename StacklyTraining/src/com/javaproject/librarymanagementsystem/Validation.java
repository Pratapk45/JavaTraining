package com.javaproject.librarymanagementsystem;

public class Validation {

	    public static boolean validBookId(int id){

	        if(id<=0){
	            System.out.println("Invalid Book ID.");
	            return false;
	        }

	        return true;
	    }

	    public static boolean validName(String name){

	        if(name==null || name.trim().isEmpty()){

	            System.out.println("Invalid Input.");
	            return false;
	        }

	        return true;
	    }
	}
