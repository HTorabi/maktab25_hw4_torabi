package com.maktab25.hw4.torabi.practice4;

public class BloodData {
    private String bloodType;
    private char factor;

    BloodData() {
        bloodType = "O";
        factor = '+';
    }

    BloodData(String bloodType, char factor) {
        this.bloodType = bloodType.toUpperCase();

        this.factor = factor;


    }

    public void setBloodType(String bloodType) {
        this.bloodType = bloodType;
    }

    public void setFactor(char factor) {
        this.factor = factor;
    }

    public char getFactor() {
        return factor;
    }

    public String getBloodType() {
        return bloodType;
    }
}
