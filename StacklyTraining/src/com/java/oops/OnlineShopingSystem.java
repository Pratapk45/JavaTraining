package com.java.oops;

import java.util.Scanner;

// Parent Class
class Product {
	protected int id;
	protected String name;
	protected double price;

	Product(int id, String name, double price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
}

// Child Class - Electronic Product
class ElectronicProduct extends Product {
	int warranty;
	String brand;

	ElectronicProduct(int id, String name, double price, int warranty, String brand) {
		super(id, name, price);
		this.warranty = warranty;
		this.brand = brand;
	}

	void display() {
		System.out.println("\n----- Electronic Product -----");
		System.out.println("Product ID : " + id);
		System.out.println("Name       : " + name);
		System.out.println("Brand      : " + brand);
		System.out.println("Price      : " + price);
		System.out.println("Warranty   : " + warranty + " Years");
	}
}

// Child Class - Clothing
class Clothing extends Product {
	String size;
	String color;

	Clothing(int id, String name, double price, String size, String color) {
		super(id, name, price);
		this.size = size;
		this.color = color;
	}

	void display() {
		System.out.println("\n----- Clothing -----");
		System.out.println("Product ID : " + id);
		System.out.println("Name       : " + name);
		System.out.println("Price      : " + price);
		System.out.println("Size       : " + size);
		System.out.println("Color      : " + color);
	}
}

// Child Class - Food
class Food extends Product {
	String expiryDate;
	double weight;

	Food(int id, String name, double price, String expiryDate, double weight) {
		super(id, name, price);
		this.expiryDate = expiryDate;
		this.weight = weight;
	}

	void display() {
		System.out.println("\n----- Food Product -----");
		System.out.println("Product ID : " + id);
		System.out.println("Name       : " + name);
		System.out.println("Price      : " + price);
		System.out.println("Expiry Date: " + expiryDate);
		System.out.println("Weight     : " + weight + " kg");
	}
}

public class OnlineShopingSystem {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("1. Electronic Product");
		System.out.println("2. Clothing");
		System.out.println("3. Food");
		System.out.print("Enter Product Type: ");
		int choice = sc.nextInt();

		System.out.print("Enter Product ID: ");
		int id = sc.nextInt();
		sc.nextLine();

		System.out.print("Enter Product Name: ");
		String name = sc.nextLine();

		System.out.print("Enter Product Price: ");
		double price = sc.nextDouble();

		switch (choice) {

		case 1:
			System.out.print("Enter Brand: ");
			sc.nextLine();
			String brand = sc.nextLine();

			System.out.print("Enter Warranty (Years): ");
			int warranty = sc.nextInt();

			ElectronicProduct e = new ElectronicProduct(id, name, price, warranty, brand);
			e.display();
			break;

		case 2:
			System.out.print("Enter Size: ");
			sc.nextLine();
			String size = sc.nextLine();

			System.out.print("Enter Color: ");
			String color = sc.nextLine();

			Clothing c = new Clothing(id, name, price, size, color);
			c.display();
			break;

		case 3:
			System.out.print("Enter Expiry Date: ");
			sc.nextLine();
			String expiry = sc.nextLine();

			System.out.print("Enter Weight (kg): ");
			double weight = sc.nextDouble();

			Food f = new Food(id, name, price, expiry, weight);
			f.display();
			break;

		default:
			System.out.println("Invalid Product Type");
		}

		sc.close();
	}

}
