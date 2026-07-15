package com.java.oops;
import java.util.Scanner;

class CarRent {

    // Rent by hours
    void calculateRent(int hours) {
        double rent = hours * 200;
        System.out.println("Rent for " + hours + " hours = " + rent+"Rs.");
    }

    // Rent by days
    void calculateRent(int days, double ratePerDay) {
        double rent = days * ratePerDay;
        System.out.println("Rent for " + days + " days = " + rent+" Rs.");
    }

    // Rent by days with driver
    void calculateRent(int days, double ratePerDay, boolean driver) {
        double rent = days * ratePerDay;

        if (driver) {
            rent += days * 500;   // Driver charge ₹500/day
            System.out.println("Driver Included");
        } else {
            System.out.println("Driver Not Included");
        }

        System.out.println("Total Rent = " + rent+" Rs.");
    }
}

public class CarRental {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        CarRent car = new CarRent();

        System.out.println("1. Rent by Hours");
        System.out.println("2. Rent by Days");
        System.out.println("3. Rent by Days with Driver");
        System.out.print("Enter Choice: ");
        int choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter Hours: ");
                int hours = sc.nextInt();
                car.calculateRent(hours);
                break;

            case 2:
                System.out.print("Enter Days: ");
                int days = sc.nextInt();
                System.out.print("Enter Rate Per Day: ");
                double rate = sc.nextDouble();
                car.calculateRent(days, rate);
                break;

            case 3:
                System.out.print("Enter Days: ");
                int d = sc.nextInt();
                System.out.print("Enter Rate Per Day: ");
                double r = sc.nextDouble();
                System.out.print("Driver Required (true/false): ");
                boolean driver = sc.nextBoolean();
                car.calculateRent(d, r, driver);
                break;

            default:
                System.out.println("Invalid Choice");
        }

        sc.close();
    }
}
