package com.javaproject.carrentalsystem;

public class Car {
	    private int carId;
	    private String brand;
	    double rentPerDay;
	    private boolean isAvailable;

	    public Car(int carId, String brand, double rentPerDay) {
	        this.carId = carId;
	        this.brand = brand;
	        this.rentPerDay = rentPerDay;
	        this.isAvailable = true;
	    }

	    // Getters
	    public int getCarId() {
	        return carId;
	    }

	    public String getBrand() {
	        return brand;
	    }

	    public double getRentPerDay() {
	        return rentPerDay;
	    }

	    public boolean isAvailable() {
	        return isAvailable;
	    }

	    // Setters
	    public void setCarId(int carId) {
	        this.carId = carId;
	    }

	    public void setBrand(String brand) {
	        this.brand = brand;
	    }

	    public void setRentPerDay(double rentPerDay) {
	        this.rentPerDay = rentPerDay;
	    }

	    public void setAvailable(boolean isAvailable) {
	        this.isAvailable = isAvailable;
	    }
	}

