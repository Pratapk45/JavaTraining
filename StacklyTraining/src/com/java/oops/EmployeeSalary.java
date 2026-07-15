package com.java.oops;

import java.util.Scanner;

import java.util.Scanner;

//Parent Class
class Employee {
	protected int id;
	protected String name;
	protected double basicSalary;

	Employee(int id, String name, double basicSalary) {
		this.id = id;
		this.name = name;
		this.basicSalary = basicSalary;
	}
}

//Child Class - Manager
class Manager extends Employee {

	Manager(int id, String name, double basicSalary) {
		super(id, name, basicSalary);
	}

	void calculateSalary() {
		double hra = basicSalary * 0.20;
		double da = basicSalary * 0.10;
		double salary = basicSalary + hra + da;

		System.out.println("\n----- Manager Salary -----");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("Net Salary : " + salary);
	}
}

//Child Class - Developer
class Developer extends Employee {

	Developer(int id, String name, double basicSalary) {
		super(id, name, basicSalary);
	}

	void calculateSalary() {
		double hra = basicSalary * 0.15;
		double da = basicSalary * 0.08;
		double salary = basicSalary + hra + da;

		System.out.println("\n----- Developer Salary -----");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("Net Salary : " + salary);
	}
}

//Child Class - Intern
class Intern extends Employee {

	Intern(int id, String name, double basicSalary) {
		super(id, name, basicSalary);
	}

	void calculateSalary() {
		double stipend = basicSalary * 0.05;
		double salary = basicSalary + stipend;

		System.out.println("\n----- Intern Salary -----");
		System.out.println("ID : " + id);
		System.out.println("Name : " + name);
		System.out.println("Basic Salary : " + basicSalary);
		System.out.println("Net Salary : " + salary);
	}
}

//Main Class
public class EmployeeSalary {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Employee ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Employee Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Basic Salary: ");
		double basicSalary = sc.nextDouble();

		System.out.println("\nSelect Employee Role");
		System.out.println("1. Manager");
		System.out.println("2. Developer");
		System.out.println("3. Intern");
		System.out.print("Enter Choice: ");
		int choice = sc.nextInt();

		switch (choice) {

		case 1:
			Manager m = new Manager(id, name, basicSalary);
			m.calculateSalary();
			break;

		case 2:
			Developer d = new Developer(id, name, basicSalary);
			d.calculateSalary();
			break;

		case 3:
			Intern i = new Intern(id, name, basicSalary);
			i.calculateSalary();
			break;

		default:
			System.out.println("Invalid Role");
		}

		sc.close();
	}
}
