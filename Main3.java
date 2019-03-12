package com.maktab25.hw4.torabi.practice3;

public class Main3 {
    public static void main(String[] args) {
        System.out.println(Billing.computeBill("p"));;
        System.out.println(Billing.computeBill("p",2));;
        Billing.setPhotoBookPrice(154);
        System.out.println(Billing.computeBill("p",2,100));;
    }
}
