package com.maktab25.hw4.torabi.practice2;

public class FormLetterWriter {

    static void displaySalutation(String lastName) {
        System.out.println("Dear Mr. or Ms. " + lastName);
        System.out.println("  Thank you for your recent order"+"\n");

    }

    static void displaySalutation(String firstName, String lastName) {
        System.out.println("Dear " + firstName + " " + lastName);
        System.out.println("  Thank you for your recent order"+"\n");

    }
}