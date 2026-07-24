package com.javaproject.librarymanagementsystem;

import java.util.Scanner;

public class LibraryManagementSystem {

	    public static void main(String[] args) {

	        Scanner sc = new Scanner(System.in);

	        Library library = new Library();
	        library.addBook(new Book(101 ,"Operating Systems"," Greg Gagne"));
	        library.addBook(new Book(102 ,"Java Programing"," James Gosling"));
	        library.addBook(new Book(103 ,"Python Programing","Eric Matthes"));
	     

	        while(true){

	            System.out.println("\n===== LIBRARY MANAGEMENT SYSTEM =====");

	            System.out.println("1.Add Book");

	            System.out.println("2.Display Books");

	            System.out.println("3.Search Book");

	            System.out.println("4.Issue Book");

	            System.out.println("5.Return Book");

	            System.out.println("6.Exit");

	            System.out.print("Enter Choice : ");

	            int choice = sc.nextInt();

	            switch(choice){

	                case 1:

	                    System.out.print("Book ID : ");

	                    int id = sc.nextInt();

	                    if(!Validation.validBookId(id))
	                        break;

	                    sc.nextLine();

	                    System.out.print("Book Title : ");

	                    String title = sc.nextLine();

	                    if(!Validation.validName(title))
	                        break;

	                    System.out.print("Author : ");

	                    String author = sc.nextLine();

	                    if(!Validation.validName(author))
	                        break;

	                    library.addBook(new Book(id,title,author));

	                    break;

	                case 2:

	                    library.displayBooks();

	                    break;

	                case 3:

	                    System.out.print("Enter Book ID : ");

	                    int searchId = sc.nextInt();

	                    Book b = library.searchBook(searchId);

	                    if(b!=null)

	                        System.out.println(b);

	                    else

	                        System.out.println("Book Not Found.");

	                    break;

	                case 4:

	                    System.out.print("Book ID : ");

	                    int issueId = sc.nextInt();

	                    sc.nextLine();

	                    System.out.print("Student Name : ");

	                    String student = sc.nextLine();

	                    library.issueBook(issueId,student);

	                    break;

	                case 5:

	                    sc.nextLine();

	                    System.out.print("Student Name : ");

	                    String name = sc.nextLine();

	                    library.returnBook(name);

	                    break;

	                case 6:

	                    System.out.println("Thank You.");

	                    System.exit(0);

	                default:

	                    System.out.println("Invalid Choice.");
	            }

	        }

	    }

}
