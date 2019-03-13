package com.maktab25.hw4.torabi.practice4;

import java.util.Scanner;

public class TestBloodData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String bloodType;
        char factor;
        System.out.println("Enter Blood Type");
        while (true) {
            bloodType = scanner.nextLine();
            if ((bloodType.equalsIgnoreCase("AB") || bloodType.equalsIgnoreCase("A") || bloodType.equalsIgnoreCase("B") || bloodType.equalsIgnoreCase("O")))
                break;
            else
                System.out.println("This blood Type is not valid" + "\n" + "Enter another one");
        }
        System.out.println("Enter factor:+ or -");
        while (true) {
            factor = scanner.nextLine().charAt(0);
            if (factor == '+' || factor == '-')
                break;
            else
                System.out.println("This blood factor is not valid" + "\n" + "Enter another one");
        }
        BloodData bloodData = new BloodData(bloodType, factor);
        System.out.println(bloodData.getBloodType() + bloodData.getFactor());

    }
}
