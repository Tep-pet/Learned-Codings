package com.mycompany.mavenproject8;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println();
        int choice = scan.nextInt();
        scan.nextLine();

        if (choice == 1) {
            System.out.println();
            String id = scan.nextLine();

            System.out.println();
            String fname = scan.nextLine();

            System.out.println();
            String lname = scan.nextLine();

            System.out.println();
            double height = scan.nextDouble();

            System.out.println();
            double weight = scan.nextDouble();
            scan.nextLine(); // Consume newline left by nextDouble()

            Patient patient = new Patient(fname, lname, id, height, weight);

            System.out.println("\nPatient Information:");
            System.out.println("ID: " + patient.getpatientid());
            System.out.println("Name: " + patient.getfname() + " " + patient.getlname());
            System.out.println("Height: " + patient.getheight() + " cm");
            System.out.println("Weight: " + patient.getweight() + " kg");

        } else if (choice == 2) {
            System.out.println();
            String doctorFname = scan.nextLine();

            System.out.println();
            String doctorLname = scan.nextLine();

            System.out.println();
            String specialization = scan.nextLine();

            Doctor doctor = new Doctor(doctorFname, doctorLname, specialization);

            System.out.println("\nDoctor Details:");
            System.out.println("Name: " + doctor.getfname() + " " + doctor.getlname());
            System.out.println("Specialization: " + doctor.getspecialization());
        }
    }
}

