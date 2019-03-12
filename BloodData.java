package com.maktab25.hw4.torabi.practice4;

public class BloodData {
    private String bloodType;
    private char factor;
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
    BloodData() {
        bloodType = "o";
        factor = '+';
    }

    BloodData(String bloodType, char factor) {
        this.bloodType = bloodType;
        this.factor = factor;
    }

}
