package com.maktab25.hw4.torabi.practice4;

import java.util.Scanner;

public class TestPatient {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Patient.MAX_AGE = 120;
        System.out.println("Enter ID");
        int id = scanner.nextInt();
        System.out.println("Enter age");
        int age;
        String bloodType;
        char factor;
        while (true) {
            age = scanner.nextInt();
            if (age > Patient.MAX_AGE)
                System.out.println("This is more than Max Age" + "\n" + "Enter another one");
            else
                break;
        }
        Scanner scanner1=new Scanner(System.in);
        System.out.println("Enter Blood type");
        while (true) {
            bloodType = scanner1.nextLine();
            if ((bloodType.equalsIgnoreCase("AB") || bloodType.equalsIgnoreCase("A") || bloodType.equalsIgnoreCase("B") || bloodType.equalsIgnoreCase("O")))
                break;
            System.out.println("This blood Type is not valid" + "\n" + "Enter another one");
        }
        System.out.println("Enter Blood factor");

        while (true) {
            factor = scanner1.nextLine().charAt(0);
            if (factor == '+' || factor == '-')
                break;
            else
                System.out.println("This blood factor is not valid" + "\n" + "Enter another one");
        }
        Patient patient = new Patient(id, age, new BloodData(bloodType, factor));
        if (patient.getBloodData().getBloodType() != null && (patient.getBloodData().getFactor() == '+' || patient.getBloodData().getFactor() == '-')) {
            System.out.println("ID:" + patient.getId());
            System.out.println("Age:" + patient.getAge());
            System.out.println(patient.getBloodData().getBloodType() + patient.getBloodData().getFactor());
        }


    }
}
