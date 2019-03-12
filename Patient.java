package com.maktab25.hw4.torabi.practice4;

public class Patient {
    private int id;
    private int age;
    public int getAge() {
        return age;
    }

    public int getId() {
        return id;
    }
    private BloodData bloodData = new BloodData();
    public BloodData getBloodData() {
        return bloodData;
    }

    Patient() {
        id = 0;
        age = 0;
        bloodData.setBloodType("o");
        bloodData.setFactor('+');
    }

    Patient(int id, int age, BloodData bloodData1) {
        this.id = id;
        this.age = age;
        bloodData.setBloodType(bloodData1.getBloodType());
        bloodData.setFactor(bloodData1.getFactor());
    }


}