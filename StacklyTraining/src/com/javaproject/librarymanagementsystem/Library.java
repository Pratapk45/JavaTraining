package com.javaproject.librarymanagementsystem;
import java.time.LocalDate;
import java.util.*;

public class Library {

    ArrayList<Book> books = new ArrayList<>();

    HashMap<String, Book> issuedBooks = new HashMap<>();

    HashMap<String, LocalDate> issueDate = new HashMap<>();

    // Add Book

    public void addBook(Book book){

    	 for (Book b : books) {

    	        if (b.getBookId() == book.getBookId()) {

    	            System.out.println("Book ID already exists.");
    	            return;
    	        }
    	    }

    	    books.add(book);

    	    System.out.println("Book added successfully.");
    }

    // Display Books

    public void displayBooks(){

        if(books.isEmpty()){

            System.out.println("No Books Available.");
            return;
        }

        for(Book b : books){

            System.out.println("------------------------");

            System.out.println(b);
        }

    }

    // Search Book

    public Book searchBook(int id){

        for(Book b : books){

            if(b.getBookId()==id){

                return b;
            }
        }

        return null;
    }

    // Issue Book

    public void issueBook(int id,String student){

        Book book = searchBook(id);

        if(book==null){

            System.out.println("Book Not Found.");
            return;
        }

        if(book.isIssued()){

            System.out.println("Book Already Issued.");
            return;
        }

        book.setIssued(true);

        issuedBooks.put(student, book);

        issueDate.put(student, LocalDate.now());
        

        System.out.println("Book Issued Successfully.");
        
    }

    // Return Book

    public void returnBook(String student){

        if(!issuedBooks.containsKey(student)){

            System.out.println("No Book Issued.");
            return;
        }

        Book book = issuedBooks.get(student);

        book.setIssued(false);

        LocalDate date = issueDate.get(student);

        double fine = FineCalculator.calculateFine(date);

        System.out.println("Book Returned Successfully.");

        System.out.println("Fine = Rs."+fine);

        issuedBooks.remove(student);

        issueDate.remove(student);

    }

}
