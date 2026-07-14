package com.java.arrays;

import java.util.Scanner;

public class EmpSalProcessing {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Enter Number Of Employees : ");
		int employees=scan.nextInt();
		
		System.out.println("Enter Number of months : ");
		int months=scan.nextInt();
		
		System.out.println("Enter Salaries: ");
		double salary[][]=new double[employees][months];
		
		double totalSalary[]=new double[employees];
		
		System.out.println("=============================================\n");
		for(int i=0;i<employees;i++) {
			System.out.println("Employee - "+(i+1));
			System.out.println("------------------------------");
			double total=0;
			for(int j=0;j<months;j++) {
				System.out.println("Month - "+(j+1)+":");
				salary[i][j]=scan.nextDouble();
				total+=salary[i][j];
			}
			totalSalary[i]=total;
		}
		System.out.println("==========================Employee Salary Report=============================");
		System.out.print("Employee\t");
		for(int j=0;j<months;j++) {
			System.out.print("Month - "+(j+1)+"\t");
		}
		System.out.print("Total Salary\t\n");
		for(int i=0;i<employees;i++) {
			System.out.print((i+1)+"\t\t");
			for(int j=0;j<months;j++) {
				System.out.printf("%.2f\t",salary[i][j]);
			}
			System.out.printf("%.2f\t\n",totalSalary[i]);
		}
		double maxSalary=totalSalary[0];
		int employeeIndex=0;
		for(int i=1;i<employees;i++) {
			if(totalSalary[i]>maxSalary) {
				maxSalary=totalSalary[i];
				employeeIndex=i;
			}
		}
		System.out.println("\n=========================================================================\n");
		System.out.println("Highest Salary Employees : ");
		System.out.println("\n============================================================================\n");
		for(int i=0;i<employees;i++) {
			if(totalSalary[i]==maxSalary) {
				System.out.println("Employee : "+(i+1));
			}
		}
		System.out.println("\nTotal Salary : "+totalSalary[employeeIndex]);				
		scan.close();	
	}

}
