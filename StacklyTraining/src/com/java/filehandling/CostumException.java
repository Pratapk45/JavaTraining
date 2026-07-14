package com.java.filehandling;

	class InvalidAgeException extends Exception {

	    public InvalidAgeException(String message) {
	        super(message);
	    }
	}

	public class CostumException {
	    public static void main(String[] args) {

	        int age = 16;

	        try {
	            if (age < 18) {
	                throw new InvalidAgeException("Age must be 18 or above.");
	            }

	            System.out.println("Eligible to vote.");

	        } catch (InvalidAgeException e) {
	            System.out.println(e.getMessage());
	            System.out.println(e.toString());
	           // System.out.println(e.printStackTrace());
	           
	        }
	    }

}
