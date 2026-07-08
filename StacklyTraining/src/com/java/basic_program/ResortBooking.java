package com.java.basic_program;

import java.util.Scanner;

public class ResortBooking {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		        Scanner sc = new Scanner(System.in);

		        int roomType, mealType, days;
		        double roomCharge = 0, mealCharge = 0, totalBill;

		        System.out.println("===== RESORT BOOKING =====");
		        System.out.println("1. Deluxe Room");
		        System.out.println("2. Super Deluxe Room");
		        System.out.println("3. Suite Room");

		        System.out.print("Select Room Type: ");
		        roomType = sc.nextInt();

		        System.out.print("Enter Number of Days: ");
		        days = sc.nextInt();

		        switch (roomType) {

		            case 1:
		                roomCharge = 3000;

		                System.out.println("Select Meal Plan");
		                System.out.println("1. Breakfast (₹300/day)");
		                System.out.println("2. Breakfast + Dinner (₹700/day)");
		                mealType = sc.nextInt();

		                switch (mealType) {
		                    case 1:
		                        mealCharge = 300;
		                        break;
		                    case 2:
		                        mealCharge = 700;
		                        break;
		                    default:
		                        System.out.println("Invalid Meal Plan");
		                       // return;
		                }
		                break;

		            case 2:
		                roomCharge = 5000;

		                System.out.println("Select Meal Plan");
		                System.out.println("1. Breakfast (₹400/day)");
		                System.out.println("2. Breakfast + Dinner (₹900/day)");
		                mealType = sc.nextInt();

		                switch (mealType) {
		                    case 1:
		                        mealCharge = 400;
		                        break;
		                    case 2:
		                        mealCharge = 900;
		                        break;
		                    default:
		                        System.out.println("Invalid Meal Plan");
		                      //  return;
		                }
		                break;

		            case 3:
		                roomCharge = 8000;

		                System.out.println("Select Meal Plan");
		                System.out.println("1. Breakfast (₹500/day)");
		                System.out.println("2. Breakfast + Lunch + Dinner (₹1200/day)");
		                mealType = sc.nextInt();

		                switch (mealType) {
		                    case 1:
		                        mealCharge = 500;
		                        break;
		                    case 2:
		                        mealCharge = 1200;
		                        break;
		                    default:
		                        System.out.println("Invalid Meal Plan");
		                     //   return;
		                }
		                break;

		            default:
		                System.out.println("Invalid Room Type");
		                sc.close();
		              //  return;
		        }

		        totalBill = (roomCharge + mealCharge) * days;

		        if (days >= 5) {
		            totalBill = totalBill - (totalBill * 0.10);
		            System.out.println("10% Discount Applied");
		        }

		        System.out.println("\n===== BOOKING SUMMARY =====");
		        System.out.println("Room Charge per Day : " + roomCharge+"Rs.");
		        System.out.println("Meal Charge per Day : " + mealCharge+"Rs.");
		        System.out.println("Days                : " + days+"Rs.");
		        System.out.println("Total Bill          : " + totalBill+"Rs.");

		        sc.close();
		    }
		}

