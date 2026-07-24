package com.javaproject.librarymanagementsystem;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class FineCalculator {

	    public static double calculateFine(LocalDate issueDate) {

	        LocalDate returnDate = LocalDate.now();

	        long days = ChronoUnit.DAYS.between(issueDate, returnDate);

	        if(days<=7)
	            return 0;

	        return (days-7)*10;
	    }
	}

