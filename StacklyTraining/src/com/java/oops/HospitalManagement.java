package com.java.oops;
import java.util.Scanner;

class Patient {

    private int patientId;
    private String patientName;
    private String disease;
    private double billAmount;

    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public void setDisease(String disease) {
        this.disease = disease;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public int getPatientId() {
        return patientId;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDisease() {
        return disease;
    }

    public double getBillAmount() {
        return billAmount;
    }
}

public class HospitalManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Patient p = new Patient();

        System.out.print("Enter Patient ID: ");
        p.setPatientId(sc.nextInt());

        sc.nextLine();

        System.out.print("Enter Patient Name: ");
        p.setPatientName(sc.nextLine());

        System.out.print("Enter Disease: ");
        p.setDisease(sc.nextLine());

        System.out.print("Enter Bill Amount: ");
        p.setBillAmount(sc.nextDouble());

        System.out.println("\n----- Patient Record -----");
        System.out.println("Patient ID : " + p.getPatientId());
        System.out.println("Patient Name : " + p.getPatientName());
        System.out.println("Disease : " + p.getDisease());
        System.out.println("Bill Amount : " + p.getBillAmount()+"Rs.");

        sc.close();
    }
}