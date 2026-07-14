package com.java.arrays;

import java.util.Scanner;

public class AreaForDifferentShapes {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		boolean isTrue=true;
		while(isTrue) {
			System.out.println("\nPlease Select the below shapes for areas : \n");
			System.out.println("===============================================");
			System.out.println("Square            ---------> Press '1' ");
			System.out.println("Rectangle         ---------> Press '2' ");
			System.out.println("Triangle          ---------> Press '3' ");
			System.out.println("Circle            ---------> Press '4' ");
			System.out.println("Parallelogram     ---------> Press '5' ");
			System.out.println("Exit              ---------> Press '0' ");
			System.out.println("===============================================");
			int choice=scan.nextInt();
			switch(choice) {
			case 1: System.out.println("\n===============================================");
			System.out.println("Please Enter Side of the Square : ");
			float side=scan.nextFloat();
			System.out.println("-------------------------------------");
			areaSquare(side);
			System.out.println("-------------------------------------");
			break;
			case 2: 
				System.out.println("\n===============================================");
				System.out.println("Please Enter Length of the Rectangle : ");
				float length=scan.nextFloat();
				System.out.println("Please Enter Width of the Rectangle : ");
				float width=scan.nextFloat();
				System.out.println("-------------------------------------");
				areaRectangle(length, width);
				System.out.println("-------------------------------------");

				break;
			case 3:System.out.println("\n===============================================");
			System.out.println("Please Enter Base of the Triangle : ");
			float base=scan.nextFloat();
			System.out.println("Please Enter Height of the Triangle : ");
			float height=scan.nextFloat();
			System.out.println("-------------------------------------");
			areaTriangle(base, height);
			System.out.println("-------------------------------------");

			break;
			case 4:System.out.println("\n===============================================");
			System.out.println("Please Enter Radius of the Circle : ");
			float radius=scan.nextFloat();
			System.out.println("-------------------------------------");
			areaCircle(radius);
			System.out.println("-------------------------------------");

			break;
			case 5:System.out.println("\n===============================================");
			System.out.println("Please Enter Base of the Parallelogram : ");
			float base1=scan.nextFloat();
			System.out.println("Please Enter Height of the Parallelogram : ");
			float height1=scan.nextFloat();
			System.out.println("-------------------------------------");
			areaParallelogram(base1, height1);
			System.out.println("-------------------------------------");

			break;
			case 0:System.out.println("\n===============================================");
			System.out.println("%%%%%%%%%%%%%%%% Thank you %%%%%%%%%%%%%%%%%%%");
			System.out.println("===============================================");
			isTrue=false;
			break;
			default:
				System.out.println("-------------------------------------");
				System.out.println("Please Enter Valid Choice");
				System.out.println("-------------------------------------");
				break;
			}
			if(!isTrue) {
				break;
			}
		}
		scan.close();
	}
	static void areaSquare(float side) {
		System.out.printf("Area For Square : %.2f\n",(side*side));
	}
	static void areaRectangle(float length, float width) {
		System.out.printf("Area For Rectangle : %.2f\n",(length*width));
	}
	static void areaTriangle(float base, float height) {
		System.out.printf("Area For Triangle : %.2f\n",(base*height));
	}
	static void areaCircle(float radius) {
		System.out.printf("Area For Circle : %.2f\n",(Math.PI*radius*radius));
	}
	static void areaParallelogram(float base, float height) {
		System.out.printf("Area For Parallelogram : %.2f\n",(base*height));
	}

}
