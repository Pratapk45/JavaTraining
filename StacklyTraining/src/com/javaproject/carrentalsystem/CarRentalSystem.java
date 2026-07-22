package com.javaproject.carrentalsystem;
import java.util.*;

public class CarRentalSystem {

	    static ArrayList<Car> cars = new ArrayList<>();
	    static ArrayList<Rental> rentals = new ArrayList<>();
	    static Scanner sc = new Scanner(System.in);

	    public static void main(String[] args) {

	        cars.add(new Car(1, "Hyundai", 1500));
	        cars.add(new Car(2, "Toyota", 2000));
	        cars.add(new Car(3, "Honda", 1800));

	        int choice;

	        do {

	            System.out.println("\n========== CAR RENTAL MANAGEMENT SYSTEM ==========");
	            System.out.println("1. Add Car");
	            System.out.println("2. View Available Cars");
	            System.out.println("3. Rent Car");
	            System.out.println("4. Return Car");
	            System.out.println("5. View Rented Cars");
	            System.out.println("6. Exit");
	            System.out.print("Enter Choice : ");

	            choice = sc.nextInt();

	            switch (choice) {

	                case 1:
	                    addCar();
	                    break;

	                case 2:
	                    showAvailableCars();
	                    break;

	                case 3:
	                    rentCar();
	                    break;

	                case 4:
	                    returnCar();
	                    break;

	                case 5:
	                    showRentedCars();
	                    break;

	                case 6:
	                    System.out.println("\nThank You for Using Car Rental System.");
	                    break;

	                default:
	                    System.out.println("Invalid Choice.");
	            }

	        } while (choice != 6);

	    }

	    static void addCar() {

	        System.out.print("Enter Car ID : ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        System.out.print("Enter Brand : ");
	        String brand = sc.nextLine();

	        System.out.print("Enter Rent Per Day : ");
	        double rent = sc.nextDouble();
	        
	        System.out.print("Enter model name  : ");

	        String s=sc.next();

	        cars.add(new Car(id, brand, rent));

	        System.out.println("Car Added Successfully.");
	    }

	    static void showAvailableCars() {

	        System.out.println("\nAvailable Cars");

	        boolean found = false;

	        for (Car car : cars) {

	            if (car.isAvailable()) {

	                System.out.println("--------------------------------");
	                System.out.println("Car ID : " + car.getCarId());
	                System.out.println("Brand  : " + car.getBrand());
	                System.out.println("Rent   : ₹" + car.getRentPerDay() + "/day");

	                found = true;
	            }
	        }

	        if (!found) {
	            System.out.println("No Cars Available.");
	        }
	    }

	    static void rentCar() {

	        System.out.print("Enter Car ID : ");
	        int id = sc.nextInt();
	        sc.nextLine();

	        for (Car car : cars) {

	            if (car.getCarId() == id && car.isAvailable()) {

	                System.out.print("Enter Customer Name : ");
	                String name = sc.nextLine();

	                System.out.print("Enter Number of Days : ");
	                int days = sc.nextInt();

	                Customer customer =
	                        new Customer(rentals.size() + 1, name);

	                Rental rental =
	                        new Rental(car, customer, days);

	                rentals.add(rental);
	                double totalRent = calculateRent(car.rentPerDay, days);

	                car.setAvailable(false);

	                System.out.println("\nCar Rented Successfully.");

	                System.out.println("Customer : " + customer.getName());
	                System.out.println("Car      : " + car.getBrand());
	                System.out.println("Days     : " + days);
	                System.out.println("Total Cost :"+totalRent);
	              //  System.out.println("Total Cost : ₹" + rental.getTotalCost());

	                return;
	            }

	        }

	        System.out.println("Car Not Available.");
	    }
	    static double calculateRent(double rentPerDay, int days) {
	        return rentPerDay * days;
	    }

	    static void returnCar() {

	        System.out.print("Enter Car ID : ");

	        int id = sc.nextInt();

	        Iterator<Rental> iterator = rentals.iterator();

	        while (iterator.hasNext()) {

	            Rental rental = iterator.next();

	            if (rental.getCar().getCarId() == id) {

	                rental.getCar().setAvailable(true);

	                iterator.remove();

	                System.out.println("Car Returned Successfully.");

	                return;
	            }

	        }

	        System.out.println("Invalid Car ID.");

	    }

	    static void showRentedCars() {

	        if (rentals.isEmpty()) {

	            System.out.println("No Cars are Currently Rented.");

	            return;
	        }

	        System.out.println("\nRented Cars");

	        for (Rental rental : rentals) {

	            System.out.println("--------------------------------");

	            System.out.println("Customer : " + rental.getCustomer().getName());

	            System.out.println("Car      : " + rental.getCar().getBrand());

	            System.out.println("Days     : " + rental.getDays());

	            System.out.println("Amount   : ₹" + rental.getTotalCost());

	        }

	    }

}
