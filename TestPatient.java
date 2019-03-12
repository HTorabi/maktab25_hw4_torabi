package com.maktab25.hw4.torabi.practice4;

public class TestPatient {
    public static void main(String[] args) {
        Patient patient=new Patient(1,25,new BloodData("ab",'+'));
        System.out.println(patient.getBloodData().getFactor());;
    }
}
