package com.java.oops;
import java.util.Scanner;

interface FoodDelivery {
    void orderFood();
    void calculateBill();
}

abstract class Customer implements FoodDelivery {

    String customerName;
    String customerAddress;

    Customer(String customerName, String customerAddress) {
        this.customerName = customerName;
        this.customerAddress = customerAddress;
    }

    public void orderFood() {
        System.out.println("Order Placed Successfully");
        System.out.println("Customer : " + customerName);
        System.out.println("Address : " + customerAddress);
    }
}

class VegFood extends Customer {

    VegFood(String name, String address) {
        super(name, address);
    }

    public void calculateBill() {
        System.out.println("Veg Food Bill : 250"+"Rs.");
    }
}

class NonVegFood extends Customer {

    NonVegFood(String name, String address) {
        super(name, address);
    }

    public void calculateBill() {
        System.out.println("Non-Veg Food Bill : 450"+"Rs.");
    }
}

class FastFood extends Customer {

    FastFood(String name, String address) {
        super(name, address);
    }

    public void calculateBill() {
        System.out.println("Fast Food Bill : 180"+"Rs.");
    }
}

public class FoodDeliveryApp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.println("1. Veg Food");
        System.out.println("2. Non-Veg Food");
        System.out.println("3. Fast Food");
        System.out.print("Choose Food: ");
        int choice = sc.nextInt();

        Customer customer = null;

        switch (choice) {
            case 1:
                customer = new VegFood(name, address);
                break;
            case 2:
                customer = new NonVegFood(name, address);
                break;
            case 3:
                customer = new FastFood(name, address);
                break;
            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }

        customer.orderFood();
        customer.calculateBill();

        sc.close();
    }
}
