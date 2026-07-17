package com.java.oops;
import java.util.Scanner;


interface CabBooking {
    void bookRide();
    void calculateFare();
}

abstract class Cab implements CabBooking {
    String customerName;
    double distance;

    Cab(String customerName, double distance) {
        this.customerName = customerName;
        this.distance = distance;
    }

    public void bookRide() {
        System.out.println("Ride Booked Successfully");
        System.out.println("Customer Name : " + customerName);
        System.out.println("Distance : " + distance + " km");
    }
}

class MiniCab extends Cab {

    MiniCab(String customerName, double distance) {
        super(customerName, distance);
    }

    public void calculateFare() {
        System.out.println("Mini Cab Fare : " + (distance * 12)+"Rs.");
    }
}

class AutoCab extends Cab {

    AutoCab(String customerName, double distance) {
        super(customerName, distance);
    }

    public void calculateFare() {
        System.out.println("Auto Cab Fare : " + (distance * 8)+"Rs.");
    }
}

class SedanCab extends Cab {

    SedanCab(String customerName, double distance) {
        super(customerName, distance);
    }

    public void calculateFare() {
        System.out.println("Sedan Cab Fare : " + (distance * 18)+"Rs.");
    }
}

public class CabBookingApp {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Distance: ");
        double distance = sc.nextDouble();

        System.out.println("1. Mini Cab");
        System.out.println("2. Auto Cab");
        System.out.println("3. Sedan Cab");
        System.out.print("Choose Cab: ");
        int choice = sc.nextInt();

        Cab cab = null;

        switch (choice) {
            case 1:
                cab = new MiniCab(name, distance);
                break;
            case 2:
                cab = new AutoCab(name, distance);
                break;
            case 3:
                cab = new SedanCab(name, distance);
                break;
            default:
                System.out.println("Invalid Choice");
                System.exit(0);
        }

        cab.bookRide();
        cab.calculateFare();

        sc.close();
    }
}